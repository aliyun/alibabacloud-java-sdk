// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStandardGroupRequest extends TeaModel {
    // The type of the database engine. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
    @NameInMap("DbType")
    public String dbType;

    // The description of the security rule set.
    @NameInMap("Description")
    public String description;

    // The name of the security rule set.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the tenant.
    @NameInMap("Tid")
    public Long tid;

    public static CreateStandardGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardGroupRequest self = new CreateStandardGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardGroupRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public CreateStandardGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStandardGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateStandardGroupRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
