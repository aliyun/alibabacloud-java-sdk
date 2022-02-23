// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryUnpaidOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Long> data;

    @NameInMap("ErrCode")
    public Integer errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUnpaidOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUnpaidOrderResponseBody self = new QueryUnpaidOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUnpaidOrderResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public QueryUnpaidOrderResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public QueryUnpaidOrderResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryUnpaidOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryUnpaidOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnpaidOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
