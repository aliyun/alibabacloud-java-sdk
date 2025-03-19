// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UndeployHttpApiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UndeployHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UndeployHttpApiResponseBody self = new UndeployHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public UndeployHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UndeployHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UndeployHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
