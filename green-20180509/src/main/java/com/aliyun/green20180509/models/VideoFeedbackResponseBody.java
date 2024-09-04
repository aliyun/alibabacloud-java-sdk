// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoFeedbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VideoFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoFeedbackResponseBody self = new VideoFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
