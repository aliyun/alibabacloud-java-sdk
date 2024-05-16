// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveEntityTagsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagKeys")
    public String tagKeysShrink;

    public static RemoveEntityTagsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityTagsShrinkRequest self = new RemoveEntityTagsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntityTagsShrinkRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public RemoveEntityTagsShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

}
