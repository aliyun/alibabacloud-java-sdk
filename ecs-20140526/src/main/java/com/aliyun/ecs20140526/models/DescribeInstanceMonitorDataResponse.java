// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeInstanceMonitorDataResponseMonitorData monitorData;

    public static DescribeInstanceMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataResponse self = new DescribeInstanceMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("CPU")
        @Validation(required = true)
        public Integer CPU;

        @NameInMap("IntranetRX")
        @Validation(required = true)
        public Integer intranetRX;

        @NameInMap("IntranetTX")
        @Validation(required = true)
        public Integer intranetTX;

        @NameInMap("IntranetBandwidth")
        @Validation(required = true)
        public Integer intranetBandwidth;

        @NameInMap("InternetRX")
        @Validation(required = true)
        public Integer internetRX;

        @NameInMap("InternetTX")
        @Validation(required = true)
        public Integer internetTX;

        @NameInMap("InternetBandwidth")
        @Validation(required = true)
        public Integer internetBandwidth;

        @NameInMap("IOPSRead")
        @Validation(required = true)
        public Integer IOPSRead;

        @NameInMap("IOPSWrite")
        @Validation(required = true)
        public Integer IOPSWrite;

        @NameInMap("BPSRead")
        @Validation(required = true)
        public Integer BPSRead;

        @NameInMap("BPSWrite")
        @Validation(required = true)
        public Integer BPSWrite;

        @NameInMap("CPUCreditUsage")
        @Validation(required = true)
        public Double CPUCreditUsage;

        @NameInMap("CPUCreditBalance")
        @Validation(required = true)
        public Double CPUCreditBalance;

        @NameInMap("CPUAdvanceCreditBalance")
        @Validation(required = true)
        public Double CPUAdvanceCreditBalance;

        @NameInMap("CPUNotpaidSurplusCreditUsage")
        @Validation(required = true)
        public Double CPUNotpaidSurplusCreditUsage;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData self = new DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("InstanceMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData> instanceMonitorData;

        public static DescribeInstanceMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseMonitorData self = new DescribeInstanceMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

    }

}
