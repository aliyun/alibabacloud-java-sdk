// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionBlackDevicesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("OriginalId")
    public String originalId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static FindVersionBlackDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindVersionBlackDevicesRequest self = new FindVersionBlackDevicesRequest();
        return TeaModel.build(map, self);
    }

    public FindVersionBlackDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindVersionBlackDevicesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public FindVersionBlackDevicesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public FindVersionBlackDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public FindVersionBlackDevicesRequest setOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }
    public String getOriginalId() {
        return this.originalId;
    }

    public FindVersionBlackDevicesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindVersionBlackDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
