// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdBusinessGroupRequest extends TeaModel {
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
    public java.util.List<String> instanceList;

    @NameInMap("CloudResourceTypeId")
    public String cloudResourceTypeId;

    @NameInMap("DealType")
    public Integer dealType;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdBusinessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdBusinessGroupRequest self = new UpdBusinessGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdBusinessGroupRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public UpdBusinessGroupRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdBusinessGroupRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public UpdBusinessGroupRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public UpdBusinessGroupRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public UpdBusinessGroupRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

    public UpdBusinessGroupRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public UpdBusinessGroupRequest setCloudResourceTypeId(String cloudResourceTypeId) {
        this.cloudResourceTypeId = cloudResourceTypeId;
        return this;
    }
    public String getCloudResourceTypeId() {
        return this.cloudResourceTypeId;
    }

    public UpdBusinessGroupRequest setDealType(Integer dealType) {
        this.dealType = dealType;
        return this;
    }
    public Integer getDealType() {
        return this.dealType;
    }

    public UpdBusinessGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
