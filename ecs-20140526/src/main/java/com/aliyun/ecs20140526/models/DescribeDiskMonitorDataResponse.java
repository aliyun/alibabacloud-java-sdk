// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeDiskMonitorDataResponseMonitorData monitorData;

    public static DescribeDiskMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataResponse self = new DescribeDiskMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("IOPSRead")
        @Validation(required = true)
        public Integer IOPSRead;

        @NameInMap("IOPSWrite")
        @Validation(required = true)
        public Integer IOPSWrite;

        @NameInMap("IOPSTotal")
        @Validation(required = true)
        public Integer IOPSTotal;

        @NameInMap("BPSRead")
        @Validation(required = true)
        public Integer BPSRead;

        @NameInMap("BPSWrite")
        @Validation(required = true)
        public Integer BPSWrite;

        @NameInMap("BPSTotal")
        @Validation(required = true)
        public Integer BPSTotal;

        @NameInMap("LatencyRead")
        @Validation(required = true)
        public Integer latencyRead;

        @NameInMap("LatencyWrite")
        @Validation(required = true)
        public Integer latencyWrite;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData self = new DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDiskMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("DiskMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData> diskMonitorData;

        public static DescribeDiskMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseMonitorData self = new DescribeDiskMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

    }

}
