// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PromotionInfo extends TeaModel {
    @NameInMap("CanPromFee")
    public String canPromFee;

    @NameInMap("IsSelected")
    public String isSelected;

    @NameInMap("PromotionDesc")
    public String promotionDesc;

    @NameInMap("PromotionName")
    public String promotionName;

    @NameInMap("PromotionOptionCode")
    public String promotionOptionCode;

    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    public static PromotionInfo build(java.util.Map<String, ?> map) throws Exception {
        PromotionInfo self = new PromotionInfo();
        return TeaModel.build(map, self);
    }

    public PromotionInfo setCanPromFee(String canPromFee) {
        this.canPromFee = canPromFee;
        return this;
    }
    public String getCanPromFee() {
        return this.canPromFee;
    }

    public PromotionInfo setIsSelected(String isSelected) {
        this.isSelected = isSelected;
        return this;
    }
    public String getIsSelected() {
        return this.isSelected;
    }

    public PromotionInfo setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
        return this;
    }
    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public PromotionInfo setPromotionName(String promotionName) {
        this.promotionName = promotionName;
        return this;
    }
    public String getPromotionName() {
        return this.promotionName;
    }

    public PromotionInfo setPromotionOptionCode(String promotionOptionCode) {
        this.promotionOptionCode = promotionOptionCode;
        return this;
    }
    public String getPromotionOptionCode() {
        return this.promotionOptionCode;
    }

    public PromotionInfo setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}
