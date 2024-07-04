// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketRequest extends TeaModel {
    /**
     * <p>The access control list (ACL) of the bucket.</p>
     * <ul>
     * <li><strong>private</strong> (default)</li>
     * <li><strong>public-read-write</strong></li>
     * <li><strong>public-read</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("BucketAcl")
    public String bucketAcl;

    /**
     * <p>The name of the bucket. This parameter can contain 3 to 50 characters in length and can contain only lowercase letters, digits, and hyphens (-). The name cannot start or end with a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The remarks. The remarks are 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>numb</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Scheduling Scope, this parameter is only effective for globally scheduled Buckets.</p>
     * <ul>
     * <li><p>domestic</p>
     * </li>
     * <li><p>oversea</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("DispatchScope")
    public String dispatchScope;

    /**
     * <p>The ID of the region where the node is located. If this parameter is not specified, the node is the global default node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-15</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>Single-node storage. Set the value to sink.</p>
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
