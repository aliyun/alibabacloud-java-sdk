// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAudioAuditConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BF95F2A-3B24-4CDE-9346-7F6FA86697A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveAudioAuditConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAudioAuditConfigResponseBody self = new AddLiveAudioAuditConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveAudioAuditConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
