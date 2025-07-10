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
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false: manual payment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The subscription duration of resources. This parameter must be configured together with <code>PeriodUnit</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. This parameter must be configured together with <code>Period</code>. The following items describe valid values for the combinations of <code>Period</code> and <code>PeriodUnit</code>:</p>
     * <ul>
     * <li>1 Week</li>
     * <li>1 Month</li>
     * <li>2 Month</li>
     * <li>3 Month</li>
     * <li>6 Month</li>
     * <li>1 Year</li>
     * <li>2 Year</li>
     * <li>3 Year</li>
     * </ul>
     * <blockquote>
     * <p> The value of this parameter is case-insensitive. For example, <code>Week</code> is valid and <code>week</code> is invalid. If you specify a value combination other than the preceding combinations, such as <code>2 Week</code>, the operation can still be called. However, an error occurs when you place the order.</p>
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
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The promotion ID. You can call the <a href="https://help.aliyun.com/document_detail/428503.html">GetResourcePrice</a> operation to obtain the ID.</p>
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
