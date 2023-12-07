// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all tags.</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The resource ID.</p>
     */
    @NameInMap("arn")
    public String arn;

    /**
     * <p>The tag name.</p>
     */
    @NameInMap("tagKeys")
    public String tagKeys;

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

    public UntagResourceRequest setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public UntagResourceRequest setTagKeys(String tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public String getTagKeys() {
        return this.tagKeys;
    }

}
