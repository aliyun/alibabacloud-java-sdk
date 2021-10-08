// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdBusinessGroupShrinkRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("BusinessGroupDesc")
    public String businessGroupDesc;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("UpdateUser")
    public String updateUser;

    @NameInMap("InstanceList")
    public String instanceListShrink;

    @NameInMap("CloudResourceTypeId")
    public String cloudResourceTypeId;

    @NameInMap("DealType")
    public Integer dealType;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdBusinessGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdBusinessGroupShrinkRequest self = new UpdBusinessGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdBusinessGroupShrinkRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public UpdBusinessGroupShrinkRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdBusinessGroupShrinkRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public UpdBusinessGroupShrinkRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public UpdBusinessGroupShrinkRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public UpdBusinessGroupShrinkRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

    public UpdBusinessGroupShrinkRequest setInstanceListShrink(String instanceListShrink) {
        this.instanceListShrink = instanceListShrink;
        return this;
    }
    public String getInstanceListShrink() {
        return this.instanceListShrink;
    }

    public UpdBusinessGroupShrinkRequest setCloudResourceTypeId(String cloudResourceTypeId) {
        this.cloudResourceTypeId = cloudResourceTypeId;
        return this;
    }
    public String getCloudResourceTypeId() {
        return this.cloudResourceTypeId;
    }

    public UpdBusinessGroupShrinkRequest setDealType(Integer dealType) {
        this.dealType = dealType;
        return this;
    }
    public Integer getDealType() {
        return this.dealType;
    }

    public UpdBusinessGroupShrinkRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
