// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class UnbindChannelBizToDistributionMallRequest extends TeaModel {
    // 业务id
    @NameInMap("BizId")
    public String bizId;

    // 商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 子业务编码
    @NameInMap("SubBizId")
    public String subBizId;

    // 目标业务id
    @NameInMap("TargetBizId")
    public String targetBizId;

    // 目标子业务编码
    @NameInMap("TargetSubBizId")
    public String targetSubBizId;

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

}
