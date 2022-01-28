// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    // 磁盘种类 高效云盘:cloud_efficiency 全闪云盘:cloud_ssd
    @NameInMap("Category")
    public String category;

    // 节点ID
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    // 实例付费方式，取值 PrePaid:预付费，包年包月 PostPaid:按量付费。目前只支持：PostPaid
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // 磁盘大小,单位GB
    @NameInMap("Size")
    public String size;

    public static CreateDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskRequest self = new CreateDiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDiskRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateDiskRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateDiskRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
