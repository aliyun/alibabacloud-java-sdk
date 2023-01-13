// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsResponseBody extends TeaModel {
    /**
     * <p>The ARN of the resource. </p>
     * <br>
     * <p>> You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource.</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    /**
     * <p>The tag dictionary.</p>
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
