// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateAndPayShrinkRequest extends TeaModel {
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
     */
    @NameInMap("Contact")
    public String contactShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXT_ORDER_001</p>
     */
    @NameInMap("ExternalOrderNo")
    public String externalOrderNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Guests")
    public String guestsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>itemOffer_123</p>
     */
    @NameInMap("ItemOfferId")
    public String itemOfferId;

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
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelCreateAndPayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateAndPayShrinkRequest self = new GlobalHotelCreateAndPayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateAndPayShrinkRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelCreateAndPayShrinkRequest setContactShrink(String contactShrink) {
        this.contactShrink = contactShrink;
        return this;
    }
    public String getContactShrink() {
        return this.contactShrink;
    }

    public GlobalHotelCreateAndPayShrinkRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public GlobalHotelCreateAndPayShrinkRequest setGuestsShrink(String guestsShrink) {
        this.guestsShrink = guestsShrink;
        return this;
    }
    public String getGuestsShrink() {
        return this.guestsShrink;
    }

    public GlobalHotelCreateAndPayShrinkRequest setItemOfferId(String itemOfferId) {
        this.itemOfferId = itemOfferId;
        return this;
    }
    public String getItemOfferId() {
        return this.itemOfferId;
    }

    public GlobalHotelCreateAndPayShrinkRequest setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
        return this;
    }
    public Integer getRoomCount() {
        return this.roomCount;
    }

    public GlobalHotelCreateAndPayShrinkRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
