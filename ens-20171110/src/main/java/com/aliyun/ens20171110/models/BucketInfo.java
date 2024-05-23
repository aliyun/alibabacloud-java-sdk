// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BucketInfo extends TeaModel {
    @NameInMap("BucketAcl")
    public String bucketAcl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    @NameInMap("DispatcherType")
    public String dispatcherType;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("StorageClass")
    public String storageClass;

    public static BucketInfo build(java.util.Map<String, ?> map) throws Exception {
        BucketInfo self = new BucketInfo();
        return TeaModel.build(map, self);
    }

    public BucketInfo setBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
        return this;
    }
    public String getBucketAcl() {
        return this.bucketAcl;
    }

    public BucketInfo setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public BucketInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public BucketInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BucketInfo setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public BucketInfo setDispatcherType(String dispatcherType) {
        this.dispatcherType = dispatcherType;
        return this;
    }
    public String getDispatcherType() {
        return this.dispatcherType;
    }

    public BucketInfo setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public BucketInfo setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public BucketInfo setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public BucketInfo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public BucketInfo setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
