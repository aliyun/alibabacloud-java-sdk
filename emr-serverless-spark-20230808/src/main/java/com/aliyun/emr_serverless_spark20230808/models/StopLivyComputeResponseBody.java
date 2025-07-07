// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopLivyComputeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>484D9DDA-300D-525E-AF7A-0CCCA5C64A7A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StopLivyComputeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLivyComputeResponseBody self = new StopLivyComputeResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLivyComputeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopLivyComputeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopLivyComputeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
