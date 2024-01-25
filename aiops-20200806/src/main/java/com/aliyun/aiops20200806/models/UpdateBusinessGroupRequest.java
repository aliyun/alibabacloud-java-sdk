// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessGroupRequest extends TeaModel {
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
    public java.util.List<String> instanceList;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("UpdateUser")
    public String updateUser;

    public static UpdateBusinessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessGroupRequest self = new UpdateBusinessGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessGroupRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdateBusinessGroupRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public UpdateBusinessGroupRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public UpdateBusinessGroupRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public UpdateBusinessGroupRequest setCloudResourceTypeId(String cloudResourceTypeId) {
        this.cloudResourceTypeId = cloudResourceTypeId;
        return this;
    }
    public String getCloudResourceTypeId() {
        return this.cloudResourceTypeId;
    }

    public UpdateBusinessGroupRequest setDealType(Integer dealType) {
        this.dealType = dealType;
        return this;
    }
    public Integer getDealType() {
        return this.dealType;
    }

    public UpdateBusinessGroupRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public UpdateBusinessGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateBusinessGroupRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public UpdateBusinessGroupRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

}
