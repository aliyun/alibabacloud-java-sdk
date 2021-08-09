// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetAppInstancesRequest extends TeaModel {
    // 当前页码，最小值为1，最大限制为200
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 页面大小。最大限制为500
    @NameInMap("PageSize")
    public Integer pageSize;

    // 地域ID
    @NameInMap("RegionId")
    public String regionId;

    // 部署类型，取值 Docker/ECS， 不传默认查询全部
    @NameInMap("DeviceType")
    public String deviceType;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // ECS实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 宿主机ECS IP或K8S私网IP
    @NameInMap("Ip")
    public String ip;

    // 单元唯一标识
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 单元格唯一标识
    @NameInMap("CellFlag")
    public String cellFlag;

    // 可用区ID
    @NameInMap("ZoneId")
    public String zoneId;

    // MSHA命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    public static GetAppInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstancesRequest self = new GetAppInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAppInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAppInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAppInstancesRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public GetAppInstancesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAppInstancesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetAppInstancesRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public GetAppInstancesRequest setCellFlag(String cellFlag) {
        this.cellFlag = cellFlag;
        return this;
    }
    public String getCellFlag() {
        return this.cellFlag;
    }

    public GetAppInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public GetAppInstancesRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

}
