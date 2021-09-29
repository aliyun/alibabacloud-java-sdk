// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListHostDevicesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("HostDevices")
    public ListHostDevicesResponseBodyHostDevices hostDevices;

    public static ListHostDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostDevicesResponseBody self = new ListHostDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostDevicesResponseBody setHostDevices(ListHostDevicesResponseBodyHostDevices hostDevices) {
        this.hostDevices = hostDevices;
        return this;
    }
    public ListHostDevicesResponseBodyHostDevices getHostDevices() {
        return this.hostDevices;
    }

    public static class ListHostDevicesResponseBodyHostDevicesPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPageCount")
        public Long totalPageCount;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListHostDevicesResponseBodyHostDevicesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListHostDevicesResponseBodyHostDevicesPagination self = new ListHostDevicesResponseBodyHostDevicesPagination();
            return TeaModel.build(map, self);
        }

        public ListHostDevicesResponseBodyHostDevicesPagination setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListHostDevicesResponseBodyHostDevicesPagination setTotalPageCount(Long totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListHostDevicesResponseBodyHostDevicesPagination setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListHostDevicesResponseBodyHostDevicesPagination setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListHostDevicesResponseBodyHostDevicesList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Status")
        public Long status;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("ActivateTime")
        public Long activateTime;

        public static ListHostDevicesResponseBodyHostDevicesList build(java.util.Map<String, ?> map) throws Exception {
            ListHostDevicesResponseBodyHostDevicesList self = new ListHostDevicesResponseBodyHostDevicesList();
            return TeaModel.build(map, self);
        }

        public ListHostDevicesResponseBodyHostDevicesList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListHostDevicesResponseBodyHostDevicesList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListHostDevicesResponseBodyHostDevicesList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListHostDevicesResponseBodyHostDevicesList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListHostDevicesResponseBodyHostDevicesList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListHostDevicesResponseBodyHostDevicesList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListHostDevicesResponseBodyHostDevicesList setActivateTime(Long activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public Long getActivateTime() {
            return this.activateTime;
        }

    }

    public static class ListHostDevicesResponseBodyHostDevices extends TeaModel {
        @NameInMap("Pagination")
        public ListHostDevicesResponseBodyHostDevicesPagination pagination;

        @NameInMap("List")
        public java.util.List<ListHostDevicesResponseBodyHostDevicesList> list;

        public static ListHostDevicesResponseBodyHostDevices build(java.util.Map<String, ?> map) throws Exception {
            ListHostDevicesResponseBodyHostDevices self = new ListHostDevicesResponseBodyHostDevices();
            return TeaModel.build(map, self);
        }

        public ListHostDevicesResponseBodyHostDevices setPagination(ListHostDevicesResponseBodyHostDevicesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListHostDevicesResponseBodyHostDevicesPagination getPagination() {
            return this.pagination;
        }

        public ListHostDevicesResponseBodyHostDevices setList(java.util.List<ListHostDevicesResponseBodyHostDevicesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListHostDevicesResponseBodyHostDevicesList> getList() {
            return this.list;
        }

    }

}
