// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillGetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("module")
    public java.util.List<MonthBillGetResponseBodyModule> module;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

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

    public MonthBillGetResponseBody setModule(java.util.List<MonthBillGetResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<MonthBillGetResponseBodyModule> getModule() {
        return this.module;
    }

    public MonthBillGetResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public MonthBillGetResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
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
