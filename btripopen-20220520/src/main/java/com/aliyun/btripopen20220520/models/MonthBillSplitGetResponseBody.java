// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillSplitGetResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<MonthBillSplitGetResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static MonthBillSplitGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonthBillSplitGetResponseBody self = new MonthBillSplitGetResponseBody();
        return TeaModel.build(map, self);
    }

    public MonthBillSplitGetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MonthBillSplitGetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MonthBillSplitGetResponseBody setModule(java.util.List<MonthBillSplitGetResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<MonthBillSplitGetResponseBodyModule> getModule() {
        return this.module;
    }

    public MonthBillSplitGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonthBillSplitGetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MonthBillSplitGetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MonthBillSplitGetResponseBodyModule extends TeaModel {
        @NameInMap("bill_split_key")
        public String billSplitKey;

        @NameInMap("end_date")
        public String endDate;

        @NameInMap("start_date")
        public String startDate;

        @NameInMap("url")
        public String url;

        public static MonthBillSplitGetResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MonthBillSplitGetResponseBodyModule self = new MonthBillSplitGetResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MonthBillSplitGetResponseBodyModule setBillSplitKey(String billSplitKey) {
            this.billSplitKey = billSplitKey;
            return this;
        }
        public String getBillSplitKey() {
            return this.billSplitKey;
        }

        public MonthBillSplitGetResponseBodyModule setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MonthBillSplitGetResponseBodyModule setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MonthBillSplitGetResponseBodyModule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
