// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags. This parameter takes effect only when no tag key is specified. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
     * <blockquote>
     * <p> You can use the value of this parameter to query information about the resource, such as the account, service, and region of the resource. You can manage tags only for services for top level resources.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:188077086902****:services/demo</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    /**
     * <p>The keys of the tags that you want to remove.</p>
     */
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
