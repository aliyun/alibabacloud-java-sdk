// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIllustrationTaskRequest extends TeaModel {
    @NameInMap("body")
    public IllustrationTaskCreateCmd body;

    public static CreateIllustrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIllustrationTaskRequest self = new CreateIllustrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateIllustrationTaskRequest setBody(IllustrationTaskCreateCmd body) {
        this.body = body;
        return this;
    }
    public IllustrationTaskCreateCmd getBody() {
        return this.body;
    }

}
