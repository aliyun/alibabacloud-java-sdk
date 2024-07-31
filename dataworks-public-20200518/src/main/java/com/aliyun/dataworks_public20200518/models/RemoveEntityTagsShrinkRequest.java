// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveEntityTagsShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the entity. Example: maxcompute-table.projectA.tableA.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.projectA.tableA</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The tag keys.</p>
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
