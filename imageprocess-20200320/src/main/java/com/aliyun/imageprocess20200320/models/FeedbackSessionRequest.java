// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class FeedbackSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69675e9ddaea4b1ca8b9ddbafd02edc2</p>
     */
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
