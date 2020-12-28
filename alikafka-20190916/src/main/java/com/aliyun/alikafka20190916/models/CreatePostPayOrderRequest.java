// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopicQuota")
    public Integer topicQuota;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DiskSize")
    public Integer diskSize;

    @NameInMap("DeployType")
    public Integer deployType;

    @NameInMap("IoMax")
    public Integer ioMax;

    @NameInMap("EipMax")
    public Integer eipMax;

    @NameInMap("PaidType")
    public Integer paidType;

    @NameInMap("SpecType")
    public String specType;

    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    public static CreatePostPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayOrderRequest self = new CreatePostPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePostPayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePostPayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public CreatePostPayOrderRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePostPayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePostPayOrderRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePostPayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePostPayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePostPayOrderRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePostPayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePostPayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

}
