// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>payasyougo</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("commodityCode")
    public String commodityCode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;CU&quot;:50,&quot;ord_time&quot;:&quot;1:Month&quot;,&quot;autoRenew&quot;:false}</p>
     */
    @NameInMap("commodityData")
    public String commodityData;

    /**
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
