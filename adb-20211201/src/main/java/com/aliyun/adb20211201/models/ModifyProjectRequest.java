// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyProjectRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectRequest self = new ModifyProjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyProjectRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ModifyProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
