// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceCallStatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListVoiceCallStatResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListVoiceCallStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCallStatResponseBody self = new ListVoiceCallStatResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceCallStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceCallStatResponseBody setList(java.util.List<ListVoiceCallStatResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListVoiceCallStatResponseBodyList> getList() {
        return this.list;
    }

    public ListVoiceCallStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceCallStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceCallStatResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVoiceCallStatResponseBodyList extends TeaModel {
        @NameInMap("AnsweredCalls")
        public Long answeredCalls;

        @NameInMap("AnsweredRate")
        public Long answeredRate;

        @NameInMap("AverageDuration")
        public Long averageDuration;

        @NameInMap("Billing")
        public Long billing;

        @NameInMap("BusinessType")
        public Long businessType;

        @NameInMap("FailedCalls")
        public Long failedCalls;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        public static ListVoiceCallStatResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceCallStatResponseBodyList self = new ListVoiceCallStatResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListVoiceCallStatResponseBodyList setAnsweredCalls(Long answeredCalls) {
            this.answeredCalls = answeredCalls;
            return this;
        }
        public Long getAnsweredCalls() {
            return this.answeredCalls;
        }

        public ListVoiceCallStatResponseBodyList setAnsweredRate(Long answeredRate) {
            this.answeredRate = answeredRate;
            return this;
        }
        public Long getAnsweredRate() {
            return this.answeredRate;
        }

        public ListVoiceCallStatResponseBodyList setAverageDuration(Long averageDuration) {
            this.averageDuration = averageDuration;
            return this;
        }
        public Long getAverageDuration() {
            return this.averageDuration;
        }

        public ListVoiceCallStatResponseBodyList setBilling(Long billing) {
            this.billing = billing;
            return this;
        }
        public Long getBilling() {
            return this.billing;
        }

        public ListVoiceCallStatResponseBodyList setBusinessType(Long businessType) {
            this.businessType = businessType;
            return this;
        }
        public Long getBusinessType() {
            return this.businessType;
        }

        public ListVoiceCallStatResponseBodyList setFailedCalls(Long failedCalls) {
            this.failedCalls = failedCalls;
            return this;
        }
        public Long getFailedCalls() {
            return this.failedCalls;
        }

        public ListVoiceCallStatResponseBodyList setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListVoiceCallStatResponseBodyList setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

    }

}
