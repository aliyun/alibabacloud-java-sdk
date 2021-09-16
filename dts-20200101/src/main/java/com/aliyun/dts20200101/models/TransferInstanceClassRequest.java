// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferInstanceClassRequest extends TeaModel {
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    public static TransferInstanceClassRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferInstanceClassRequest self = new TransferInstanceClassRequest();
        return TeaModel.build(map, self);
    }

    public TransferInstanceClassRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public TransferInstanceClassRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public TransferInstanceClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TransferInstanceClassRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

}
