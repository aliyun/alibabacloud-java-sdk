// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimilarImageCluster extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-08T09:42:34.354969088+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The custom tag.</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The similar images.</p>
     */
    @NameInMap("Files")
    public java.util.List<SimilarImage> files;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>SimilarImageCluster-748a041e-4ebc-4487-9e74-9c89b1****</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The time when the cluster was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-08T09:42:34.354969088+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static SimilarImageCluster build(java.util.Map<String, ?> map) throws Exception {
        SimilarImageCluster self = new SimilarImageCluster();
        return TeaModel.build(map, self);
    }

    public SimilarImageCluster setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SimilarImageCluster setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public SimilarImageCluster setFiles(java.util.List<SimilarImage> files) {
        this.files = files;
        return this;
    }
    public java.util.List<SimilarImage> getFiles() {
        return this.files;
    }

    public SimilarImageCluster setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public SimilarImageCluster setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
