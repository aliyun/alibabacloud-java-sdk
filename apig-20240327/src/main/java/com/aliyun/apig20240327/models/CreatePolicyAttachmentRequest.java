// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePolicyAttachmentRequest extends TeaModel {
    /**
     * <p>Attached resource ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-cu07jj6m1hkokaus***</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>Attached resource type, such as HttpApi, GatewayRoute, Operation, GatewayService, GatewayServicePort, Gateway, Domain</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>Environment ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cquqsollhtgid***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Gateway instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6qas***</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Policy ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-cq787etlhtghrptjg***</p>
     */
    @NameInMap("policyId")
    public String policyId;

    public static CreatePolicyAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyAttachmentRequest self = new CreatePolicyAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyAttachmentRequest setAttachResourceId(String attachResourceId) {
        this.attachResourceId = attachResourceId;
        return this;
    }
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    public CreatePolicyAttachmentRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public CreatePolicyAttachmentRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreatePolicyAttachmentRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreatePolicyAttachmentRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
