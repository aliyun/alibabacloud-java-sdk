// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillGetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<MonthBillGetResponseBodyModule> module;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static MonthBillGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonthBillGetResponseBody self = new MonthBillGetResponseBody();
        return TeaModel.build(map, self);
    }

    public MonthBillGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonthBillGetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MonthBillGetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MonthBillGetResponseBody setModule(java.util.List<MonthBillGetResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<MonthBillGetResponseBodyModule> getModule() {
        return this.module;
    }

    public MonthBillGetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MonthBillGetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MonthBillGetResponseBodyModule extends TeaModel {
        @NameInMap("end_date")
        public String endDate;

        @NameInMap("start_date")
        public String startDate;

        @NameInMap("url")
        public String url;

        public static MonthBillGetResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MonthBillGetResponseBodyModule self = new MonthBillGetResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MonthBillGetResponseBodyModule setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public MonthBillGetResponseBodyModule setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public MonthBillGetResponseBodyModule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
