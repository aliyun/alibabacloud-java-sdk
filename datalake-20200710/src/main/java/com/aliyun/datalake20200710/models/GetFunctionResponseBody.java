// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetFunctionResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FunctionName&quot;:test}</p>
     */
    @NameInMap("Function")
    public Function function;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7F4B621-E41E-4C84-B97F-42B5380A32BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponseBody self = new GetFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionResponseBody setFunction(Function function) {
        this.function = function;
        return this;
    }
    public Function getFunction() {
        return this.function;
    }

    public GetFunctionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
