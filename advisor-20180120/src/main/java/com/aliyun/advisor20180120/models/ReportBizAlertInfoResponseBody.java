// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class ReportBizAlertInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReportBizAlertInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReportBizAlertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportBizAlertInfoResponseBody self = new ReportBizAlertInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportBizAlertInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReportBizAlertInfoResponseBody setData(ReportBizAlertInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReportBizAlertInfoResponseBodyData getData() {
        return this.data;
    }

    public ReportBizAlertInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReportBizAlertInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportBizAlertInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReportBizAlertInfoResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        public static ReportBizAlertInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReportBizAlertInfoResponseBodyData self = new ReportBizAlertInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReportBizAlertInfoResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
