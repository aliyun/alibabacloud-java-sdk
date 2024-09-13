// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketRequest extends TeaModel {
    /**
     * <p>The access control list (ACL) of the bucket. Valid values:</p>
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
     * <p>The scheduling scope. This parameter takes effect only when the value of the LogicalBucketType parameter is standard. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland.</li>
     * <li><strong>oversea</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("DispatchScope")
    public String dispatchScope;

    /**
     * <p>The region ID of the node. This parameter is required if the value of the LogicalBucketType parameter is sink.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-15</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The type of the bucket. Valid values:</p>
     * <ul>
     * <li><strong>sink</strong>: single-node bucket.</li>
     * <li><strong>standard</strong>: bucket for global scheduling.</li>
     * </ul>
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
