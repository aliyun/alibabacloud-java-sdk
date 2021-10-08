// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddBusinessGroupRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("BusinessGroupDesc")
    public String businessGroupDesc;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("CreateUser")
    public String createUser;

    @NameInMap("UpdateUser")
    public String updateUser;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("OperaUid")
    public String operaUid;

    public static AddBusinessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessGroupRequest self = new AddBusinessGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddBusinessGroupRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public AddBusinessGroupRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public AddBusinessGroupRequest setBusinessGroupDesc(String businessGroupDesc) {
        this.businessGroupDesc = businessGroupDesc;
        return this;
    }
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    public AddBusinessGroupRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public AddBusinessGroupRequest setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }
    public String getCreateUser() {
        return this.createUser;
    }

    public AddBusinessGroupRequest setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

    public AddBusinessGroupRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public AddBusinessGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
