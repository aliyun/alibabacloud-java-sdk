// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class FeedbackSessionRequest extends TeaModel {
    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("SessionId")
    public String sessionId;

    public static FeedbackSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackSessionRequest self = new FeedbackSessionRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackSessionRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public FeedbackSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
