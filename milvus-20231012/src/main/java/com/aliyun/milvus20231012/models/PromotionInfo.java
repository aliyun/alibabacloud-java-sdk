// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class PromotionInfo extends TeaModel {
    /**
     * <p>The available discount amount.</p>
     */
    @NameInMap("canPromFee")
    public String canPromFee;

    /**
     * <p>Specifies whether the promotion is selected.</p>
     */
    @NameInMap("isSelected")
    public Boolean isSelected;

    /**
     * <p>The promotion description.</p>
     */
    @NameInMap("promotionDesc")
    public String promotionDesc;

    /**
     * <p>The promotion name.</p>
     */
    @NameInMap("promotionName")
    public String promotionName;

    /**
     * <p>The promotion option code.</p>
     */
    @NameInMap("promotionOptionCode")
    public String promotionOptionCode;

    /**
     * <p>The promotion option number.</p>
     */
    @NameInMap("promotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>Indicates whether the promotion is selected.</p>
     */
    @NameInMap("selected")
    public Boolean selected;

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

    public PromotionInfo setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }
    public Boolean getIsSelected() {
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

    public PromotionInfo setSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }
    public Boolean getSelected() {
        return this.selected;
    }

}
