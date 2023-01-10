// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsResponseBody extends TeaModel {
    // The ARN of the resource. 
    // 
    // > You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource.
    @NameInMap("resourceArn")
    public String resourceArn;

    // The tag dictionary.
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
