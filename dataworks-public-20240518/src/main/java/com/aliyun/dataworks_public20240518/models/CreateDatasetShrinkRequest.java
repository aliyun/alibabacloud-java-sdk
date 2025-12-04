// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDatasetShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InitVersion")
    public String initVersionShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_oss_dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>DataWorks</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static CreateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetShrinkRequest self = new CreateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatasetShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDatasetShrinkRequest setInitVersionShrink(String initVersionShrink) {
        this.initVersionShrink = initVersionShrink;
        return this;
    }
    public String getInitVersionShrink() {
        return this.initVersionShrink;
    }

    public CreateDatasetShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasetShrinkRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateDatasetShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDatasetShrinkRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
