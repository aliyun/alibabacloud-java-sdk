// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    // Specifies whether to remove all tags. This parameter takes effect only when no tag key is specified. Valid values:
    //   - **true**: removes all tags. 
    //   - **false**: does not remove all tags.
    @NameInMap("all")
    public Boolean all;

    // The ARN of the resource. 
    // 
    // > You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource. You can manage tags only for services for top level resources.
    @NameInMap("resourceArn")
    public String resourceArn;

    // The keys of the tags that you want to remove.
    @NameInMap("tagKeys")
    public java.util.List<String> tagKeys;

    public static UntagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceRequest self = new UntagResourceRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourceRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourceRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public UntagResourceRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
