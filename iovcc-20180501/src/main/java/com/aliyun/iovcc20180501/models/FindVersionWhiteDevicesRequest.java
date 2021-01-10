// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionWhiteDevicesRequest extends TeaModel {
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

    public static FindVersionWhiteDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindVersionWhiteDevicesRequest self = new FindVersionWhiteDevicesRequest();
        return TeaModel.build(map, self);
    }

    public FindVersionWhiteDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindVersionWhiteDevicesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public FindVersionWhiteDevicesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public FindVersionWhiteDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public FindVersionWhiteDevicesRequest setOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }
    public String getOriginalId() {
        return this.originalId;
    }

    public FindVersionWhiteDevicesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindVersionWhiteDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
