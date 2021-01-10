// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindAppVersionsRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("DeviceModelId")
    public String deviceModelId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Remark")
    public String remark;

    public static FindAppVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        FindAppVersionsRequest self = new FindAppVersionsRequest();
        return TeaModel.build(map, self);
    }

    public FindAppVersionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FindAppVersionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindAppVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindAppVersionsRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public FindAppVersionsRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public FindAppVersionsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindAppVersionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public FindAppVersionsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
