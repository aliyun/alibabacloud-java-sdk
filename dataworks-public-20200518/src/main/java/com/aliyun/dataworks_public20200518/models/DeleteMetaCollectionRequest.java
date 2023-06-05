// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static DeleteMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionRequest self = new DeleteMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
