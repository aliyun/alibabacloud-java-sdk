// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayOrderRequest extends TeaModel {
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

    @NameInMap("SpecType")
    public String specType;

    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    public static CreatePrePayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayOrderRequest self = new CreatePrePayOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrePayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrePayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public CreatePrePayOrderRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePrePayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePrePayOrderRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePrePayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePrePayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePrePayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePrePayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

}
