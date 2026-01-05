// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDatasetVersionRequest extends TeaModel {
    /**
     * <p>The dataset version description. Maximum length: 1024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The dataset version ID. Only DataWorks datasets can be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-datasetVersion:3pXXXb8o0ngr07njhps1
     * :2</p>
     */
    @NameInMap("Id")
    public String id;

    public static UpdateDatasetVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetVersionRequest self = new UpdateDatasetVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetVersionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateDatasetVersionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
