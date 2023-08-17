// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ExtractFeedbackAdvanceRequest extends TeaModel {
    @NameInMap("FeedbackUrl")
    public java.io.InputStream feedbackUrlObject;

    public static ExtractFeedbackAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFeedbackAdvanceRequest self = new ExtractFeedbackAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ExtractFeedbackAdvanceRequest setFeedbackUrlObject(java.io.InputStream feedbackUrlObject) {
        this.feedbackUrlObject = feedbackUrlObject;
        return this;
    }
    public java.io.InputStream getFeedbackUrlObject() {
        return this.feedbackUrlObject;
    }

}
