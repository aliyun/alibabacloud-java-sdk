// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationCancelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6CF2815C-<strong><strong>-</strong></strong>-B52E-FF6E2****492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VideoModerationCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationCancelResponseBody self = new VideoModerationCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoModerationCancelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public VideoModerationCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VideoModerationCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
