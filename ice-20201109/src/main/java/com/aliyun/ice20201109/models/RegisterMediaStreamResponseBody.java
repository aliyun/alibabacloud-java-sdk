// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaStreamResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

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
