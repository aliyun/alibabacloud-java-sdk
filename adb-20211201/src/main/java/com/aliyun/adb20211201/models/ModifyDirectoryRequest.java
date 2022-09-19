// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDirectoryRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DirectoryId")
    public Long directoryId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDirectoryRequest self = new ModifyDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDirectoryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDirectoryRequest setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public Long getDirectoryId() {
        return this.directoryId;
    }

    public ModifyDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDirectoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ModifyDirectoryRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ModifyDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
