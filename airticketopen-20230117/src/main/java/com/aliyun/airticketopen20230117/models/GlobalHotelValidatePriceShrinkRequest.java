// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelValidatePriceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Adults")
    public Integer adults;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Children")
    public Integer children;

    /**
     * <strong>example:</strong>
     * <p>[8]</p>
     */
    @NameInMap("ChildrenAges")
    public String childrenAgesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>itemOfferKey_abc123</p>
     */
    @NameInMap("ItemOfferKey")
    public String itemOfferKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoomCount")
    public Integer roomCount;

    /**
     * <strong>example:</strong>
     * <p>TracerId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelValidatePriceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelValidatePriceShrinkRequest self = new GlobalHotelValidatePriceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelValidatePriceShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelValidatePriceShrinkRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public GlobalHotelValidatePriceShrinkRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public GlobalHotelValidatePriceShrinkRequest setChildrenAgesShrink(String childrenAgesShrink) {
        this.childrenAgesShrink = childrenAgesShrink;
        return this;
    }
    public String getChildrenAgesShrink() {
        return this.childrenAgesShrink;
    }

    public GlobalHotelValidatePriceShrinkRequest setItemOfferKey(String itemOfferKey) {
        this.itemOfferKey = itemOfferKey;
        return this;
    }
    public String getItemOfferKey() {
        return this.itemOfferKey;
    }

    public GlobalHotelValidatePriceShrinkRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelValidatePriceShrinkRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
