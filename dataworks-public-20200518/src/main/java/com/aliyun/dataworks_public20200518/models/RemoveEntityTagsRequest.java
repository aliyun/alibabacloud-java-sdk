// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveEntityTagsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
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
