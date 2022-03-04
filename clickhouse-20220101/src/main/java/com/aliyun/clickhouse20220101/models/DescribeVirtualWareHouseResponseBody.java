// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeVirtualWareHouseResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVirtualWareHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseResponseBody self = new DescribeVirtualWareHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseResponseBody setData(DescribeVirtualWareHouseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVirtualWareHouseResponseBodyData getData() {
        return this.data;
    }

    public DescribeVirtualWareHouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVirtualWareHouseResponseBodyData extends TeaModel {
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

        public static DescribeVirtualWareHouseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualWareHouseResponseBodyData self = new DescribeVirtualWareHouseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualWareHouseResponseBodyData setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public DescribeVirtualWareHouseResponseBodyData setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
            this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
            return this;
        }
        public Integer getVirtualWareHouseCacheStorage() {
            return this.virtualWareHouseCacheStorage;
        }

        public DescribeVirtualWareHouseResponseBodyData setVirtualWareHouseClass(String virtualWareHouseClass) {
            this.virtualWareHouseClass = virtualWareHouseClass;
            return this;
        }
        public String getVirtualWareHouseClass() {
            return this.virtualWareHouseClass;
        }

        public DescribeVirtualWareHouseResponseBodyData setVirtualWareHouseDescription(String virtualWareHouseDescription) {
            this.virtualWareHouseDescription = virtualWareHouseDescription;
            return this;
        }
        public String getVirtualWareHouseDescription() {
            return this.virtualWareHouseDescription;
        }

        public DescribeVirtualWareHouseResponseBodyData setVirtualWareHouseId(String virtualWareHouseId) {
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        public DescribeVirtualWareHouseResponseBodyData setVirtualWareHouseStatus(String virtualWareHouseStatus) {
            this.virtualWareHouseStatus = virtualWareHouseStatus;
            return this;
        }
        public String getVirtualWareHouseStatus() {
            return this.virtualWareHouseStatus;
        }

        public DescribeVirtualWareHouseResponseBodyData setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeVirtualWareHouseResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
