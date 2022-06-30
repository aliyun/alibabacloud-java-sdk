// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateMigrationGroupRequest extends TeaModel {
    // 详细描述
    @NameInMap("description")
    public String description;

    // 扩充字段（json结构）
    @NameInMap("extra")
    public String extra;

    @NameInMap("id")
    public Integer id;

    // 名称
    @NameInMap("name")
    public String name;

    @NameInMap("regionId")
    public String regionId;

    public static CreateMigrationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationGroupRequest self = new CreateMigrationGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMigrationGroupRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public CreateMigrationGroupRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateMigrationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMigrationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
