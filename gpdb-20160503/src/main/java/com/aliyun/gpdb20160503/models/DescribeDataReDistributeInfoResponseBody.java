// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataReDistributeInfoResponseBody extends TeaModel {
    @NameInMap("DataReDistributeInfo")
    public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo dataReDistributeInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataReDistributeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataReDistributeInfoResponseBody self = new DescribeDataReDistributeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataReDistributeInfoResponseBody setDataReDistributeInfo(DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo dataReDistributeInfo) {
        this.dataReDistributeInfo = dataReDistributeInfo;
        return this;
    }
    public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo getDataReDistributeInfo() {
        return this.dataReDistributeInfo;
    }

    public DescribeDataReDistributeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("RemainTime")
        public String remainTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo self = new DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo setRemainTime(String remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public String getRemainTime() {
            return this.remainTime;
        }

        public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataReDistributeInfoResponseBodyDataReDistributeInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
