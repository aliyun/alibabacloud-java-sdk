// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeRiskScoreResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeRiskScoreResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRiskScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskScoreResponseBody self = new DescribeRiskScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskScoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRiskScoreResponseBody setData(DescribeRiskScoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRiskScoreResponseBodyData getData() {
        return this.data;
    }

    public DescribeRiskScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRiskScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskScoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRiskScoreResponseBodyData extends TeaModel {
        @NameInMap("DetailList")
        public java.util.List<String> detailList;

        @NameInMap("HackingEvent")
        public String hackingEvent;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Score")
        public Integer score;

        public static DescribeRiskScoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskScoreResponseBodyData self = new DescribeRiskScoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRiskScoreResponseBodyData setDetailList(java.util.List<String> detailList) {
            this.detailList = detailList;
            return this;
        }
        public java.util.List<String> getDetailList() {
            return this.detailList;
        }

        public DescribeRiskScoreResponseBodyData setHackingEvent(String hackingEvent) {
            this.hackingEvent = hackingEvent;
            return this;
        }
        public String getHackingEvent() {
            return this.hackingEvent;
        }

        public DescribeRiskScoreResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeRiskScoreResponseBodyData setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

    }

}
