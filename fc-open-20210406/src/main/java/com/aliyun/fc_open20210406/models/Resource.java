// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    // resourceArn
    @NameInMap("resourceArn")
    public String resourceArn;

    // tags
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public Resource setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
