// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketRequest extends TeaModel {
    @NameInMap("BucketAcl")
    public String bucketAcl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("DispatchScope")
    public String dispatchScope;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

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
