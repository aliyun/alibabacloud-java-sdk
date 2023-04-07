// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPreValidateShrinkRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("check_in")
    public String checkIn;

    @NameInMap("check_out")
    public String checkOut;

    @NameInMap("daily_list")
    public String dailyListShrink;

    @NameInMap("item_id")
    public Long itemId;

    @NameInMap("number_of_adults_per_room")
    public Integer numberOfAdultsPerRoom;

    @NameInMap("occupant_info_list")
    public String occupantInfoListShrink;

    @NameInMap("rate_plan_id")
    public Long ratePlanId;

    @NameInMap("room_id")
    public Long roomId;

    @NameInMap("room_num")
    public Integer roomNum;

    @NameInMap("search_room_price")
    public Long searchRoomPrice;

    @NameInMap("seller_id")
    public Long sellerId;

    @NameInMap("shid")
    public Long shid;

    public static HotelOrderPreValidateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPreValidateShrinkRequest self = new HotelOrderPreValidateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderPreValidateShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderPreValidateShrinkRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelOrderPreValidateShrinkRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelOrderPreValidateShrinkRequest setDailyListShrink(String dailyListShrink) {
        this.dailyListShrink = dailyListShrink;
        return this;
    }
    public String getDailyListShrink() {
        return this.dailyListShrink;
    }

    public HotelOrderPreValidateShrinkRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public HotelOrderPreValidateShrinkRequest setNumberOfAdultsPerRoom(Integer numberOfAdultsPerRoom) {
        this.numberOfAdultsPerRoom = numberOfAdultsPerRoom;
        return this;
    }
    public Integer getNumberOfAdultsPerRoom() {
        return this.numberOfAdultsPerRoom;
    }

    public HotelOrderPreValidateShrinkRequest setOccupantInfoListShrink(String occupantInfoListShrink) {
        this.occupantInfoListShrink = occupantInfoListShrink;
        return this;
    }
    public String getOccupantInfoListShrink() {
        return this.occupantInfoListShrink;
    }

    public HotelOrderPreValidateShrinkRequest setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
        return this;
    }
    public Long getRatePlanId() {
        return this.ratePlanId;
    }

    public HotelOrderPreValidateShrinkRequest setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }
    public Long getRoomId() {
        return this.roomId;
    }

    public HotelOrderPreValidateShrinkRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public HotelOrderPreValidateShrinkRequest setSearchRoomPrice(Long searchRoomPrice) {
        this.searchRoomPrice = searchRoomPrice;
        return this;
    }
    public Long getSearchRoomPrice() {
        return this.searchRoomPrice;
    }

    public HotelOrderPreValidateShrinkRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public HotelOrderPreValidateShrinkRequest setShid(Long shid) {
        this.shid = shid;
        return this;
    }
    public Long getShid() {
        return this.shid;
    }

}
