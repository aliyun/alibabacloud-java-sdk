// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class OmniAnswerRequest extends TeaModel {
    @NameInMap("body")
    public OmniSearchQuery body;

    public static OmniAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        OmniAnswerRequest self = new OmniAnswerRequest();
        return TeaModel.build(map, self);
    }

    public OmniAnswerRequest setBody(OmniSearchQuery body) {
        this.body = body;
        return this;
    }
    public OmniSearchQuery getBody() {
        return this.body;
    }

}
