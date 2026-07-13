// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateAtiAgentRegisterInfoShrinkRequest extends TeaModel {
    /**
     * <p>The description of the agent capabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>支付服务</p>
     */
    @NameInMap("AgentDescription")
    public String agentDescription;

    /**
     * <p>The display name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试Agent</p>
     */
    @NameInMap("AgentDisplayName")
    public String agentDisplayName;

    /**
     * <p>The endpoint domain name through which the agent provides services.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <p>The version of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>Provides idempotency. Within 3 minutes, the same value takes effect only once.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The endpoint information of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;EndpointValue\&quot;:\&quot;<a href="http://www.baidu.com%5C%5C%22,%5C%5C%22EndpointType%5C%5C%22:%5C%5C%22http%5C%5C%22%7D%5D">http://www.baidu.com\\&quot;,\\&quot;EndpointType\\&quot;:\\&quot;http\\&quot;}]</a></p>
     */
    @NameInMap("Endpoints")
    public String endpointsShrink;

    /**
     * <p>The ID of the verified registrant. Obtain this ID by invoking the identity verification API operation or from the ATS console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2072277378616354816</p>
     */
    @NameInMap("RegistrantId")
    public String registrantId;

    public static CreateAtiAgentRegisterInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAtiAgentRegisterInfoShrinkRequest self = new CreateAtiAgentRegisterInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setAgentDescription(String agentDescription) {
        this.agentDescription = agentDescription;
        return this;
    }
    public String getAgentDescription() {
        return this.agentDescription;
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setAgentDisplayName(String agentDisplayName) {
        this.agentDisplayName = agentDisplayName;
        return this;
    }
    public String getAgentDisplayName() {
        return this.agentDisplayName;
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setAgentHost(String agentHost) {
        this.agentHost = agentHost;
        return this;
    }
    public String getAgentHost() {
        return this.agentHost;
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setEndpointsShrink(String endpointsShrink) {
        this.endpointsShrink = endpointsShrink;
        return this;
    }
    public String getEndpointsShrink() {
        return this.endpointsShrink;
    }

    public CreateAtiAgentRegisterInfoShrinkRequest setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }
    public String getRegistrantId() {
        return this.registrantId;
    }

}
