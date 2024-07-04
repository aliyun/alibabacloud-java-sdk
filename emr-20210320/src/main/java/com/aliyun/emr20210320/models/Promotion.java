// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Promotion extends TeaModel {
    /**
     * <p>产品码。</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>优惠券描述。</p>
     * 
     * <strong>example:</strong>
     * <p>5元优惠券（有效期至23年8月11日）</p>
     */
    @NameInMap("PromotionDesc")
    public String promotionDesc;

    /**
     * <p>优惠券名称。</p>
     * 
     * <strong>example:</strong>
     * <p>5元优惠券</p>
     */
    @NameInMap("PromotionName")
    public String promotionName;

    /**
     * <p>优惠券码。</p>
     * 
     * <strong>example:</strong>
     * <p>youhui_quan</p>
     */
    @NameInMap("PromotionOptionCode")
    public String promotionOptionCode;

    /**
     * <p>优惠券号。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ABC123</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    public static Promotion build(java.util.Map<String, ?> map) throws Exception {
        Promotion self = new Promotion();
        return TeaModel.build(map, self);
    }

    public Promotion setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Promotion setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
        return this;
    }
    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public Promotion setPromotionName(String promotionName) {
        this.promotionName = promotionName;
        return this;
    }
    public String getPromotionName() {
        return this.promotionName;
    }

    public Promotion setPromotionOptionCode(String promotionOptionCode) {
        this.promotionOptionCode = promotionOptionCode;
        return this;
    }
    public String getPromotionOptionCode() {
        return this.promotionOptionCode;
    }

    public Promotion setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}
