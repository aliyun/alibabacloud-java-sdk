// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListEdgeDevicesRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 查询开始页
    @NameInMap("PageIndex")
    public Long pageIndex;

    // 每页记录数
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("HostDeviceId")
    public String hostDeviceId;

    @NameInMap("EdgeDeviceType")
    public Long edgeDeviceType;

    @NameInMap("EdgeDeviceName")
    public String edgeDeviceName;

    public static ListEdgeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDevicesRequest self = new ListEdgeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListEdgeDevicesRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListEdgeDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEdgeDevicesRequest setHostDeviceId(String hostDeviceId) {
        this.hostDeviceId = hostDeviceId;
        return this;
    }
    public String getHostDeviceId() {
        return this.hostDeviceId;
    }

    public ListEdgeDevicesRequest setEdgeDeviceType(Long edgeDeviceType) {
        this.edgeDeviceType = edgeDeviceType;
        return this;
    }
    public Long getEdgeDeviceType() {
        return this.edgeDeviceType;
    }

    public ListEdgeDevicesRequest setEdgeDeviceName(String edgeDeviceName) {
        this.edgeDeviceName = edgeDeviceName;
        return this;
    }
    public String getEdgeDeviceName() {
        return this.edgeDeviceName;
    }

}
