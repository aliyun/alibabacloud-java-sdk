// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateEdgeMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong> (default): generates the order without charging the account.</li>
     * </ul>
     * <blockquote>
     * <p>If your payment method has an insufficient balance, set this parameter to false. An unpaid order is generated. You can then log on to the Cloud Phone console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong> (default): disables auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The region where the agent is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The device form factor.</p>
     * 
     * <strong>example:</strong>
     * <p>BOX</p>
     */
    @NameInMap("DeviceClass")
    public String deviceClass;

    /**
     * <p>The subscription duration of the resource. The unit is specified by PeriodUnit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: month.</li>
     * <li><strong>Year</strong>: year.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotional activity.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The number of packages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    public static CreateEdgeMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMobileAgentPackageRequest self = new CreateEdgeMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMobileAgentPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateEdgeMobileAgentPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateEdgeMobileAgentPackageRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateEdgeMobileAgentPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEdgeMobileAgentPackageRequest setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
        return this;
    }
    public String getDeviceClass() {
        return this.deviceClass;
    }

    public CreateEdgeMobileAgentPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateEdgeMobileAgentPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateEdgeMobileAgentPackageRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateEdgeMobileAgentPackageRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

}
