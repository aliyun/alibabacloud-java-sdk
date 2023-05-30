// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsResponseBody extends TeaModel {
    /**
     * <p>147258</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    public static GetResourceTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsResponseBody self = new GetResourceTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsResponseBody setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public GetResourceTagsResponseBody setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
