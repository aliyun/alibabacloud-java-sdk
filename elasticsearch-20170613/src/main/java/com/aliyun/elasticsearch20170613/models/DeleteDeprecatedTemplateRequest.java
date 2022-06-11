// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDeprecatedTemplateRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DeleteDeprecatedTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeprecatedTemplateRequest self = new DeleteDeprecatedTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeprecatedTemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
