// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeVirtualWareHouseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F543E6CC-6868-523D-8D28-0E92CF977ED2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>tcp:9000,http:8123,mysql:9004</p>
         */
        @NameInMap("Ports")
        public String ports;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("VirtualWareHouseCacheStorage")
        public Integer virtualWareHouseCacheStorage;

        /**
         * <strong>example:</strong>
         * <p>n1.xlarge</p>
         */
        @NameInMap("VirtualWareHouseClass")
        public String virtualWareHouseClass;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VirtualWareHouseDescription")
        public String virtualWareHouseDescription;

        /**
         * <strong>example:</strong>
         * <p>vw-bp1w2728d535t****</p>
         */
        @NameInMap("VirtualWareHouseId")
        public String virtualWareHouseId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("VirtualWareHouseStatus")
        public String virtualWareHouseStatus;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1tg609m5j85jejq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
