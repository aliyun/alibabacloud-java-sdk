// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPreValidateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("check_in")
    public String checkIn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("check_out")
    public String checkOut;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("daily_list")
    public java.util.List<HotelOrderPreValidateRequestDailyList> dailyList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("item_id")
    public Long itemId;

    @NameInMap("number_of_adults_per_room")
    public Integer numberOfAdultsPerRoom;

    @NameInMap("occupant_info_list")
    public java.util.List<HotelOrderPreValidateRequestOccupantInfoList> occupantInfoList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("rate_plan_id")
    public Long ratePlanId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("room_id")
    public Long roomId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("room_num")
    public Integer roomNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_room_price")
    public Long searchRoomPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("seller_id")
    public Long sellerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("shid")
    public Long shid;

    public static HotelOrderPreValidateRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPreValidateRequest self = new HotelOrderPreValidateRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderPreValidateRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderPreValidateRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelOrderPreValidateRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelOrderPreValidateRequest setDailyList(java.util.List<HotelOrderPreValidateRequestDailyList> dailyList) {
        this.dailyList = dailyList;
        return this;
    }
    public java.util.List<HotelOrderPreValidateRequestDailyList> getDailyList() {
        return this.dailyList;
    }

    public HotelOrderPreValidateRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public HotelOrderPreValidateRequest setNumberOfAdultsPerRoom(Integer numberOfAdultsPerRoom) {
        this.numberOfAdultsPerRoom = numberOfAdultsPerRoom;
        return this;
    }
    public Integer getNumberOfAdultsPerRoom() {
        return this.numberOfAdultsPerRoom;
    }

    public HotelOrderPreValidateRequest setOccupantInfoList(java.util.List<HotelOrderPreValidateRequestOccupantInfoList> occupantInfoList) {
        this.occupantInfoList = occupantInfoList;
        return this;
    }
    public java.util.List<HotelOrderPreValidateRequestOccupantInfoList> getOccupantInfoList() {
        return this.occupantInfoList;
    }

    public HotelOrderPreValidateRequest setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
        return this;
    }
    public Long getRatePlanId() {
        return this.ratePlanId;
    }

    public HotelOrderPreValidateRequest setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }
    public Long getRoomId() {
        return this.roomId;
    }

    public HotelOrderPreValidateRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public HotelOrderPreValidateRequest setSearchRoomPrice(Long searchRoomPrice) {
        this.searchRoomPrice = searchRoomPrice;
        return this;
    }
    public Long getSearchRoomPrice() {
        return this.searchRoomPrice;
    }

    public HotelOrderPreValidateRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public HotelOrderPreValidateRequest setShid(Long shid) {
        this.shid = shid;
        return this;
    }
    public Long getShid() {
        return this.shid;
    }

    public static class HotelOrderPreValidateRequestDailyList extends TeaModel {
        @NameInMap("board")
        public String board;

        @NameInMap("price")
        public Long price;

        @NameInMap("rate_start_time")
        public String rateStartTime;

        @NameInMap("room_count")
        public Integer roomCount;

        public static HotelOrderPreValidateRequestDailyList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateRequestDailyList self = new HotelOrderPreValidateRequestDailyList();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateRequestDailyList setBoard(String board) {
            this.board = board;
            return this;
        }
        public String getBoard() {
            return this.board;
        }

        public HotelOrderPreValidateRequestDailyList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelOrderPreValidateRequestDailyList setRateStartTime(String rateStartTime) {
            this.rateStartTime = rateStartTime;
            return this;
        }
        public String getRateStartTime() {
            return this.rateStartTime;
        }

        public HotelOrderPreValidateRequestDailyList setRoomCount(Integer roomCount) {
            this.roomCount = roomCount;
            return this;
        }
        public Integer getRoomCount() {
            return this.roomCount;
        }

    }

    public static class HotelOrderPreValidateRequestOccupantInfoList extends TeaModel {
        @NameInMap("card_no")
        public String cardNo;

        @NameInMap("card_type")
        public Integer cardType;

        @NameInMap("name")
        public String name;

        @NameInMap("phone")
        public String phone;

        @NameInMap("staff_no")
        public String staffNo;

        @NameInMap("user_type")
        public Integer userType;

        public static HotelOrderPreValidateRequestOccupantInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateRequestOccupantInfoList self = new HotelOrderPreValidateRequestOccupantInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateRequestOccupantInfoList setCardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }
        public String getCardNo() {
            return this.cardNo;
        }

        public HotelOrderPreValidateRequestOccupantInfoList setCardType(Integer cardType) {
            this.cardType = cardType;
            return this;
        }
        public Integer getCardType() {
            return this.cardType;
        }

        public HotelOrderPreValidateRequestOccupantInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotelOrderPreValidateRequestOccupantInfoList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public HotelOrderPreValidateRequestOccupantInfoList setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            return this;
        }
        public String getStaffNo() {
            return this.staffNo;
        }

        public HotelOrderPreValidateRequestOccupantInfoList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
