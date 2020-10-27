// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportSnapshotRequest extends TeaModel {
    @NameInMap("SnapshotName")
    @Validation(required = true)
    public String snapshotName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OssBucket")
    @Validation(required = true)
    public String ossBucket;

    @NameInMap("OssObject")
    @Validation(required = true)
    public String ossObject;

    @NameInMap("RoleName")
    public String roleName;

    public static ImportSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSnapshotRequest self = new ImportSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public ImportSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public ImportSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportSnapshotRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public ImportSnapshotRequest setOssObject(String ossObject) {
        this.ossObject = ossObject;
        return this;
    }
    public String getOssObject() {
        return this.ossObject;
    }

    public ImportSnapshotRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
