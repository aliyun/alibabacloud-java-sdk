// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetOverviewResponseBody extends TeaModel {
    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>illegalRequest</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOverviewResponseBody self = new GetOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOverviewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetOverviewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOverviewResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOverviewResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
