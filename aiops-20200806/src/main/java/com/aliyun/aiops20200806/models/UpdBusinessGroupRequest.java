// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdBusinessGroupRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BusinessGroupDesc")
    public String businessGroupDesc;

    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("UpdateUser")
    public String updateUser;

    public static UpdBusinessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdBusinessGroupRequest self = new UpdBusinessGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdBusinessGroupRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdBusinessGroupRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public UpdBusinessGroupRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public UpdBusinessGroupRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public UpdBusinessGroupRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
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

}
