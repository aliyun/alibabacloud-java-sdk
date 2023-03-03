// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeDataByQueryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <br>
     * <p>*   2XX: The request was successful.</p>
     * <p>*   3XX: A redirection message was returned.</p>
     * <p>*   4XX: The request was invalid.</p>
     * <p>*   5XX: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The browser monitoring data returned for a successful call.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRetcodeDataByQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeDataByQueryResponseBody self = new GetRetcodeDataByQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRetcodeDataByQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRetcodeDataByQueryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetRetcodeDataByQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRetcodeDataByQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRetcodeDataByQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
