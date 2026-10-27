// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TagResourceInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:xxx:functions/f1</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    public static TagResourceInput build(java.util.Map<String, ?> map) throws Exception {
        TagResourceInput self = new TagResourceInput();
        return TeaModel.build(map, self);
    }

    public TagResourceInput setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public TagResourceInput setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
