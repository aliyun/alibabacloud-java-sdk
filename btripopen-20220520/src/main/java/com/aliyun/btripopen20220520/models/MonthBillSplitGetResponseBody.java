// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MonthBillSplitGetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<MonthBillSplitGetResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-<strong><strong>-</strong></strong>-****-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce********056433edbb2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>invoice_third_part_id123</p>
         */
        @NameInMap("bill_split_key")
        public String billSplitKey;

        /**
         * <strong>example:</strong>
         * <p>2023-12-31</p>
         */
        @NameInMap("end_date")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>2023-12-01</p>
         */
        @NameInMap("start_date")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alibtrip-oss.oss-cn-hangzhou.aliyuncs.com/">https://alibtrip-oss.oss-cn-hangzhou.aliyuncs.com/</a>********</p>
         */
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
