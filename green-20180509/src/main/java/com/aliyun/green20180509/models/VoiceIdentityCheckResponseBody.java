// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceIdentityCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityCheckResponseBody self = new VoiceIdentityCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
