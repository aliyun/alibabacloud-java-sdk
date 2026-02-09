// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Attachment extends TeaModel {
    /**
     * <p>The resource IDs.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>The supported mount point type. Valid values:</p>
     * <ul>
     * <li>HttpApi: an HTTP API</li>
     * <li>Operation: an operation in an HTTP API</li>
     * <li>GatewayRoute: a gateway route</li>
     * <li>GatewayService: a gateway service</li>
     * <li>GatewayServicePort: a gateway service port</li>
     * <li>Domain: a gateway domain name</li>
     * <li>Gateway: a gateway instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The environment to which the mounted resource belongs. If an asterisk (\*) is returned as the environment ID, the mounted resource is not related to the environment.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The instance to which the mounted resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpr4f9dlhtgq5ksfgmb0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The mount ID.</p>
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

    public Attachment setAttachResourceIds(java.util.List<String> attachResourceIds) {
        this.attachResourceIds = attachResourceIds;
        return this;
    }
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
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
