// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteDirectoryRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DirectoryId")
    public Long directoryId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoryRequest self = new DeleteDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteDirectoryRequest setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public Long getDirectoryId() {
        return this.directoryId;
    }

    public DeleteDirectoryRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public DeleteDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
