// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListDocsGroupByYearResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.Map<String, java.util.List<DataValue>> data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListDocsGroupByYearResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocsGroupByYearResponseBody self = new ListDocsGroupByYearResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocsGroupByYearResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDocsGroupByYearResponseBody setData(java.util.Map<String, java.util.List<DataValue>> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    public ListDocsGroupByYearResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDocsGroupByYearResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDocsGroupByYearResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocsGroupByYearResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
