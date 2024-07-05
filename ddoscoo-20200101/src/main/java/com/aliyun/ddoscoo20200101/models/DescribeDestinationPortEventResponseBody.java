// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDestinationPortEventResponseBody extends TeaModel {
    @NameInMap("PortList")
    public java.util.List<DescribeDestinationPortEventResponseBodyPortList> portList;

    /**
     * <strong>example:</strong>
     * <p>9E7F6B2C-03F2-462F-9076-B782CF0DD502</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDestinationPortEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDestinationPortEventResponseBody self = new DescribeDestinationPortEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDestinationPortEventResponseBody setPortList(java.util.List<DescribeDestinationPortEventResponseBodyPortList> portList) {
        this.portList = portList;
        return this;
    }
    public java.util.List<DescribeDestinationPortEventResponseBodyPortList> getPortList() {
        return this.portList;
    }

    public DescribeDestinationPortEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDestinationPortEventResponseBodyPortList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DstPort")
        public String dstPort;

        /**
         * <strong>example:</strong>
         * <p>8760950</p>
         */
        @NameInMap("InPkts")
        public Long inPkts;

        public static DescribeDestinationPortEventResponseBodyPortList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDestinationPortEventResponseBodyPortList self = new DescribeDestinationPortEventResponseBodyPortList();
            return TeaModel.build(map, self);
        }

        public DescribeDestinationPortEventResponseBodyPortList setDstPort(String dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public String getDstPort() {
            return this.dstPort;
        }

        public DescribeDestinationPortEventResponseBodyPortList setInPkts(Long inPkts) {
            this.inPkts = inPkts;
            return this;
        }
        public Long getInPkts() {
            return this.inPkts;
        }

    }

}
