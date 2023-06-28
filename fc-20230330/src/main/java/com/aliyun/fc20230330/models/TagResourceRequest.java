// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    @NameInMap("request")
    public TagResourceInput request;

    public static TagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourceRequest self = new TagResourceRequest();
        return TeaModel.build(map, self);
    }

    public TagResourceRequest setRequest(TagResourceInput request) {
        this.request = request;
        return this;
    }
    public TagResourceInput getRequest() {
        return this.request;
    }

}
