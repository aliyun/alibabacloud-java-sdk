// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionGroupDevicesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("OriginalId")
    public String originalId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static FindVersionGroupDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindVersionGroupDevicesRequest self = new FindVersionGroupDevicesRequest();
        return TeaModel.build(map, self);
    }

    public FindVersionGroupDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public FindVersionGroupDevicesRequest setOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }
    public String getOriginalId() {
        return this.originalId;
    }

    public FindVersionGroupDevicesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public FindVersionGroupDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FindVersionGroupDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public FindVersionGroupDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
