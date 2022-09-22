// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeFunctionFeedbackResponseBody extends TeaModel {
    @NameInMap("Data")
    public Data data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFunctionFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFunctionFeedbackResponseBody self = new DescribeFunctionFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFunctionFeedbackResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public DescribeFunctionFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Feedback extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Suggestion")
        public String suggestion;

        public static Feedback build(java.util.Map<String, ?> map) throws Exception {
            Feedback self = new Feedback();
            return TeaModel.build(map, self);
        }

        public Feedback setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public Feedback setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public Feedback setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public Feedback setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public Feedback setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public Feedback setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("feedback")
        public java.util.List<Feedback> feedback;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setFeedback(java.util.List<Feedback> feedback) {
            this.feedback = feedback;
            return this;
        }
        public java.util.List<Feedback> getFeedback() {
            return this.feedback;
        }

    }

}
