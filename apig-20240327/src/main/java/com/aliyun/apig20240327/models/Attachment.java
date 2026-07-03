// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Attachment extends TeaModel {
    /**
     * <p>attachResourceId</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>The list of mounted resource IDs.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>The list of parent IDs of the mounted resource.</p>
     */
    @NameInMap("attachResourceParentIds")
    public java.util.List<String> attachResourceParentIds;

    /**
     * <p>The type of mount point supported by the policy. Valid values:</p>
     * <ul>
     * <li>HttpApi: HttpApi.</li>
     * <li>Operation: Operation of HttpApi.</li>
     * <li>GatewayRoute: gateway route.</li>
     * <li>GatewayService: gateway service.</li>
     * <li>GatewayServicePort: gateway service port.</li>
     * <li>Domain: gateway domain name.</li>
     * <li>Gateway: gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The environment to which the mounted resource belongs. If the environment ID is *, the mounted resource of the policy is not associated with any environment.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The gateway to which the mounted resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpr4f9dlhtgq5ksfgmb0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The policy mount ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pr-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("policyAttachmentId")
    public String policyAttachmentId;

    public static Attachment build(java.util.Map<String, ?> map) throws Exception {
        Attachment self = new Attachment();
        return TeaModel.build(map, self);
    }

    public Attachment setAttachResourceId(String attachResourceId) {
        this.attachResourceId = attachResourceId;
        return this;
    }
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    public Attachment setAttachResourceIds(java.util.List<String> attachResourceIds) {
        this.attachResourceIds = attachResourceIds;
        return this;
    }
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    public Attachment setAttachResourceParentIds(java.util.List<String> attachResourceParentIds) {
        this.attachResourceParentIds = attachResourceParentIds;
        return this;
    }
    public java.util.List<String> getAttachResourceParentIds() {
        return this.attachResourceParentIds;
    }

    public Attachment setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public Attachment setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public Attachment setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public Attachment setPolicyAttachmentId(String policyAttachmentId) {
        this.policyAttachmentId = policyAttachmentId;
        return this;
    }
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

}
