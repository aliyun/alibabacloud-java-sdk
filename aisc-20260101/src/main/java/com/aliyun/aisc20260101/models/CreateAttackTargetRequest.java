// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateAttackTargetRequest extends TeaModel {
    /**
     * <p>The API key for the target model service, used to authenticate with the endpoint. The key is encrypted and stored after submission. Subsequent queries do not return the plaintext value. When ConnectionMethod is set to enterprise_relay, the actual credentials are held by the corporate internal network agent. Transmit the key over HTTPS and avoid exposing it in plaintext in logs, URLs, or client code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-abcd1234****</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The advanced connection configuration in JSON string format. Common fields: authType (authentication type. custom_header: custom request header authentication. none: no authentication), customAuthHeaderName (custom authentication header name, such as X-API-Key), and requestHeaders (additional HTTP request header key-value pairs).</p>
     * <p>Common provider configuration templates ({{prompt}} is a prompt placeholder that you replace with the actual service value. When authType is set to bearer, the token is injected from ApiKey and the template does not contain credentials):</p>
     * <ul>
     * <li>Bailian: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;input\&quot;:{\&quot;prompt\&quot;:\&quot;{{prompt}}\&quot;},\&quot;parameters\&quot;:{\&quot;incremental_output\&quot;:true},\&quot;debug\&quot;:{}}&quot;,&quot;messageJsonPath&quot;:&quot;$.output.text&quot;,&quot;requestHeaders&quot;:&quot;{\&quot;X-DashScope-SSE\&quot;: \&quot;enable\&quot; }&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * <li>PAI: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:60000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{\&quot;question\&quot;:\&quot;{{prompt}}\&quot;,\&quot;chat_history\&quot;:[]},\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.outputs.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * <li>Dify: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;inputs\&quot;:{},\&quot;query\&quot;:\&quot;{{prompt}}\&quot;,\&quot;response_mode\&quot;:\&quot;streaming\&quot;,\&quot;conversation_id\&quot;:\&quot;\&quot;,\&quot;user\&quot;:\&quot;scanner\&quot;}&quot;,&quot;messageJsonPath&quot;:&quot;$.answer&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}</li>
     * <li>AgentRun: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;custom_header&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}],\&quot;stream\&quot;:true}&quot;,&quot;messageJsonPath&quot;:&quot;$.choices[0].delta.content&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;customAuthHeaderName&quot;:&quot;X-API-Key&quot;,&quot;stream&quot;:true}</li>
     * <li>AgentKit: {&quot;httpMethod&quot;:&quot;POST&quot;,&quot;authType&quot;:&quot;bearer&quot;,&quot;timeoutMs&quot;:30000,&quot;requestTemplate&quot;:&quot;{\&quot;messages\&quot;:[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;{{prompt}}\&quot;}]}&quot;,&quot;messageJsonPath&quot;:&quot;$.content.parts[0].text&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;stream&quot;:true,&quot;customAuthHeaderName&quot;:&quot;&quot;}
     * When ConnectionMethod is set to enterprise_relay, you can use the protocol field to specify the tunnel protocol (defaults to openai). The provider configuration templates above apply only to non-enterprise_relay connections.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;httpMethod\&quot;:\&quot;POST\&quot;,\&quot;authType\&quot;:\&quot;bearer\&quot;,\&quot;timeoutMs\&quot;:30000,\&quot;requestTemplate\&quot;:\&quot;{\\\&quot;input\\\&quot;:{\\\&quot;prompt\\\&quot;:\\\&quot;{{prompt}}\\\&quot;},\\\&quot;parameters\\\&quot;:{\\\&quot;incremental_output\\\&quot;:true},\\\&quot;debug\\\&quot;:{}}\&quot;,\&quot;messageJsonPath\&quot;:\&quot;$.output.text\&quot;,\&quot;requestHeaders\&quot;:\&quot;{\\\&quot;X-DashScope-SSE\\\&quot;: \\\&quot;enable\\\&quot; }\&quot;,\&quot;stream\&quot;:true,\&quot;customAuthHeaderName\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("ConnectionConfig")
    public String connectionConfig;

    /**
     * <p>The connection protocol type for the target service. The system selects the corresponding protocol adapter based on this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("ConnectionMethod")
    public String connectionMethod;

    /**
     * <p>An optional description of the scan target usage.</p>
     * 
     * <strong>example:</strong>
     * <p>Bailian application in the production environment</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The HTTP or HTTPS endpoint address of the target model service. When ConnectionMethod is set to enterprise_relay, this value is ignored and the platform uses a fixed internal endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The name of the target model. When ConnectionMethod is set to openai, specify the model ID under the OpenAI compatible protocol. When ConnectionMethod is set to anthropic, specify the model ID for the Anthropic Messages API. When ConnectionMethod is set to enterprise_relay, this value is ignored and the platform uses a fixed value.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-flash</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The business label of the model or agent provider, used for UI filtering and form display. This is decoupled from ConnectionMethod (technical protocol): the same Provider may use multiple protocols, and vice versa.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The display name of the scan target, used for list display and filtering. Use a distinguishable name within the same tenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My Bailian Target</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The type of the scan target, which determines the sampling dimension for scan tasks. Valid values:</p>
     * <ul>
     * <li>agent: agent-type samples.</li>
     * <li>model: model-type samples.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateAttackTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackTargetRequest self = new CreateAttackTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateAttackTargetRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateAttackTargetRequest setConnectionConfig(String connectionConfig) {
        this.connectionConfig = connectionConfig;
        return this;
    }
    public String getConnectionConfig() {
        return this.connectionConfig;
    }

    public CreateAttackTargetRequest setConnectionMethod(String connectionMethod) {
        this.connectionMethod = connectionMethod;
        return this;
    }
    public String getConnectionMethod() {
        return this.connectionMethod;
    }

    public CreateAttackTargetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAttackTargetRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateAttackTargetRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateAttackTargetRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateAttackTargetRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public CreateAttackTargetRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
