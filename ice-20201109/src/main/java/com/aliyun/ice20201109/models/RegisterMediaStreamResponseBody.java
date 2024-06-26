// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5e778ec0027b71ed80a8909598506302</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterMediaStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaStreamResponseBody self = new RegisterMediaStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaStreamResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public RegisterMediaStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
