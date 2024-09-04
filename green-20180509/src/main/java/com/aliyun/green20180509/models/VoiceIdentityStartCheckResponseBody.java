// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceIdentityStartCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartCheckResponseBody self = new VoiceIdentityStartCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
