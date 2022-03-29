// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BucketInfo extends TeaModel {
    // Bucket读写权限类型： public-read-write：公共读写 public-read：公共读 private：私有（默认值）
    @NameInMap("BucketAcl")
    public String bucketAcl;

    // Bucket名称。 3~50 个字符，只允许小写字母、数字、短横线（-），且不能以短横线开头或结尾。
    @NameInMap("BucketName")
    public String bucketName;

    // 备注。 1-128个字符或汉字，UTF-8编码。
    @NameInMap("Comment")
    public String comment;

    // Bucket创建时间。 （格式：yyyy-mm-ddThh:mm:ss.timezone, 例如 2011-12-01T12:27:13.000Z）
    @NameInMap("CreateTime")
    public String createTime;

    // 指定Bucket的数据容灾类型。 取值范围： LRS（默认值）。本地冗余LRS ZRS 同城冗余ZRS采用多可用区（AZ）机制。
    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    // Bucket的调度类型： node：节点(同城) area：区域(多城市) global：全局(全国)
    @NameInMap("DispatcherType")
    public String dispatcherType;

    // 访问域名，边缘存储取值： eos.aliyuncs.com
    @NameInMap("Endpoint")
    public String endpoint;

    // 节点区域id，如果为空表示全局
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    // Bucket修改时间。 （格式：yyyy-mm-ddThh:mm:ss.timezone, 例如 2011-12-01T12:27:13.000Z）
    @NameInMap("ModifyTime")
    public String modifyTime;

    // 指定Bucket的资源类型。 取值范围： general：通用 national-network：国网
    @NameInMap("ResourceType")
    public String resourceType;

    // Bucket存储类型，支持Standard
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
