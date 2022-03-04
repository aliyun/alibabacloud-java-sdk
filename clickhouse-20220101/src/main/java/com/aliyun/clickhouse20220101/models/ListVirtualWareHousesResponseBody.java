// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHousesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListVirtualWareHousesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVirtualWareHousesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualWareHousesResponseBody self = new ListVirtualWareHousesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualWareHousesResponseBody setData(java.util.List<ListVirtualWareHousesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVirtualWareHousesResponseBodyData> getData() {
        return this.data;
    }

    public ListVirtualWareHousesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirtualWareHousesResponseBodyData extends TeaModel {
        // 端口信息 英文逗号分隔
        @NameInMap("Ports")
        public String ports;

        // 计算组本地缓存空间GiB
        @NameInMap("VirtualWareHouseCacheStorage")
        public Integer virtualWareHouseCacheStorage;

        // 计算组规格码
        @NameInMap("VirtualWareHouseClass")
        public String virtualWareHouseClass;

        // 计算组描述信息
        @NameInMap("VirtualWareHouseDescription")
        public String virtualWareHouseDescription;

        @NameInMap("VirtualWareHouseId")
        public String virtualWareHouseId;

        // 计算组状态 详见describeVirtualWareHouseStatusSet接口
        @NameInMap("VirtualWareHouseStatus")
        public String virtualWareHouseStatus;

        // 交换机ID
        @NameInMap("VswitchId")
        public String vswitchId;

        // 可用区
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListVirtualWareHousesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualWareHousesResponseBodyData self = new ListVirtualWareHousesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVirtualWareHousesResponseBodyData setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public ListVirtualWareHousesResponseBodyData setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
            this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
            return this;
        }
        public Integer getVirtualWareHouseCacheStorage() {
            return this.virtualWareHouseCacheStorage;
        }

        public ListVirtualWareHousesResponseBodyData setVirtualWareHouseClass(String virtualWareHouseClass) {
            this.virtualWareHouseClass = virtualWareHouseClass;
            return this;
        }
        public String getVirtualWareHouseClass() {
            return this.virtualWareHouseClass;
        }

        public ListVirtualWareHousesResponseBodyData setVirtualWareHouseDescription(String virtualWareHouseDescription) {
            this.virtualWareHouseDescription = virtualWareHouseDescription;
            return this;
        }
        public String getVirtualWareHouseDescription() {
            return this.virtualWareHouseDescription;
        }

        public ListVirtualWareHousesResponseBodyData setVirtualWareHouseId(String virtualWareHouseId) {
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        public ListVirtualWareHousesResponseBodyData setVirtualWareHouseStatus(String virtualWareHouseStatus) {
            this.virtualWareHouseStatus = virtualWareHouseStatus;
            return this;
        }
        public String getVirtualWareHouseStatus() {
            return this.virtualWareHouseStatus;
        }

        public ListVirtualWareHousesResponseBodyData setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListVirtualWareHousesResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
