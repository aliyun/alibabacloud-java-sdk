// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAuthTokenResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 means success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned authentication token.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiJ9******</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Additional Information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the query was successful:</p>
     * <ul>
     * <li>true: Success</li>
     * <li>false: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenResponseBody self = new GetAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAuthTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAuthTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
