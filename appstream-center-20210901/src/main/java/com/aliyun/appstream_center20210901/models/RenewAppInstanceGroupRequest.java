// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewAppInstanceGroupRequest extends TeaModel {
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
     * <p>Specifies whether to enable automatic payment. When the RenewMode parameter is set to RENEW_SPECIFIED_NODE_COUNT or RENEW_SPECIFIED_NODE_IDS, this parameter must be set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The numeric part of the subscription duration. This parameter is used together with the PeriodUnit parameter to specify the complete subscription duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. This parameter is used together with the Period parameter to specify the complete subscription duration. Valid combinations of Period and PeriodUnit are as follows:</p>
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
     * <p>This parameter is case-sensitive. For example, Week is valid, but week is invalid. If the request parameters do not match the preceding valid combinations, such as 2 Week, the API call may succeed, but an error will occur during the order placement stage.</p>
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
     * <p>The promotion ID. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/428503.html">GetResourcePrice</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The number of nodes to renew.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RenewAmount")
    public Integer renewAmount;

    /**
     * <p>The renewal mode.</p>
     * 
     * <strong>example:</strong>
     * <p>RENEW_ORIGINAL_CONFIG</p>
     */
    @NameInMap("RenewMode")
    public String renewMode;

    /**
     * <p>The IDs of the nodes to renew.</p>
     */
    @NameInMap("RenewNodes")
    public java.util.List<String> renewNodes;

    public static RenewAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAppInstanceGroupRequest self = new RenewAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public RenewAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public RenewAppInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewAppInstanceGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewAppInstanceGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public RenewAppInstanceGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewAppInstanceGroupRequest setRenewAmount(Integer renewAmount) {
        this.renewAmount = renewAmount;
        return this;
    }
    public Integer getRenewAmount() {
        return this.renewAmount;
    }

    public RenewAppInstanceGroupRequest setRenewMode(String renewMode) {
        this.renewMode = renewMode;
        return this;
    }
    public String getRenewMode() {
        return this.renewMode;
    }

    public RenewAppInstanceGroupRequest setRenewNodes(java.util.List<String> renewNodes) {
        this.renewNodes = renewNodes;
        return this;
    }
    public java.util.List<String> getRenewNodes() {
        return this.renewNodes;
    }

}
