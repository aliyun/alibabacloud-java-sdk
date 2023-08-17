// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ExtractFeedbackRequest extends TeaModel {
    @NameInMap("FeedbackUrl")
    public String feedbackUrl;

    public static ExtractFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFeedbackRequest self = new ExtractFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public ExtractFeedbackRequest setFeedbackUrl(String feedbackUrl) {
        this.feedbackUrl = feedbackUrl;
        return this;
    }
    public String getFeedbackUrl() {
        return this.feedbackUrl;
    }

}
