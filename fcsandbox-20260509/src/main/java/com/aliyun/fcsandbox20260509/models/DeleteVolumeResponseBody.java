// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DeleteVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVolumeResponseBody self = new DeleteVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVolumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteVolumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
