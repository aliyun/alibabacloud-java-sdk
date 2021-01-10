// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindOsVersionsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("DeviceModelId")
    public String deviceModelId;

    @NameInMap("SystemVersion")
    public String systemVersion;

    @NameInMap("Status")
    public String status;

    @NameInMap("IsMilestone")
    public String isMilestone;

    @NameInMap("Remark")
    public String remark;

    public static FindOsVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        FindOsVersionsRequest self = new FindOsVersionsRequest();
        return TeaModel.build(map, self);
    }

    public FindOsVersionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindOsVersionsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindOsVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindOsVersionsRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public FindOsVersionsRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public FindOsVersionsRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

    public FindOsVersionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FindOsVersionsRequest setIsMilestone(String isMilestone) {
        this.isMilestone = isMilestone;
        return this;
    }
    public String getIsMilestone() {
        return this.isMilestone;
    }

    public FindOsVersionsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
