// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityUnregisterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceIdentityUnregisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityUnregisterResponseBody self = new VoiceIdentityUnregisterResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityUnregisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
