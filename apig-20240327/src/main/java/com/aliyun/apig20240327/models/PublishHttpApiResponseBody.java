// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishHttpApiResponseBody extends TeaModel {
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
     * <p>4BACB05C-3FE2-588F-9148-700C5C026B74</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PublishHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishHttpApiResponseBody self = new PublishHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublishHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
