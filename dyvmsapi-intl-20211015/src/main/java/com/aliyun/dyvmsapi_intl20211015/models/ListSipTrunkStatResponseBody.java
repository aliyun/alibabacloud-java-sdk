// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListSipTrunkStatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListSipTrunkStatResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    public static ListSipTrunkStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunkStatResponseBody self = new ListSipTrunkStatResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSipTrunkStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSipTrunkStatResponseBody setList(java.util.List<ListSipTrunkStatResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSipTrunkStatResponseBodyList> getList() {
        return this.list;
    }

    public ListSipTrunkStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSipTrunkStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSipTrunkStatResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class ListSipTrunkStatResponseBodyList extends TeaModel {
        @NameInMap("AnsweredCalls")
        public Long answeredCalls;

        @NameInMap("AnsweredRate")
        public Long answeredRate;

        @NameInMap("AverageDuration")
        public Long averageDuration;

        @NameInMap("Billing")
        public Long billing;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("FailedCalls")
        public Long failedCalls;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        public static ListSipTrunkStatResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSipTrunkStatResponseBodyList self = new ListSipTrunkStatResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSipTrunkStatResponseBodyList setAnsweredCalls(Long answeredCalls) {
            this.answeredCalls = answeredCalls;
            return this;
        }
        public Long getAnsweredCalls() {
            return this.answeredCalls;
        }

        public ListSipTrunkStatResponseBodyList setAnsweredRate(Long answeredRate) {
            this.answeredRate = answeredRate;
            return this;
        }
        public Long getAnsweredRate() {
            return this.answeredRate;
        }

        public ListSipTrunkStatResponseBodyList setAverageDuration(Long averageDuration) {
            this.averageDuration = averageDuration;
            return this;
        }
        public Long getAverageDuration() {
            return this.averageDuration;
        }

        public ListSipTrunkStatResponseBodyList setBilling(Long billing) {
            this.billing = billing;
            return this;
        }
        public Long getBilling() {
            return this.billing;
        }

        public ListSipTrunkStatResponseBodyList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListSipTrunkStatResponseBodyList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListSipTrunkStatResponseBodyList setFailedCalls(Long failedCalls) {
            this.failedCalls = failedCalls;
            return this;
        }
        public Long getFailedCalls() {
            return this.failedCalls;
        }

        public ListSipTrunkStatResponseBodyList setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListSipTrunkStatResponseBodyList setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

    }

}
