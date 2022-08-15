// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class BindChannelBizToDistributionMallRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("TenantId")
    public String tenantId;

    public static BindChannelBizToDistributionMallRequest build(java.util.Map<String, ?> map) throws Exception {
        BindChannelBizToDistributionMallRequest self = new BindChannelBizToDistributionMallRequest();
        return TeaModel.build(map, self);
    }

    public BindChannelBizToDistributionMallRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BindChannelBizToDistributionMallRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public BindChannelBizToDistributionMallRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public BindChannelBizToDistributionMallRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public BindChannelBizToDistributionMallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
