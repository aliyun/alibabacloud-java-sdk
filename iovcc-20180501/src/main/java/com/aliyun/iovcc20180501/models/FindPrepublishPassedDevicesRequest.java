// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishPassedDevicesRequest extends TeaModel {
    @NameInMap("PrepublishId")
    public String prepublishId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DeviceId")
    public String deviceId;

    public static FindPrepublishPassedDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishPassedDevicesRequest self = new FindPrepublishPassedDevicesRequest();
        return TeaModel.build(map, self);
    }

    public FindPrepublishPassedDevicesRequest setPrepublishId(String prepublishId) {
        this.prepublishId = prepublishId;
        return this;
    }
    public String getPrepublishId() {
        return this.prepublishId;
    }

    public FindPrepublishPassedDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindPrepublishPassedDevicesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindPrepublishPassedDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindPrepublishPassedDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
