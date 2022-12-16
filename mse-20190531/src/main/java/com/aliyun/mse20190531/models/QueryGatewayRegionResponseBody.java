// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGatewayRegionResponseBody extends TeaModel {
    // The request is processed successfully.
    @NameInMap("Code")
    public Integer code;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Data")
    public java.util.List<String> data;

    // The ID of the request.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The HTTP status code returned.
    @NameInMap("Message")
    public String message;

    // The data structure.
    @NameInMap("RequestId")
    public String requestId;

    // The status code returned.
    @NameInMap("Success")
    public Boolean success;

    public static QueryGatewayRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayRegionResponseBody self = new QueryGatewayRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGatewayRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryGatewayRegionResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public QueryGatewayRegionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryGatewayRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGatewayRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGatewayRegionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
