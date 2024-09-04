// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartRegisterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceIdentityStartRegisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartRegisterResponseBody self = new VoiceIdentityStartRegisterResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartRegisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
