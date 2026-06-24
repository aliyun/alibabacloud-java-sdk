// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewAppInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The numeric part of the resource purchase duration. This parameter is used together with PeriodUnit to specify the complete purchase duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit part of the resource purchase duration. This parameter is used together with Period to specify the complete purchase duration. Valid combinations of Period and PeriodUnit:</p>
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
     * <p>This parameter is case-sensitive. For example, <code>Week</code> is valid, but <code>week</code> is invalid. If the request parameters do not match the combinations listed above, such as <code>2 Week</code>, the call to this operation succeeds, but an error occurs during the order placement phase.</p>
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

    /**
     * <p>The promotion ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/428503.html">GetResourcePrice</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RenewAmount")
    public Integer renewAmount;

    @NameInMap("RenewMode")
    public String renewMode;

    @NameInMap("RenewNodes")
    public String renewNodesShrink;

    public static RenewAppInstanceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAppInstanceGroupShrinkRequest self = new RenewAppInstanceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RenewAppInstanceGroupShrinkRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public RenewAppInstanceGroupShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewAppInstanceGroupShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewAppInstanceGroupShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewAppInstanceGroupShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public RenewAppInstanceGroupShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewAppInstanceGroupShrinkRequest setRenewAmount(Integer renewAmount) {
        this.renewAmount = renewAmount;
        return this;
    }
    public Integer getRenewAmount() {
        return this.renewAmount;
    }

    public RenewAppInstanceGroupShrinkRequest setRenewMode(String renewMode) {
        this.renewMode = renewMode;
        return this;
    }
    public String getRenewMode() {
        return this.renewMode;
    }

    public RenewAppInstanceGroupShrinkRequest setRenewNodesShrink(String renewNodesShrink) {
        this.renewNodesShrink = renewNodesShrink;
        return this;
    }
    public String getRenewNodesShrink() {
        return this.renewNodesShrink;
    }

}
