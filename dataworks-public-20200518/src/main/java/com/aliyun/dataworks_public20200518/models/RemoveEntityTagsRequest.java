// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveEntityTagsRequest extends TeaModel {
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
    public java.util.List<String> tagKeys;

    public static RemoveEntityTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityTagsRequest self = new RemoveEntityTagsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntityTagsRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public RemoveEntityTagsRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
