// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionShrinkRequest extends TeaModel {
    @NameInMap("Request")
    public String requestShrink;

    public static CreateTtsQuestionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionShrinkRequest self = new CreateTtsQuestionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

}
