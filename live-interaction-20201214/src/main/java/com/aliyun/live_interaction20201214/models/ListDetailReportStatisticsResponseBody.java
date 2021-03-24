// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListDetailReportStatisticsResponseBody extends TeaModel {
    // desc
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    // result
    @NameInMap("Result")
    public ListDetailReportStatisticsResponseBodyResult result;

    public static ListDetailReportStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetailReportStatisticsResponseBody self = new ListDetailReportStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetailReportStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDetailReportStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetailReportStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDetailReportStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDetailReportStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDetailReportStatisticsResponseBody setResult(ListDetailReportStatisticsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDetailReportStatisticsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDetailReportStatisticsResponseBodyResult extends TeaModel {
        // 数据
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        public static ListDetailReportStatisticsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDetailReportStatisticsResponseBodyResult self = new ListDetailReportStatisticsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDetailReportStatisticsResponseBodyResult setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

    }

}
