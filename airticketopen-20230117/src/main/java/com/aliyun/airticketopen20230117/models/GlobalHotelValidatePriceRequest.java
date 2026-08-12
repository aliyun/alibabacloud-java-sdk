// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelValidatePriceRequest extends TeaModel {
    /**
     * <p>The distributor account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>The number of adults per room.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Adults")
    public Integer adults;

    /**
     * <p>The number of children per room.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Children")
    public Integer children;

    /**
     * <p>The list of children ages.</p>
     * 
     * <strong>example:</strong>
     * <p>[8]</p>
     */
    @NameInMap("ChildrenAges")
    public java.util.List<Integer> childrenAges;

    /**
     * <p>The offer key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>itemOfferKey_abc123</p>
     */
    @NameInMap("ItemOfferKey")
    public String itemOfferKey;

    /**
     * <p>The number of rooms.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoomCount")
    public Integer roomCount;

    /**
     * <p>TracerId</p>
     * 
     * <strong>example:</strong>
     * <p>TracerId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelValidatePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelValidatePriceRequest self = new GlobalHotelValidatePriceRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelValidatePriceRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelValidatePriceRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public GlobalHotelValidatePriceRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public GlobalHotelValidatePriceRequest setChildrenAges(java.util.List<Integer> childrenAges) {
        this.childrenAges = childrenAges;
        return this;
    }
    public java.util.List<Integer> getChildrenAges() {
        return this.childrenAges;
    }

    public GlobalHotelValidatePriceRequest setItemOfferKey(String itemOfferKey) {
        this.itemOfferKey = itemOfferKey;
        return this;
    }
    public String getItemOfferKey() {
        return this.itemOfferKey;
    }

    public GlobalHotelValidatePriceRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelValidatePriceRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
