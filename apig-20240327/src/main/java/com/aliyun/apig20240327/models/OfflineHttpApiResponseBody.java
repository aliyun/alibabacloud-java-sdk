// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class OfflineHttpApiResponseBody extends TeaModel {
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
     * <p>53DE779E-422D-56EB-B84C-62D75CA5E8DD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static OfflineHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineHttpApiResponseBody self = new OfflineHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OfflineHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OfflineHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
