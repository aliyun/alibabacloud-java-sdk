// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class TagResourceRequest extends TeaModel {
    /**
     * <p>The ARN of the resource.</p>
     * <blockquote>
     * <p>You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource. You can manage tags only for services for top level resources.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:188077086902****:services/demo</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    /**
     * <p>The tag dictionary.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;}</p>
     */
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
