// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeEniMonitorDataResponseMonitorData monitorData;

    public static DescribeEniMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataResponse self = new DescribeEniMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEniMonitorDataResponseMonitorDataEniMonitorData extends TeaModel {
        @NameInMap("EniId")
        @Validation(required = true)
        public String eniId;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("PacketTx")
        @Validation(required = true)
        public String packetTx;

        @NameInMap("PacketRx")
        @Validation(required = true)
        public String packetRx;

        @NameInMap("IntranetTx")
        @Validation(required = true)
        public String intranetTx;

        @NameInMap("IntranetRx")
        @Validation(required = true)
        public String intranetRx;

        @NameInMap("DropPacketTx")
        @Validation(required = true)
        public String dropPacketTx;

        @NameInMap("DropPacketRx")
        @Validation(required = true)
        public String dropPacketRx;

        public static DescribeEniMonitorDataResponseMonitorDataEniMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseMonitorDataEniMonitorData self = new DescribeEniMonitorDataResponseMonitorDataEniMonitorData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEniMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("EniMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeEniMonitorDataResponseMonitorDataEniMonitorData> eniMonitorData;

        public static DescribeEniMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseMonitorData self = new DescribeEniMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

    }

}
