// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class ReportCustomerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReportCustomerResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static ReportCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportCustomerResponseBody self = new ReportCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportCustomerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReportCustomerResponseBody setData(ReportCustomerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReportCustomerResponseBodyData getData() {
        return this.data;
    }

    public ReportCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReportCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReportCustomerResponseBodyDataResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public Boolean data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static ReportCustomerResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ReportCustomerResponseBodyDataResult self = new ReportCustomerResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ReportCustomerResponseBodyDataResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ReportCustomerResponseBodyDataResult setData(Boolean data) {
            this.data = data;
            return this;
        }
        public Boolean getData() {
            return this.data;
        }

        public ReportCustomerResponseBodyDataResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ReportCustomerResponseBodyDataResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ReportCustomerResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<ReportCustomerResponseBodyDataResult> result;

        public static ReportCustomerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReportCustomerResponseBodyData self = new ReportCustomerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReportCustomerResponseBodyData setResult(java.util.List<ReportCustomerResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ReportCustomerResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
