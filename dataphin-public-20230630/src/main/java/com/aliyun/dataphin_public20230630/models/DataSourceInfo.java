// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DataSourceInfo extends TeaModel {
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Env")
    public String env;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Type")
    public String type;

    public static DataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
        DataSourceInfo self = new DataSourceInfo();
        return TeaModel.build(map, self);
    }

    public DataSourceInfo setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public DataSourceInfo setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DataSourceInfo setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DataSourceInfo setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public DataSourceInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataSourceInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DataSourceInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataSourceInfo setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public DataSourceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataSourceInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DataSourceInfo setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DataSourceInfo setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DataSourceInfo setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public DataSourceInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
