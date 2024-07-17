// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DatabaseInput extends TeaModel {
    @NameInMap("CreateTime")
    public Integer createTime;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>oss://examplebuket/exampledb</p>
     */
    @NameInMap("LocationUri")
    public String locationUri;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("Parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("Privileges")
    public PrincipalPrivilegeSet privileges;

    public static DatabaseInput build(java.util.Map<String, ?> map) throws Exception {
        DatabaseInput self = new DatabaseInput();
        return TeaModel.build(map, self);
    }

    public DatabaseInput setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DatabaseInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatabaseInput setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public DatabaseInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DatabaseInput setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DatabaseInput setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DatabaseInput setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public DatabaseInput setPrivileges(PrincipalPrivilegeSet privileges) {
        this.privileges = privileges;
        return this;
    }
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

}
