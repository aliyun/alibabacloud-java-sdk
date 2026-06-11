// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Attachment extends TeaModel {
    /**
     * <p>The attachment point ID.</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>A list of attached resource IDs.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>A list of parent resource IDs.</p>
     */
    @NameInMap("attachResourceParentIds")
    public java.util.List<String> attachResourceParentIds;

    /**
     * <p>The supported attachment point types for the policy.</p>
     * <ul>
     * <li><p><code>HttpApi</code>: An HTTP API.</p>
     * </li>
     * <li><p><code>Operation</code>: An operation of an HTTP API.</p>
     * </li>
     * <li><p><code>GatewayRoute</code>: A gateway route.</p>
     * </li>
     * <li><p><code>GatewayService</code>: A gateway service.</p>
     * </li>
     * <li><p><code>GatewayServicePort</code>: A gateway service port.</p>
     * </li>
     * <li><p><code>Domain</code>: A gateway domain.</p>
     * </li>
     * <li><p><code>Gateway</code>: A gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The ID of the environment for the attached resource. An asterisk (<code>*</code>) indicates that the policy attachment is not environment-specific.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The ID of the gateway for the attached resource.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpr4f9dlhtgq5ksfgmb0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The policy attachment ID.</p>
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
