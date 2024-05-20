// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DistrictId")
    public String districtId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static ReleaseInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancesRequest self = new ReleaseInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public ReleaseInstancesRequest setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }
    public String getDistrictId() {
        return this.districtId;
    }

    public ReleaseInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ReleaseInstancesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
