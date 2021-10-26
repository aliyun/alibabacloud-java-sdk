// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    @NameInMap("resourceArn")
    public String resourceArn;

    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    public static TagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourceRequest self = new TagResourceRequest();
        return TeaModel.build(map, self);
    }

    public TagResourceRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public TagResourceRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
