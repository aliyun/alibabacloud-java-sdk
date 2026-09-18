// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class TestConnectivityRequest extends TeaModel {
    /**
     * <p>The API key for the target model service, used to authenticate with the Endpoint. If TargetId is specified, the system reads the key from the encrypted target configuration. This parameter is required if TargetId is empty. Transmit the key over HTTPS and avoid exposing it in plaintext in logs, URLs, or client code.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-abcd1234****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The tracking identifier of the connectivity test. Do not specify this parameter for the first call. The system generates and returns it in the response. For subsequent calls, specify this value to query the latest status of the corresponding test.</p>
     * 
     * <strong>example:</strong>
     * <p>conn-a1b2c3d4e5f67890</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    /**
     * <p>The advanced connection configuration in JSON string format. Common fields: authType (authentication type. custom_header indicates custom request header authentication. none indicates no authentication), customAuthHeaderName (custom authentication header name, such as X-API-Key), and requestHeaders (additional HTTP request header key-value pairs).</p>
     * <p>Common provider configuration templates ({{prompt}} is the prompt placeholder. Replace it with the actual service value. When authType is set to bearer, the token is injected from ApiKey, and the template does not contain credentials):</p>
     * <ul>
     * <li>Bailian: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;input\&quot;:{\&quot;prompt\&quot;:\&quot;{{prompt}}\&quot;},\&quot;parameters\&quot;:{\&quot;incremental_output\&quot;:true},\&quot;debug\&quot;:{}}&quot;,&quot;messageJsonPath&quot;:&quot;$.output.text&quot;,&quot;requestHeaders&quot;:&quot;{\&quot;X-DashScope-SSE\&quot;: \&quot;enable\&quot; }&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * <li>PAI: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:60000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{\&quot;question\&quot;:\&quot;{{prompt}}\&quot;,\&quot;chat_history\&quot;:[]},\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.outputs.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * <li>Dify: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{},\&quot;query\&quot;:\&quot;{{prompt}}\&quot;,\&quot;response_mode\&quot;:\&quot;streaming\&quot;,\&quot;conversation_id\&quot;:\&quot;\&quot;,\&quot;user\&quot;:\&quot;scanner\&quot;}&quot;,&quot;messageJsonPath&quot;:&quot;$.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * <li>AgentRun: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;custom_header&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}],\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.choices[0].delta.content&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;customAuthHeaderName&quot;:&quot;X-API-Key&quot;,&quot;stream&quot;:true}</li>
     * <li>AgentKit: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}]}&quot;,&quot;messageJsonPath&quot;:&quot;$.content.parts[0].text&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;httpMethod\&quot;:\&quot;POST\&quot;,\&quot;authType\&quot;:\&quot;bearer\&quot;,\&quot;timeoutMs\&quot;:30000,\&quot;requestTemplate\&quot;:\&quot;{\\\&quot;input\\\&quot;:{\\\&quot;prompt\\\&quot;:\\\&quot;{{prompt}}\\\&quot;},\\\&quot;parameters\\\&quot;:{\\\&quot;incremental_output\\\&quot;:true},\\\&quot;debug\\\&quot;:{}}\&quot;,\&quot;messageJsonPath\&quot;:\&quot;$.output.text\&quot;,\&quot;requestHeaders\&quot;:\&quot;{\\\&quot;X-DashScope-SSE\\\&quot;: \\\&quot;enable\\\&quot; }\&quot;,\&quot;stream\&quot;:true,\&quot;customAuthHeaderName\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("ConnectionConfig")
    public String connectionConfig;

    /**
     * <p>The connection protocol type of the target service. The system selects the corresponding protocol adapter to initiate the test based on this value. Default value: openai.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("ConnectionMethod")
    public String connectionMethod;

    /**
     * <p>The HTTP or HTTPS endpoint address of the target model service. This parameter is required if TargetId is empty.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The name of the target model. If ConnectionMethod is set to openai, specify the model ID under the OpenAI compatible protocol. If ConnectionMethod is set to anthropic, specify the model ID for the Anthropic Messages API. This parameter is required if the scan target is a model and TargetId is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-flash</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The unique identifier of the attack target. If specified, the system reads Endpoint, ApiKey, ModelName, ConnectionMethod, and ConnectionConfig from the target configuration and ignores any parameters with the same names in the request. If not specified, provide the connection parameters directly in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>target-abc123def4567</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static TestConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        TestConnectivityRequest self = new TestConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public TestConnectivityRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public TestConnectivityRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public TestConnectivityRequest setConnectionConfig(String connectionConfig) {
        this.connectionConfig = connectionConfig;
        return this;
    }
    public String getConnectionConfig() {
        return this.connectionConfig;
    }

    public TestConnectivityRequest setConnectionMethod(String connectionMethod) {
        this.connectionMethod = connectionMethod;
        return this;
    }
    public String getConnectionMethod() {
        return this.connectionMethod;
    }

    public TestConnectivityRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public TestConnectivityRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public TestConnectivityRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
