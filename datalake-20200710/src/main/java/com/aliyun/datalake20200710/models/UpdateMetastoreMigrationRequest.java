// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateMetastoreMigrationRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetastoreInfo")
    public String metastoreInfo;

    @NameInMap("MetastoreType")
    public String metastoreType;

    @NameInMap("Name")
    public String name;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("RunOptions")
    public String runOptions;

    public static UpdateMetastoreMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetastoreMigrationRequest self = new UpdateMetastoreMigrationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetastoreMigrationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateMetastoreMigrationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMetastoreMigrationRequest setMetastoreInfo(String metastoreInfo) {
        this.metastoreInfo = metastoreInfo;
        return this;
    }
    public String getMetastoreInfo() {
        return this.metastoreInfo;
    }

    public UpdateMetastoreMigrationRequest setMetastoreType(String metastoreType) {
        this.metastoreType = metastoreType;
        return this;
    }
    public String getMetastoreType() {
        return this.metastoreType;
    }

    public UpdateMetastoreMigrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMetastoreMigrationRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public UpdateMetastoreMigrationRequest setRunOptions(String runOptions) {
        this.runOptions = runOptions;
        return this;
    }
    public String getRunOptions() {
        return this.runOptions;
    }

}
