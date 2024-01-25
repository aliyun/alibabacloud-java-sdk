// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeReportDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeReportDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportDataResponseBody self = new DescribeReportDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReportDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeReportDataResponseBody setData(DescribeReportDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeReportDataResponseBodyData getData() {
        return this.data;
    }

    public DescribeReportDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeReportDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReportDataResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeReportDataResponseBodyData extends TeaModel {
        @NameInMap("HeathScore")
        public Long heathScore;

        @NameInMap("HeathScoreTrendList")
        public java.util.List<Long> heathScoreTrendList;

        @NameInMap("PreUpdateTime")
        public String preUpdateTime;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("RiskCountTrendList")
        public java.util.List<Long> riskCountTrendList;

        public static DescribeReportDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeReportDataResponseBodyData self = new DescribeReportDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeReportDataResponseBodyData setHeathScore(Long heathScore) {
            this.heathScore = heathScore;
            return this;
        }
        public Long getHeathScore() {
            return this.heathScore;
        }

        public DescribeReportDataResponseBodyData setHeathScoreTrendList(java.util.List<Long> heathScoreTrendList) {
            this.heathScoreTrendList = heathScoreTrendList;
            return this;
        }
        public java.util.List<Long> getHeathScoreTrendList() {
            return this.heathScoreTrendList;
        }

        public DescribeReportDataResponseBodyData setPreUpdateTime(String preUpdateTime) {
            this.preUpdateTime = preUpdateTime;
            return this;
        }
        public String getPreUpdateTime() {
            return this.preUpdateTime;
        }

        public DescribeReportDataResponseBodyData setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeReportDataResponseBodyData setRiskCountTrendList(java.util.List<Long> riskCountTrendList) {
            this.riskCountTrendList = riskCountTrendList;
            return this;
        }
        public java.util.List<Long> getRiskCountTrendList() {
            return this.riskCountTrendList;
        }

    }

}
