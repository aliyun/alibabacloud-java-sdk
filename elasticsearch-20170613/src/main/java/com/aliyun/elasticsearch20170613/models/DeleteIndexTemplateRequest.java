// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteIndexTemplateRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DeleteIndexTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexTemplateRequest self = new DeleteIndexTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndexTemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
