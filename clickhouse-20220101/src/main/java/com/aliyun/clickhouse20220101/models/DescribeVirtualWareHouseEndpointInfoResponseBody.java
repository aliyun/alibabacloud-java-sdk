// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseEndpointInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeVirtualWareHouseEndpointInfoResponseBodyData> data;

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
        // Endpoint类型
        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("Ip")
        public String ip;

        // 网络类型 intranet:内网 | internet:公网
        @NameInMap("NetType")
        public String netType;

        // 端口信息 英文逗号分隔
        @NameInMap("Ports")
        public String ports;

        // 创建状态 Creating:创建中 | Ready:可使用 | Deleting:删除中
        @NameInMap("Status")
        public String status;

        // 链接串
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
