// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InitEnvironmentResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentResponseBody self = new InitEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InitEnvironmentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InitEnvironmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
