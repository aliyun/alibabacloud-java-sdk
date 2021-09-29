// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListVehicleResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Vehicles")
    public ListVehicleResponseBodyVehicles vehicles;

    public static ListVehicleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleResponseBody self = new ListVehicleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVehicleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVehicleResponseBody setVehicles(ListVehicleResponseBodyVehicles vehicles) {
        this.vehicles = vehicles;
        return this;
    }
    public ListVehicleResponseBodyVehicles getVehicles() {
        return this.vehicles;
    }

    public static class ListVehicleResponseBodyVehiclesPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListVehicleResponseBodyVehiclesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleResponseBodyVehiclesPagination self = new ListVehicleResponseBodyVehiclesPagination();
            return TeaModel.build(map, self);
        }

        public ListVehicleResponseBodyVehiclesPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListVehicleResponseBodyVehiclesPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVehicleResponseBodyVehiclesPagination setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListVehicleResponseBodyVehiclesList extends TeaModel {
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Vin")
        public String vin;

        public static ListVehicleResponseBodyVehiclesList build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleResponseBodyVehiclesList self = new ListVehicleResponseBodyVehiclesList();
            return TeaModel.build(map, self);
        }

        public ListVehicleResponseBodyVehiclesList setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListVehicleResponseBodyVehiclesList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListVehicleResponseBodyVehiclesList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListVehicleResponseBodyVehiclesList setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

    }

    public static class ListVehicleResponseBodyVehicles extends TeaModel {
        @NameInMap("Pagination")
        public ListVehicleResponseBodyVehiclesPagination pagination;

        @NameInMap("List")
        public java.util.List<ListVehicleResponseBodyVehiclesList> list;

        public static ListVehicleResponseBodyVehicles build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleResponseBodyVehicles self = new ListVehicleResponseBodyVehicles();
            return TeaModel.build(map, self);
        }

        public ListVehicleResponseBodyVehicles setPagination(ListVehicleResponseBodyVehiclesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListVehicleResponseBodyVehiclesPagination getPagination() {
            return this.pagination;
        }

        public ListVehicleResponseBodyVehicles setList(java.util.List<ListVehicleResponseBodyVehiclesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListVehicleResponseBodyVehiclesList> getList() {
            return this.list;
        }

    }

}
