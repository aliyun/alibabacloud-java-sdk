// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The configuration of the resource tag.</p>
     */
    @NameInMap("body")
    public TagResourcesInput body;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setBody(TagResourcesInput body) {
        this.body = body;
        return this;
    }
    public TagResourcesInput getBody() {
        return this.body;
    }

}
