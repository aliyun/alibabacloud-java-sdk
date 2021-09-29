// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCommercialVehicleDevicesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("VehicleDevices")
    public ListCommercialVehicleDevicesResponseBodyVehicleDevices vehicleDevices;

    public static ListCommercialVehicleDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialVehicleDevicesResponseBody self = new ListCommercialVehicleDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommercialVehicleDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommercialVehicleDevicesResponseBody setVehicleDevices(ListCommercialVehicleDevicesResponseBodyVehicleDevices vehicleDevices) {
        this.vehicleDevices = vehicleDevices;
        return this;
    }
    public ListCommercialVehicleDevicesResponseBodyVehicleDevices getVehicleDevices() {
        return this.vehicleDevices;
    }

    public static class ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPageCount")
        public Long totalPageCount;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination self = new ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination();
            return TeaModel.build(map, self);
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination setTotalPageCount(Long totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListCommercialVehicleDevicesResponseBodyVehicleDevicesList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("ClientId")
        public Long clientId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("OnlineStatus")
        public Long onlineStatus;

        @NameInMap("PlateNumber")
        public String plateNumber;

        public static ListCommercialVehicleDevicesResponseBodyVehicleDevicesList build(java.util.Map<String, ?> map) throws Exception {
            ListCommercialVehicleDevicesResponseBodyVehicleDevicesList self = new ListCommercialVehicleDevicesResponseBodyVehicleDevicesList();
            return TeaModel.build(map, self);
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setClientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }
        public Long getClientId() {
            return this.clientId;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setOnlineStatus(Long onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Long getOnlineStatus() {
            return this.onlineStatus;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesList setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

    }

    public static class ListCommercialVehicleDevicesResponseBodyVehicleDevices extends TeaModel {
        @NameInMap("Pagination")
        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination pagination;

        @NameInMap("List")
        public java.util.List<ListCommercialVehicleDevicesResponseBodyVehicleDevicesList> list;

        public static ListCommercialVehicleDevicesResponseBodyVehicleDevices build(java.util.Map<String, ?> map) throws Exception {
            ListCommercialVehicleDevicesResponseBodyVehicleDevices self = new ListCommercialVehicleDevicesResponseBodyVehicleDevices();
            return TeaModel.build(map, self);
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevices setPagination(ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListCommercialVehicleDevicesResponseBodyVehicleDevicesPagination getPagination() {
            return this.pagination;
        }

        public ListCommercialVehicleDevicesResponseBodyVehicleDevices setList(java.util.List<ListCommercialVehicleDevicesResponseBodyVehicleDevicesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCommercialVehicleDevicesResponseBodyVehicleDevicesList> getList() {
            return this.list;
        }

    }

}
