// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateSavingsPlansInstanceRequest extends TeaModel {
    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>savingplan_common_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The service duration. This parameter is used together with the PricingCycle parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The time when the savings plan takes effect. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-31T00:00:00Z</p>
     */
    @NameInMap("EffectiveDate")
    public String effectiveDate;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExtendMap")
    public java.util.Map<String, String> extendMap;

    /**
     * <p>The payment mode. Valid values:</p>
     * <ul>
     * <li>total: all upfront</li>
     * <li>half: partial upfront</li>
     * <li>zero: no upfront</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>total</p>
     */
    @NameInMap("PayMode")
    public String payMode;

    /**
     * <p>The contracted amount. unit: CNY</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("PoolValue")
    public String poolValue;

    /**
     * <p>The unit of the service duration. This parameter is used together with the During parameter. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the region in which you create the savings plan. You must specify this parameter if the Type parameter is not set to universal.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The specification type. This parameter is used together with the Specification parameter. You must specify this parameter if the Type parameter is not set to universal. Valid values:</p>
     * <ul>
     * <li>group: specification group</li>
     * <li>family: specification family</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>family</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The specifications of the savings plan. This parameter is used together with the SpecType parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The type of the savings plan. Valid values:</p>
     * <ul>
     * <li>universal: general-purpose type</li>
     * <li>ecs: ECS compute type</li>
     * <li>elasticy: elastic type</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>universal</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateSavingsPlansInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlansInstanceRequest self = new CreateSavingsPlansInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlansInstanceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateSavingsPlansInstanceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateSavingsPlansInstanceRequest setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public CreateSavingsPlansInstanceRequest setExtendMap(java.util.Map<String, String> extendMap) {
        this.extendMap = extendMap;
        return this;
    }
    public java.util.Map<String, String> getExtendMap() {
        return this.extendMap;
    }

    public CreateSavingsPlansInstanceRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public CreateSavingsPlansInstanceRequest setPoolValue(String poolValue) {
        this.poolValue = poolValue;
        return this;
    }
    public String getPoolValue() {
        return this.poolValue;
    }

    public CreateSavingsPlansInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateSavingsPlansInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSavingsPlansInstanceRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreateSavingsPlansInstanceRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreateSavingsPlansInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
