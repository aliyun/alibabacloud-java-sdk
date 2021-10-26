// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateProductSpecsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("IsHide")
    public Boolean isHide;

    @NameInMap("Unit")
    public Integer unit;

    @NameInMap("RpsValue")
    public Long rpsValue;

    @NameInMap("QuotaValue")
    public Long quotaValue;

    @NameInMap("LifeCycle")
    public Integer lifeCycle;

    public static CreateProductSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductSpecsRequest self = new CreateProductSpecsRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductSpecsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateProductSpecsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public CreateProductSpecsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProductSpecsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateProductSpecsRequest setIsHide(Boolean isHide) {
        this.isHide = isHide;
        return this;
    }
    public Boolean getIsHide() {
        return this.isHide;
    }

    public CreateProductSpecsRequest setUnit(Integer unit) {
        this.unit = unit;
        return this;
    }
    public Integer getUnit() {
        return this.unit;
    }

    public CreateProductSpecsRequest setRpsValue(Long rpsValue) {
        this.rpsValue = rpsValue;
        return this;
    }
    public Long getRpsValue() {
        return this.rpsValue;
    }

    public CreateProductSpecsRequest setQuotaValue(Long quotaValue) {
        this.quotaValue = quotaValue;
        return this;
    }
    public Long getQuotaValue() {
        return this.quotaValue;
    }

    public CreateProductSpecsRequest setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }
    public Integer getLifeCycle() {
        return this.lifeCycle;
    }

}
