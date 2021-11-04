// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoResponseBody extends TeaModel {
    // ICE媒资ID
    @NameInMap("MediaId")
    public String mediaId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaInfoResponseBody self = new RegisterMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaInfoResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public RegisterMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
