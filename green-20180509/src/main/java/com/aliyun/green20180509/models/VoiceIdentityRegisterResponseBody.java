// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityRegisterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceIdentityRegisterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityRegisterResponseBody self = new VoiceIdentityRegisterResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityRegisterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
