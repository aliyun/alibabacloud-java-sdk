// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class UnbindChannelBizToDistributionMallRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("TargetBizId")
    public String targetBizId;

    @NameInMap("TargetSubBizId")
    public String targetSubBizId;

    @NameInMap("TenantId")
    public String tenantId;

    public static UnbindChannelBizToDistributionMallRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindChannelBizToDistributionMallRequest self = new UnbindChannelBizToDistributionMallRequest();
        return TeaModel.build(map, self);
    }

    public UnbindChannelBizToDistributionMallRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UnbindChannelBizToDistributionMallRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public UnbindChannelBizToDistributionMallRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public UnbindChannelBizToDistributionMallRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public UnbindChannelBizToDistributionMallRequest setTargetBizId(String targetBizId) {
        this.targetBizId = targetBizId;
        return this;
    }
    public String getTargetBizId() {
        return this.targetBizId;
    }

    public UnbindChannelBizToDistributionMallRequest setTargetSubBizId(String targetSubBizId) {
        this.targetSubBizId = targetSubBizId;
        return this;
    }
    public String getTargetSubBizId() {
        return this.targetSubBizId;
    }

    public UnbindChannelBizToDistributionMallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
