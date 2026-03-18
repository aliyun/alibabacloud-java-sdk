// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    /**
     * <p>Billing type. Use payasyougo for pay-as-you-go or subscription for subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>payasyougo</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>Product code. For example:
     * Alibaba Cloud China Website (www\.aliyun.com): use odps for pay-as-you-go and odpsplus for subscription.
     * Alibaba Cloud International Website (www\.alibabacloud.com): use odps_intl for pay-as-you-go and odpsplus_intl for subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("commodityCode")
    public String commodityCode;

    /**
     * <p>Quota specification.</p>
     * <blockquote>
     * <p>Notice: Required only for subscription quotas.
     * The minimum CU value is 50.
     * ord_time supports month and year.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CU&quot;:50,&quot;ord_time&quot;:&quot;1:Month&quot;,&quot;autoRenew&quot;:false}</p>
     */
    @NameInMap("commodityData")
    public String commodityData;

    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Required only for subscription quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>MyQuota</p>
     */
    @NameInMap("partNickName")
    public String partNickName;

    public static CreateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaRequest self = new CreateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CreateQuotaRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateQuotaRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateQuotaRequest setCommodityData(String commodityData) {
        this.commodityData = commodityData;
        return this;
    }
    public String getCommodityData() {
        return this.commodityData;
    }

    public CreateQuotaRequest setPartNickName(String partNickName) {
        this.partNickName = partNickName;
        return this;
    }
    public String getPartNickName() {
        return this.partNickName;
    }

}
