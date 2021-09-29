// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListEdgeDevicesResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("EdgeDevices")
    public ListEdgeDevicesResponseBodyEdgeDevices edgeDevices;

    public static ListEdgeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDevicesResponseBody self = new ListEdgeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeDevicesResponseBody setEdgeDevices(ListEdgeDevicesResponseBodyEdgeDevices edgeDevices) {
        this.edgeDevices = edgeDevices;
        return this;
    }
    public ListEdgeDevicesResponseBodyEdgeDevices getEdgeDevices() {
        return this.edgeDevices;
    }

    public static class ListEdgeDevicesResponseBodyEdgeDevicesPagination extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPageCount")
        public Long totalPageCount;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListEdgeDevicesResponseBodyEdgeDevicesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDevicesResponseBodyEdgeDevicesPagination self = new ListEdgeDevicesResponseBodyEdgeDevicesPagination();
            return TeaModel.build(map, self);
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesPagination setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesPagination setTotalPageCount(Long totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesPagination setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesPagination setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListEdgeDevicesResponseBodyEdgeDevicesList extends TeaModel {
        @NameInMap("EdgeDeviceId")
        public String edgeDeviceId;

        @NameInMap("EdgeDeviceType")
        public Long edgeDeviceType;

        @NameInMap("EdgeDeviceName")
        public String edgeDeviceName;

        @NameInMap("OnlineStatus")
        public Long onlineStatus;

        @NameInMap("ActivateTime")
        public Long activateTime;

        @NameInMap("LastOnlineTime")
        public Long lastOnlineTime;

        public static ListEdgeDevicesResponseBodyEdgeDevicesList build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDevicesResponseBodyEdgeDevicesList self = new ListEdgeDevicesResponseBodyEdgeDevicesList();
            return TeaModel.build(map, self);
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesList setEdgeDeviceId(String edgeDeviceId) {
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesList setEdgeDeviceType(Long edgeDeviceType) {
            this.edgeDeviceType = edgeDeviceType;
            return this;
        }
        public Long getEdgeDeviceType() {
            return this.edgeDeviceType;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesList setEdgeDeviceName(String edgeDeviceName) {
            this.edgeDeviceName = edgeDeviceName;
            return this;
        }
        public String getEdgeDeviceName() {
            return this.edgeDeviceName;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesList setOnlineStatus(Long onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Long getOnlineStatus() {
            return this.onlineStatus;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesList setActivateTime(Long activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public Long getActivateTime() {
            return this.activateTime;
        }

        public ListEdgeDevicesResponseBodyEdgeDevicesList setLastOnlineTime(Long lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public Long getLastOnlineTime() {
            return this.lastOnlineTime;
        }

    }

    public static class ListEdgeDevicesResponseBodyEdgeDevices extends TeaModel {
        @NameInMap("Pagination")
        public ListEdgeDevicesResponseBodyEdgeDevicesPagination pagination;

        @NameInMap("List")
        public java.util.List<ListEdgeDevicesResponseBodyEdgeDevicesList> list;

        public static ListEdgeDevicesResponseBodyEdgeDevices build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDevicesResponseBodyEdgeDevices self = new ListEdgeDevicesResponseBodyEdgeDevices();
            return TeaModel.build(map, self);
        }

        public ListEdgeDevicesResponseBodyEdgeDevices setPagination(ListEdgeDevicesResponseBodyEdgeDevicesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListEdgeDevicesResponseBodyEdgeDevicesPagination getPagination() {
            return this.pagination;
        }

        public ListEdgeDevicesResponseBodyEdgeDevices setList(java.util.List<ListEdgeDevicesResponseBodyEdgeDevicesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEdgeDevicesResponseBodyEdgeDevicesList> getList() {
            return this.list;
        }

    }

}
