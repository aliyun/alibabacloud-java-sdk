// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Attachment extends TeaModel {
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    @NameInMap("attachResourceType")
    public String attachResourceType;

    @NameInMap("environmentId")
    public String environmentId;

    @NameInMap("gatewayId")
    public String gatewayId;

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
