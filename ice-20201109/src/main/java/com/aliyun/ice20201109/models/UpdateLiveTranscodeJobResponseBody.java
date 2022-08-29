// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeJobResponseBody self = new UpdateLiveTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
