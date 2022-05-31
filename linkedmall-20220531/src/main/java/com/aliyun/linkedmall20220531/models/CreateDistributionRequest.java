// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class CreateDistributionRequest extends TeaModel {
    // 业务号
    @NameInMap("BizId")
    public String bizId;

    // 客户ID
    @NameInMap("CustomerId")
    public String customerId;

    // 描述
    @NameInMap("Description")
    public String description;

    // 分销商商城id
    @NameInMap("DistributionMallId")
    public String distributionMallId;

    // 分销商id
    @NameInMap("DistributorId")
    public String distributorId;

    // 名称
    @NameInMap("Name")
    public String name;

    public static CreateDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionRequest self = new CreateDistributionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateDistributionRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateDistributionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDistributionRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public CreateDistributionRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public CreateDistributionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
