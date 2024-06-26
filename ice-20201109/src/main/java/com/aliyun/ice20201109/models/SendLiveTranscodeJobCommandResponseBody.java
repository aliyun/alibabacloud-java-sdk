// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendLiveTranscodeJobCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendLiveTranscodeJobCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendLiveTranscodeJobCommandResponseBody self = new SendLiveTranscodeJobCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public SendLiveTranscodeJobCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
