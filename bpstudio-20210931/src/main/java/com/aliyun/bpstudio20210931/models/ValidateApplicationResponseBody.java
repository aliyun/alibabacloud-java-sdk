// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValidateApplicationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateApplicationResponseBody self = new ValidateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ValidateApplicationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ValidateApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
