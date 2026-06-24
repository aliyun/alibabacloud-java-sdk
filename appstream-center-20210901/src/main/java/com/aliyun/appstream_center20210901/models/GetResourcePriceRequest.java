// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourcePriceRequest extends TeaModel {
    /**
     * <p>The quantity of resources to purchase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Long amount;

    /**
     * <p>The ID of the session instance type to purchase. You can call the <code>ListAppInstanceType</code> operation to obtain the ID.</p>
     * <p>Either AppInstanceType or NodeInstanceType must have a value. If both have values, NodeInstanceType is used.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.general</p>
     */
    @NameInMap("AppInstanceType")
    public String appInstanceType;

    /**
     * <p>The region ID of the delivery group. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the resource instance type to purchase. You can call the <a href="https://help.aliyun.com/document_detail/428502.html">ListNodeInstanceType</a> operation to obtain the ID.</p>
     * <p>Either AppInstanceType or NodeInstanceType must have a value. If both have values, NodeInstanceType is used.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.vgpu.4c8g.2g</p>
     */
    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    /**
     * <p>The numeric part of the purchase duration. This parameter is used together with PeriodUnit to specify the complete purchase duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit part of the purchase duration. This parameter is used together with Period to specify the complete purchase duration. The following combinations of Period and PeriodUnit are supported:</p>
     * <ul>
     * <li>1 Week (1 week)</li>
     * <li>1 Month (1 month)</li>
     * <li>2 Month (2 months)</li>
     * <li>3 Month (3 months)</li>
     * <li>6 Month (6 months)</li>
     * <li>1 Year (1 year)</li>
     * <li>2 Year (2 years)</li>
     * <li>3 Year (3 years)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is case-sensitive. For example, <code>Week</code> is valid, but <code>week</code> is invalid. If the request parameters do not match the supported combinations, such as <code>2 Week</code>, the API call succeeds but an error occurs during the order placement stage.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static GetResourcePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePriceRequest self = new GetResourcePriceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcePriceRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public GetResourcePriceRequest setAppInstanceType(String appInstanceType) {
        this.appInstanceType = appInstanceType;
        return this;
    }
    public String getAppInstanceType() {
        return this.appInstanceType;
    }

    public GetResourcePriceRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetResourcePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetResourcePriceRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public GetResourcePriceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public GetResourcePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public GetResourcePriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
