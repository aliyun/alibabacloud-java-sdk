// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class InitAppFailOverResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>7250</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <strong>example:</strong>
     * <p>Unsupported Operation PrepareEvent-&gt;FailOverPrepareSuccess FoApp_DDLJK2WM8ETU9JAC</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitAppFailOverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitAppFailOverResponseBody self = new InitAppFailOverResponseBody();
        return TeaModel.build(map, self);
    }

    public InitAppFailOverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitAppFailOverResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public InitAppFailOverResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitAppFailOverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
