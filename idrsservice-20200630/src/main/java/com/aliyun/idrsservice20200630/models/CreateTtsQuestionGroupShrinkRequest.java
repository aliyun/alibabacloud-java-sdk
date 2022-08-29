// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionGroupShrinkRequest extends TeaModel {
    @NameInMap("Request")
    public String requestShrink;

    public static CreateTtsQuestionGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionGroupShrinkRequest self = new CreateTtsQuestionGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionGroupShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

}
