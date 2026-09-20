// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponseBody extends TeaModel {
    @NameInMap("ConnAddrs")
    public DescribeEndpointsResponseBodyConnAddrs connAddrs;

    /**
     * <p>The engine type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>hbaseue</strong></li>
     * <li><strong>hbase</strong></li>
     * <li><strong>spark</strong></li>
     * <li><strong>geomesa</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud.</li>
     * <li><strong>CLASSIC</strong>: classic network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F072593C-5234-5B56-9F63-3C7A3AD85D66</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The vSwitch ID. This parameter is returned only when NetType is set to <strong>VPC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1foll427ze3d4ps****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID. This parameter is returned only when NetType is set to <strong>VPC</strong>.</p>
     * 
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
        @NameInMap("ConnAddr")
        public String connAddr;

        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("ConnType")
        public String connType;

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
