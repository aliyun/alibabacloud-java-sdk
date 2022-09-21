// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Promotion extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PromotionOptionCode")
    public String promotionOptionCode;

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
