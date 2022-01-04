// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateMetastoreMigrationRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

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

    public static CreateMetastoreMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetastoreMigrationRequest self = new CreateMetastoreMigrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetastoreMigrationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateMetastoreMigrationRequest setMetastoreInfo(String metastoreInfo) {
        this.metastoreInfo = metastoreInfo;
        return this;
    }
    public String getMetastoreInfo() {
        return this.metastoreInfo;
    }

    public CreateMetastoreMigrationRequest setMetastoreType(String metastoreType) {
        this.metastoreType = metastoreType;
        return this;
    }
    public String getMetastoreType() {
        return this.metastoreType;
    }

    public CreateMetastoreMigrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetastoreMigrationRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateMetastoreMigrationRequest setRunOptions(String runOptions) {
        this.runOptions = runOptions;
        return this;
    }
    public String getRunOptions() {
        return this.runOptions;
    }

}
