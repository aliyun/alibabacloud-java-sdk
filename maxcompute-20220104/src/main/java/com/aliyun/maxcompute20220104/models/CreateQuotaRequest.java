// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    /**
     * <p>The billing method. Valid values: payasyougo (pay-as-you-go) and subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>payasyougo</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The commodity code. Example: On Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>), the commodity code for pay-as-you-go is odps and the commodity code for subscription is odpsplus. On Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>), the commodity code for pay-as-you-go is odps_intl and the commodity code for subscription is odpsplus_intl.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("commodityCode")
    public String commodityCode;

    /**
     * <p>The commodity specifications of the quota.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required only for subscription quotas.
     * The minimum unit for cu is 50.
     * ord_time supports monthly (month) and yearly (year) billing.</p>
     * </li>
     * <li><p>After creation, commodityData cannot be modified. To modify it, go to the MaxCompute console.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CU&quot;:50,&quot;ord_time&quot;:&quot;1:Month&quot;,&quot;autoRenew&quot;:false}</p>
     */
    @NameInMap("commodityData")
    public String commodityData;

    /**
     * <blockquote>
     * <p>Notice: This parameter is required only for subscription quotas.</p>
     * </blockquote>
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
