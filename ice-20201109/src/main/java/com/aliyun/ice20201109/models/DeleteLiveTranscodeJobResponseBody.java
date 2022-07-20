// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeJobResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveTranscodeJobResponseBody self = new DeleteLiveTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
