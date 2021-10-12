// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSecurityIpsRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupName")
    public String groupName;

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

    public ModifyDBInstanceSecurityIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDBInstanceSecurityIpsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDBInstanceSecurityIpsRequest setWhileList(String whileList) {
        this.whileList = whileList;
        return this;
    }
    public String getWhileList() {
        return this.whileList;
    }

}
