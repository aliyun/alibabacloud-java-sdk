// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteComponentIndexRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DeleteComponentIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentIndexRequest self = new DeleteComponentIndexRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComponentIndexRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
