// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    @NameInMap("body")
    public TagResourceInput body;

    public static TagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourceRequest self = new TagResourceRequest();
        return TeaModel.build(map, self);
    }

    public TagResourceRequest setBody(TagResourceInput body) {
        this.body = body;
        return this;
    }
    public TagResourceInput getBody() {
        return this.body;
    }

}
