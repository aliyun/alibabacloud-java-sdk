// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
     * <blockquote>
     * <p> You can use the value of this parameter to query information about the resource, such as the account, service, and region of the resource.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:188077086902****:services/demo</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    /**
     * <p>The tag dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;}</p>
     */
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
