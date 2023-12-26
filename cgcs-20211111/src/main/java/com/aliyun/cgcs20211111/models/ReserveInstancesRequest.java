// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReserveInstancesRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("DistrictId")
    public String districtId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ProjectId")
    public String projectId;

    public static ReserveInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReserveInstancesRequest self = new ReserveInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ReserveInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public ReserveInstancesRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public ReserveInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ReserveInstancesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
