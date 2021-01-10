// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectEvaluationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetDetectEvaluationResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static GetDetectEvaluationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectEvaluationResponseBody self = new GetDetectEvaluationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectEvaluationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetectEvaluationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetectEvaluationResponseBody setData(java.util.List<GetDetectEvaluationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDetectEvaluationResponseBodyData> getData() {
        return this.data;
    }

    public GetDetectEvaluationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetDetectEvaluationResponseBodyDataEvaluationItemList extends TeaModel {
        @NameInMap("SuccessRate")
        public String successRate;

        @NameInMap("HandleCount")
        public Integer handleCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("SuccessCount")
        public Integer successCount;

        public static GetDetectEvaluationResponseBodyDataEvaluationItemList build(java.util.Map<String, ?> map) throws Exception {
            GetDetectEvaluationResponseBodyDataEvaluationItemList self = new GetDetectEvaluationResponseBodyDataEvaluationItemList();
            return TeaModel.build(map, self);
        }

        public GetDetectEvaluationResponseBodyDataEvaluationItemList setSuccessRate(String successRate) {
            this.successRate = successRate;
            return this;
        }
        public String getSuccessRate() {
            return this.successRate;
        }

        public GetDetectEvaluationResponseBodyDataEvaluationItemList setHandleCount(Integer handleCount) {
            this.handleCount = handleCount;
            return this;
        }
        public Integer getHandleCount() {
            return this.handleCount;
        }

        public GetDetectEvaluationResponseBodyDataEvaluationItemList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDetectEvaluationResponseBodyDataEvaluationItemList setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

    public static class GetDetectEvaluationResponseBodyData extends TeaModel {
        @NameInMap("Day")
        public String day;

        @NameInMap("EvaluationItemList")
        public java.util.List<GetDetectEvaluationResponseBodyDataEvaluationItemList> evaluationItemList;

        public static GetDetectEvaluationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDetectEvaluationResponseBodyData self = new GetDetectEvaluationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDetectEvaluationResponseBodyData setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public GetDetectEvaluationResponseBodyData setEvaluationItemList(java.util.List<GetDetectEvaluationResponseBodyDataEvaluationItemList> evaluationItemList) {
            this.evaluationItemList = evaluationItemList;
            return this;
        }
        public java.util.List<GetDetectEvaluationResponseBodyDataEvaluationItemList> getEvaluationItemList() {
            return this.evaluationItemList;
        }

    }

}
