// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDatasetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>new comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataworks-dataset:3pXXXb8o0ngr07njhps1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>test_oss_dataset_new</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <h2>introduction</h2>
     */
    @NameInMap("Readme")
    public String readme;

    public static UpdateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetRequest self = new UpdateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateDatasetRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDatasetRequest setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

}
