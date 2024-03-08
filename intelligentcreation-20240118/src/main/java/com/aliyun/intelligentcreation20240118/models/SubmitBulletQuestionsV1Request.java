// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsV1Request extends TeaModel {
    @NameInMap("body")
    public SubmitBulletQuestionsCmd body;

    public static SubmitBulletQuestionsV1Request build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsV1Request self = new SubmitBulletQuestionsV1Request();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsV1Request setBody(SubmitBulletQuestionsCmd body) {
        this.body = body;
        return this;
    }
    public SubmitBulletQuestionsCmd getBody() {
        return this.body;
    }

}
