// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListHostDevicesRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 查询开始页
    @NameInMap("PageIndex")
    public Long pageIndex;

    // 每页记录数
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("DeviceName")
    public String deviceName;

    public static ListHostDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostDevicesRequest self = new ListHostDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListHostDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListHostDevicesRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListHostDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListHostDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListHostDevicesRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ListHostDevicesRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
