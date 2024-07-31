// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetEntityTagsShrinkRequest extends TeaModel {
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
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static SetEntityTagsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEntityTagsShrinkRequest self = new SetEntityTagsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetEntityTagsShrinkRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public SetEntityTagsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
