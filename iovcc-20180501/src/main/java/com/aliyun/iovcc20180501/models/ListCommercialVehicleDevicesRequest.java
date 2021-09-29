// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCommercialVehicleDevicesRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 查询开始页
    @NameInMap("PageIndex")
    public Long pageIndex;

    // 每页记录数
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("HardwareId")
    public String hardwareId;

    @NameInMap("ClientId")
    public String clientId;

    public static ListCommercialVehicleDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialVehicleDevicesRequest self = new ListCommercialVehicleDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListCommercialVehicleDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListCommercialVehicleDevicesRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListCommercialVehicleDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCommercialVehicleDevicesRequest setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }
    public String getHardwareId() {
        return this.hardwareId;
    }

    public ListCommercialVehicleDevicesRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
