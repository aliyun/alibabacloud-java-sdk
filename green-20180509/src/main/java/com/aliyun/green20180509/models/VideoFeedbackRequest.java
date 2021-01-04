// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoFeedbackRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoFeedbackRequest self = new VideoFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public VideoFeedbackRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
