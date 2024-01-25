// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessGroupShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BusinessGroupDesc")
    public String businessGroupDesc;

    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("CloudResourceTypeId")
    public String cloudResourceTypeId;

    @NameInMap("DealType")
    public Integer dealType;

    @NameInMap("InstanceList")
    public String instanceListShrink;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("UpdateUser")
    public String updateUser;

    public static UpdateBusinessGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessGroupShrinkRequest self = new UpdateBusinessGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessGroupShrinkRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdateBusinessGroupShrinkRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public UpdateBusinessGroupShrinkRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public UpdateBusinessGroupShrinkRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public UpdateBusinessGroupShrinkRequest setCloudResourceTypeId(String cloudResourceTypeId) {
        this.cloudResourceTypeId = cloudResourceTypeId;
        return this;
    }
    public String getCloudResourceTypeId() {
        return this.cloudResourceTypeId;
    }

    public UpdateBusinessGroupShrinkRequest setDealType(Integer dealType) {
        this.dealType = dealType;
        return this;
    }
    public Integer getDealType() {
        return this.dealType;
    }

    public UpdateBusinessGroupShrinkRequest setInstanceListShrink(String instanceListShrink) {
        this.instanceListShrink = instanceListShrink;
        return this;
    }
    public String getInstanceListShrink() {
        return this.instanceListShrink;
    }

    public UpdateBusinessGroupShrinkRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateBusinessGroupShrinkRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public UpdateBusinessGroupShrinkRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

}
