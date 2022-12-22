// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaCollectionRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Name")
    public String name;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static UpdateMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCollectionRequest self = new UpdateMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCollectionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateMetaCollectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMetaCollectionRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
