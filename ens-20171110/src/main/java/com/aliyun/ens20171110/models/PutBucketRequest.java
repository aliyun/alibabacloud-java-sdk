// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketRequest extends TeaModel {
    /**
     * <p>Bucket permission type: private (default). public-read-write: Allows public read and write access. public-read: Allows public read access.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("BucketAcl")
    public String bucketAcl;

    /**
     * <p>Bucket name. Must be 3 to 50 characters long. Use only lowercase letters, numbers, and hyphens (-). Cannot start or end with a hyphen.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>Comment. Up to 128 characters, including letters, digits, Chinese characters, and emojis.</p>
     * 
     * <strong>example:</strong>
     * <p>this is comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Scheduling scope. Valid values:</p>
     * <ul>
     * <li><p>domestic (within China)</p>
     * </li>
     * <li><p>outside China</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify this parameter when creating a global bucket.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sink</p>
     */
    @NameInMap("DispatchScope")
    public String dispatchScope;

    /**
     * <p>Edge zone ID. If not specified, the global default edge zone is used.</p>
     * 
     * <strong>example:</strong>
     * <p>xx-xx-xx</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The logical type of the bucket. Valid values: sink: A sink bucket on a specified node. standard: A standard global bucket. This is the default value.</p>
     * 
     * <strong>example:</strong>
     * <p>sink</p>
     */
    @NameInMap("LogicalBucketType")
    public String logicalBucketType;

    public static PutBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketRequest self = new PutBucketRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketRequest setBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
        return this;
    }
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    public PutBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PutBucketRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public PutBucketRequest setDispatchScope(String dispatchScope) {
        this.dispatchScope = dispatchScope;
        return this;
    }
    public String getDispatchScope() {
        return this.dispatchScope;
    }

    public PutBucketRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public PutBucketRequest setLogicalBucketType(String logicalBucketType) {
        this.logicalBucketType = logicalBucketType;
        return this;
    }
    public String getLogicalBucketType() {
        return this.logicalBucketType;
    }

}
