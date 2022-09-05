// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDrivePermissionRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("DownloadEndUserIds")
    public java.util.List<String> downloadEndUserIds;

    @NameInMap("DownloadUploadEndUserIds")
    public java.util.List<String> downloadUploadEndUserIds;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCloudDrivePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDrivePermissionRequest self = new ModifyCloudDrivePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDrivePermissionRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCloudDrivePermissionRequest setDownloadEndUserIds(java.util.List<String> downloadEndUserIds) {
        this.downloadEndUserIds = downloadEndUserIds;
        return this;
    }
    public java.util.List<String> getDownloadEndUserIds() {
        return this.downloadEndUserIds;
    }

    public ModifyCloudDrivePermissionRequest setDownloadUploadEndUserIds(java.util.List<String> downloadUploadEndUserIds) {
        this.downloadUploadEndUserIds = downloadUploadEndUserIds;
        return this;
    }
    public java.util.List<String> getDownloadUploadEndUserIds() {
        return this.downloadUploadEndUserIds;
    }

    public ModifyCloudDrivePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
