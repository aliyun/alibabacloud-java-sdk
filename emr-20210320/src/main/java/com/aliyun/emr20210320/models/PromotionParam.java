// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PromotionParam extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PromotionOptionCode")
    public String promotionOptionCode;

    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    public static PromotionParam build(java.util.Map<String, ?> map) throws Exception {
        PromotionParam self = new PromotionParam();
        return TeaModel.build(map, self);
    }

    public PromotionParam setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PromotionParam setPromotionOptionCode(String promotionOptionCode) {
        this.promotionOptionCode = promotionOptionCode;
        return this;
    }
    public String getPromotionOptionCode() {
        return this.promotionOptionCode;
    }

    public PromotionParam setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}
