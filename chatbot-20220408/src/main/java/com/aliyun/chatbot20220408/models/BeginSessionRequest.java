// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SandBox")
    public Boolean sandBox;

    @NameInMap("VendorParam")
    public String vendorParam;

    public static BeginSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionRequest self = new BeginSessionRequest();
        return TeaModel.build(map, self);
    }

    public BeginSessionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public BeginSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BeginSessionRequest setSandBox(Boolean sandBox) {
        this.sandBox = sandBox;
        return this;
    }
    public Boolean getSandBox() {
        return this.sandBox;
    }

    public BeginSessionRequest setVendorParam(String vendorParam) {
        this.vendorParam = vendorParam;
        return this;
    }
    public String getVendorParam() {
        return this.vendorParam;
    }

}
