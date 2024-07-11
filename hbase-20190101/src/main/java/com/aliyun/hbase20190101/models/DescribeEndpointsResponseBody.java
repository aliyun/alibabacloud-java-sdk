// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponseBody extends TeaModel {
    @NameInMap("ConnAddrs")
    public DescribeEndpointsResponseBodyConnAddrs connAddrs;

    /**
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <strong>example:</strong>
     * <p>F072593C-5234-5B56-9F63-3C7A3AD85D66</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1foll427ze3d4ps****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp15s22y1a7sff5gj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsResponseBody self = new DescribeEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsResponseBody setConnAddrs(DescribeEndpointsResponseBodyConnAddrs connAddrs) {
        this.connAddrs = connAddrs;
        return this;
    }
    public DescribeEndpointsResponseBodyConnAddrs getConnAddrs() {
        return this.connAddrs;
    }

    public DescribeEndpointsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeEndpointsResponseBody setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DescribeEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointsResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeEndpointsResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeEndpointsResponseBodyConnAddrsConnAddrInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ConnAddr")
        public String connAddr;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        /**
         * <strong>example:</strong>
         * <p>zkConn</p>
         */
        @NameInMap("ConnType")
        public String connType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetType")
        public String netType;

        public static DescribeEndpointsResponseBodyConnAddrsConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyConnAddrsConnAddrInfo self = new DescribeEndpointsResponseBodyConnAddrsConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyConnAddrsConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeEndpointsResponseBodyConnAddrsConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeEndpointsResponseBodyConnAddrsConnAddrInfo setConnType(String connType) {
            this.connType = connType;
            return this;
        }
        public String getConnType() {
            return this.connType;
        }

        public DescribeEndpointsResponseBodyConnAddrsConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeEndpointsResponseBodyConnAddrs extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public java.util.List<DescribeEndpointsResponseBodyConnAddrsConnAddrInfo> connAddrInfo;

        public static DescribeEndpointsResponseBodyConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyConnAddrs self = new DescribeEndpointsResponseBodyConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyConnAddrs setConnAddrInfo(java.util.List<DescribeEndpointsResponseBodyConnAddrsConnAddrInfo> connAddrInfo) {
            this.connAddrInfo = connAddrInfo;
            return this;
        }
        public java.util.List<DescribeEndpointsResponseBodyConnAddrsConnAddrInfo> getConnAddrInfo() {
            return this.connAddrInfo;
        }

    }

}
