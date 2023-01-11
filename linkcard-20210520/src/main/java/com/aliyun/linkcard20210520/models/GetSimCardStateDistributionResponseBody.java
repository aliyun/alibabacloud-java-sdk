// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetSimCardStateDistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSimCardStateDistributionResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSimCardStateDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimCardStateDistributionResponseBody self = new GetSimCardStateDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimCardStateDistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSimCardStateDistributionResponseBody setData(GetSimCardStateDistributionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSimCardStateDistributionResponseBodyData getData() {
        return this.data;
    }

    public GetSimCardStateDistributionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSimCardStateDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSimCardStateDistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSimCardStateDistributionResponseBodyData extends TeaModel {
        @NameInMap("CardCount")
        public Long cardCount;

        @NameInMap("DestoryedCount")
        public Long destoryedCount;

        @NameInMap("ShutDownCount")
        public Long shutDownCount;

        @NameInMap("StopCount")
        public Long stopCount;

        @NameInMap("TestCount")
        public Long testCount;

        @NameInMap("UnusedCount")
        public Long unusedCount;

        @NameInMap("UsingCount")
        public Long usingCount;

        public static GetSimCardStateDistributionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSimCardStateDistributionResponseBodyData self = new GetSimCardStateDistributionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSimCardStateDistributionResponseBodyData setCardCount(Long cardCount) {
            this.cardCount = cardCount;
            return this;
        }
        public Long getCardCount() {
            return this.cardCount;
        }

        public GetSimCardStateDistributionResponseBodyData setDestoryedCount(Long destoryedCount) {
            this.destoryedCount = destoryedCount;
            return this;
        }
        public Long getDestoryedCount() {
            return this.destoryedCount;
        }

        public GetSimCardStateDistributionResponseBodyData setShutDownCount(Long shutDownCount) {
            this.shutDownCount = shutDownCount;
            return this;
        }
        public Long getShutDownCount() {
            return this.shutDownCount;
        }

        public GetSimCardStateDistributionResponseBodyData setStopCount(Long stopCount) {
            this.stopCount = stopCount;
            return this;
        }
        public Long getStopCount() {
            return this.stopCount;
        }

        public GetSimCardStateDistributionResponseBodyData setTestCount(Long testCount) {
            this.testCount = testCount;
            return this;
        }
        public Long getTestCount() {
            return this.testCount;
        }

        public GetSimCardStateDistributionResponseBodyData setUnusedCount(Long unusedCount) {
            this.unusedCount = unusedCount;
            return this;
        }
        public Long getUnusedCount() {
            return this.unusedCount;
        }

        public GetSimCardStateDistributionResponseBodyData setUsingCount(Long usingCount) {
            this.usingCount = usingCount;
            return this;
        }
        public Long getUsingCount() {
            return this.usingCount;
        }

    }

}
