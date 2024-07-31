// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetEntityTagsRequest extends TeaModel {
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
    public java.util.List<UserEntityTag> tags;

    public static SetEntityTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEntityTagsRequest self = new SetEntityTagsRequest();
        return TeaModel.build(map, self);
    }

    public SetEntityTagsRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public SetEntityTagsRequest setTags(java.util.List<UserEntityTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UserEntityTag> getTags() {
        return this.tags;
    }

}
