// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSecurityIpsRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("WhileList")
    public String whileList;

    public static ModifyDBInstanceSecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSecurityIpsRequest self = new ModifyDBInstanceSecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSecurityIpsRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ModifyDBInstanceSecurityIpsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDBInstanceSecurityIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDBInstanceSecurityIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSecurityIpsRequest setWhileList(String whileList) {
        this.whileList = whileList;
        return this;
    }
    public String getWhileList() {
        return this.whileList;
    }

}
