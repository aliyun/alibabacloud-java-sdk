// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErAttachmentRequest extends TeaModel {
    @NameInMap("AutoReceiveAllRoute")
    public Boolean autoReceiveAllRoute;

    @NameInMap("ErAttachmentName")
    public String erAttachmentName;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceTenantId")
    public String resourceTenantId;

    public static CreateErAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateErAttachmentRequest self = new CreateErAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateErAttachmentRequest setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
        this.autoReceiveAllRoute = autoReceiveAllRoute;
        return this;
    }
    public Boolean getAutoReceiveAllRoute() {
        return this.autoReceiveAllRoute;
    }

    public CreateErAttachmentRequest setErAttachmentName(String erAttachmentName) {
        this.erAttachmentName = erAttachmentName;
        return this;
    }
    public String getErAttachmentName() {
        return this.erAttachmentName;
    }

    public CreateErAttachmentRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public CreateErAttachmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateErAttachmentRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateErAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateErAttachmentRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

}
