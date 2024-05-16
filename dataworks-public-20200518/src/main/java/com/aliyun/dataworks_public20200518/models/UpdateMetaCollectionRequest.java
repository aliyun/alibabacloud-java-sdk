// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaCollectionRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The comment of the collection.</p>
     * <br>
     * <p>The comment must be 1 to 64 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the collection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
