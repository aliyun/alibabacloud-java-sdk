// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseEndpointInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeVirtualWareHouseEndpointInfoResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>7EE0EF77-B7BA-5EE3-9B11-F8DE7B65BAB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVirtualWareHouseEndpointInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseEndpointInfoResponseBody self = new DescribeVirtualWareHouseEndpointInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseEndpointInfoResponseBody setData(java.util.List<DescribeVirtualWareHouseEndpointInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVirtualWareHouseEndpointInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVirtualWareHouseEndpointInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVirtualWareHouseEndpointInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <strong>example:</strong>
         * <p>10.0.xx.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>tcp:9000,http:8123,mysql:9004</p>
         */
        @NameInMap("Ports")
        public String ports;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vw-bp11gxp8g992f****.clickhouse.ads.aliyuncs.com</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeVirtualWareHouseEndpointInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualWareHouseEndpointInfoResponseBodyData self = new DescribeVirtualWareHouseEndpointInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualWareHouseEndpointInfoResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeVirtualWareHouseEndpointInfoResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeVirtualWareHouseEndpointInfoResponseBodyData setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeVirtualWareHouseEndpointInfoResponseBodyData setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public DescribeVirtualWareHouseEndpointInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVirtualWareHouseEndpointInfoResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
