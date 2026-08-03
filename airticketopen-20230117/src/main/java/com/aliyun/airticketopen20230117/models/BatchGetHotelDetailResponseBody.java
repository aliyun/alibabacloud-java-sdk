// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BatchGetHotelDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public BatchGetHotelDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>城市编码不能为空</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static BatchGetHotelDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetHotelDetailResponseBody self = new BatchGetHotelDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetHotelDetailResponseBody setData(BatchGetHotelDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchGetHotelDetailResponseBodyData getData() {
        return this.data;
    }

    public BatchGetHotelDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchGetHotelDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BatchGetHotelDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetHotelDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetHotelDetailResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsFacilities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>室外恒温泳池</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>F001</p>
         */
        @NameInMap("FacilityId")
        public String facilityId;

        /**
         * <strong>example:</strong>
         * <p>游泳池</p>
         */
        @NameInMap("Name")
        public String name;

        public static BatchGetHotelDetailResponseBodyDataHotelsFacilities build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsFacilities self = new BatchGetHotelDetailResponseBodyDataHotelsFacilities();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsFacilities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsFacilities setFacilityId(String facilityId) {
            this.facilityId = facilityId;
            return this;
        }
        public String getFacilityId() {
            return this.facilityId;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsFacilities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsPictures extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>酒店大堂</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>HOTEL</p>
         */
        @NameInMap("FirstCategoryCode")
        public String firstCategoryCode;

        /**
         * <strong>example:</strong>
         * <p>酒店</p>
         */
        @NameInMap("FirstCategoryName")
        public String firstCategoryName;

        @NameInMap("IsHeadPic")
        public Boolean isHeadPic;

        /**
         * <strong>example:</strong>
         * <p>PIC001</p>
         */
        @NameInMap("PictureId")
        public String pictureId;

        /**
         * <strong>example:</strong>
         * <p>LOBBY</p>
         */
        @NameInMap("SecondCategoryCode")
        public String secondCategoryCode;

        /**
         * <strong>example:</strong>
         * <p>大堂</p>
         */
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.example.com/1.jpg">https://img.example.com/1.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static BatchGetHotelDetailResponseBodyDataHotelsPictures build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsPictures self = new BatchGetHotelDetailResponseBodyDataHotelsPictures();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setFirstCategoryCode(String firstCategoryCode) {
            this.firstCategoryCode = firstCategoryCode;
            return this;
        }
        public String getFirstCategoryCode() {
            return this.firstCategoryCode;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setFirstCategoryName(String firstCategoryName) {
            this.firstCategoryName = firstCategoryName;
            return this;
        }
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setIsHeadPic(Boolean isHeadPic) {
            this.isHeadPic = isHeadPic;
            return this;
        }
        public Boolean getIsHeadPic() {
            return this.isHeadPic;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setPictureId(String pictureId) {
            this.pictureId = pictureId;
            return this;
        }
        public String getPictureId() {
            return this.pictureId;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setSecondCategoryCode(String secondCategoryCode) {
            this.secondCategoryCode = secondCategoryCode;
            return this;
        }
        public String getSecondCategoryCode() {
            return this.secondCategoryCode;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPictures setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems extends TeaModel {
        @NameInMap("Children")
        public java.util.List<?> children;

        /**
         * <strong>example:</strong>
         * <p>入住时间</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p>CHECK_IN_TIME</p>
         */
        @NameInMap("ItemTypeId")
        public String itemTypeId;

        /**
         * <strong>example:</strong>
         * <p>14:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems self = new BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setItemTypeId(String itemTypeId) {
            this.itemTypeId = itemTypeId;
            return this;
        }
        public String getItemTypeId() {
            return this.itemTypeId;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>入住政策</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>CHECK_IN</p>
         */
        @NameInMap("GroupTypeId")
        public String groupTypeId;

        @NameInMap("Items")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems> items;

        public static BatchGetHotelDetailResponseBodyDataHotelsPolicies build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsPolicies self = new BatchGetHotelDetailResponseBodyDataHotelsPolicies();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPolicies setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPolicies setGroupTypeId(String groupTypeId) {
            this.groupTypeId = groupTypeId;
            return this;
        }
        public String getGroupTypeId() {
            return this.groupTypeId;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsPolicies setItems(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPoliciesItems> getItems() {
            return this.items;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BedCount")
        public Integer bedCount;

        /**
         * <strong>example:</strong>
         * <p>1.9</p>
         */
        @NameInMap("BedSize")
        public String bedSize;

        /**
         * <strong>example:</strong>
         * <p>大床</p>
         */
        @NameInMap("BedType")
        public String bedType;

        public static BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType self = new BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType setBedCount(Integer bedCount) {
            this.bedCount = bedCount;
            return this;
        }
        public Integer getBedCount() {
            return this.bedCount;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType setBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }
        public String getBedSize() {
            return this.bedSize;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>酒店大堂</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>HOTEL</p>
         */
        @NameInMap("FirstCategoryCode")
        public String firstCategoryCode;

        /**
         * <strong>example:</strong>
         * <p>酒店</p>
         */
        @NameInMap("FirstCategoryName")
        public String firstCategoryName;

        @NameInMap("IsHeadPic")
        public Boolean isHeadPic;

        /**
         * <strong>example:</strong>
         * <p>PIC001</p>
         */
        @NameInMap("PictureId")
        public String pictureId;

        /**
         * <strong>example:</strong>
         * <p>LOBBY</p>
         */
        @NameInMap("SecondCategoryCode")
        public String secondCategoryCode;

        /**
         * <strong>example:</strong>
         * <p>大堂</p>
         */
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.example.com/1.jpg">https://img.example.com/1.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures self = new BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setFirstCategoryCode(String firstCategoryCode) {
            this.firstCategoryCode = firstCategoryCode;
            return this;
        }
        public String getFirstCategoryCode() {
            return this.firstCategoryCode;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setFirstCategoryName(String firstCategoryName) {
            this.firstCategoryName = firstCategoryName;
            return this;
        }
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setIsHeadPic(Boolean isHeadPic) {
            this.isHeadPic = isHeadPic;
            return this;
        }
        public Boolean getIsHeadPic() {
            return this.isHeadPic;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setPictureId(String pictureId) {
            this.pictureId = pictureId;
            return this;
        }
        public String getPictureId() {
            return this.pictureId;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setSecondCategoryCode(String secondCategoryCode) {
            this.secondCategoryCode = secondCategoryCode;
            return this;
        }
        public String getSecondCategoryCode() {
            return this.secondCategoryCode;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotelsRoomTypes extends TeaModel {
        @NameInMap("BedType")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType> bedType;

        @NameInMap("Pictures")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures> pictures;

        /**
         * <strong>example:</strong>
         * <p>Deluxe King Room</p>
         */
        @NameInMap("RoomName")
        public String roomName;

        /**
         * <strong>example:</strong>
         * <p>豪华大床房</p>
         */
        @NameInMap("RoomNameCn")
        public String roomNameCn;

        /**
         * <strong>example:</strong>
         * <p>35.0</p>
         */
        @NameInMap("RoomSize")
        public Double roomSize;

        /**
         * <strong>example:</strong>
         * <p>SQM</p>
         */
        @NameInMap("RoomSizeUnit")
        public String roomSizeUnit;

        /**
         * <strong>example:</strong>
         * <p>standardRoomId</p>
         */
        @NameInMap("StandardRoomId")
        public String standardRoomId;

        /**
         * <strong>example:</strong>
         * <p>WINDOW</p>
         */
        @NameInMap("WindowType")
        public String windowType;

        /**
         * <strong>example:</strong>
         * <p>SMALL_WINDOW</p>
         */
        @NameInMap("WindowTypeDefect")
        public String windowTypeDefect;

        public static BatchGetHotelDetailResponseBodyDataHotelsRoomTypes build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotelsRoomTypes self = new BatchGetHotelDetailResponseBodyDataHotelsRoomTypes();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setBedType(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType> bedType) {
            this.bedType = bedType;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType> getBedType() {
            return this.bedType;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setPictures(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures> pictures) {
            this.pictures = pictures;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures> getPictures() {
            return this.pictures;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomNameCn(String roomNameCn) {
            this.roomNameCn = roomNameCn;
            return this;
        }
        public String getRoomNameCn() {
            return this.roomNameCn;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomSize(Double roomSize) {
            this.roomSize = roomSize;
            return this;
        }
        public Double getRoomSize() {
            return this.roomSize;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomSizeUnit(String roomSizeUnit) {
            this.roomSizeUnit = roomSizeUnit;
            return this;
        }
        public String getRoomSizeUnit() {
            return this.roomSizeUnit;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setStandardRoomId(String standardRoomId) {
            this.standardRoomId = standardRoomId;
            return this;
        }
        public String getStandardRoomId() {
            return this.standardRoomId;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setWindowType(String windowType) {
            this.windowType = windowType;
            return this;
        }
        public String getWindowType() {
            return this.windowType;
        }

        public BatchGetHotelDetailResponseBodyDataHotelsRoomTypes setWindowTypeDefect(String windowTypeDefect) {
            this.windowTypeDefect = windowTypeDefect;
            return this;
        }
        public String getWindowTypeDefect() {
            return this.windowTypeDefect;
        }

    }

    public static class BatchGetHotelDetailResponseBodyDataHotels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>No.33 East Chang An Avenue</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>14:00</p>
         */
        @NameInMap("CheckInTime")
        public String checkInTime;

        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("CheckOutTime")
        public String checkOutTime;

        /**
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <strong>example:</strong>
         * <p>五星级豪华酒店</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>HOTEL_NOT_FOUND</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>酒店不存在</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Facilities")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsFacilities> facilities;

        /**
         * <strong>example:</strong>
         * <p>Beijing Hotel</p>
         */
        @NameInMap("HotelName")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>北京饭店</p>
         */
        @NameInMap("HotelNameCn")
        public String hotelNameCn;

        /**
         * <strong>example:</strong>
         * <p>LUXURY</p>
         */
        @NameInMap("HotelType")
        public String hotelType;

        /**
         * <strong>example:</strong>
         * <p>39.9042</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>116.4074</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        /**
         * <strong>example:</strong>
         * <p>2018</p>
         */
        @NameInMap("OpeningTime")
        public Integer openingTime;

        @NameInMap("Pictures")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPictures> pictures;

        @NameInMap("Policies")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPolicies> policies;

        /**
         * <strong>example:</strong>
         * <p>GOOGLE</p>
         */
        @NameInMap("PositionType")
        public String positionType;

        /**
         * <strong>example:</strong>
         * <p>2021</p>
         */
        @NameInMap("RenovationTime")
        public Integer renovationTime;

        @NameInMap("RoomTypes")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypes> roomTypes;

        /**
         * <strong>example:</strong>
         * <p>H001</p>
         */
        @NameInMap("StandardHotelId")
        public String standardHotelId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Star")
        public String star;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>+86-10-65137766</p>
         */
        @NameInMap("Tel")
        public String tel;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static BatchGetHotelDetailResponseBodyDataHotels build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyDataHotels self = new BatchGetHotelDetailResponseBodyDataHotels();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyDataHotels setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setFacilities(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsFacilities> facilities) {
            this.facilities = facilities;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsFacilities> getFacilities() {
            return this.facilities;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setHotelNameCn(String hotelNameCn) {
            this.hotelNameCn = hotelNameCn;
            return this;
        }
        public String getHotelNameCn() {
            return this.hotelNameCn;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setHotelType(String hotelType) {
            this.hotelType = hotelType;
            return this;
        }
        public String getHotelType() {
            return this.hotelType;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setOpeningTime(Integer openingTime) {
            this.openingTime = openingTime;
            return this;
        }
        public Integer getOpeningTime() {
            return this.openingTime;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setPictures(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPictures> pictures) {
            this.pictures = pictures;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPictures> getPictures() {
            return this.pictures;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setPolicies(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsPolicies> getPolicies() {
            return this.policies;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setPositionType(String positionType) {
            this.positionType = positionType;
            return this;
        }
        public String getPositionType() {
            return this.positionType;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setRenovationTime(Integer renovationTime) {
            this.renovationTime = renovationTime;
            return this;
        }
        public Integer getRenovationTime() {
            return this.renovationTime;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setRoomTypes(java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypes> roomTypes) {
            this.roomTypes = roomTypes;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotelsRoomTypes> getRoomTypes() {
            return this.roomTypes;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setStandardHotelId(String standardHotelId) {
            this.standardHotelId = standardHotelId;
            return this;
        }
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setStar(String star) {
            this.star = star;
            return this;
        }
        public String getStar() {
            return this.star;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

        public BatchGetHotelDetailResponseBodyDataHotels setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class BatchGetHotelDetailResponseBodyData extends TeaModel {
        @NameInMap("Hotels")
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotels> hotels;

        public static BatchGetHotelDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetHotelDetailResponseBodyData self = new BatchGetHotelDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchGetHotelDetailResponseBodyData setHotels(java.util.List<BatchGetHotelDetailResponseBodyDataHotels> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.List<BatchGetHotelDetailResponseBodyDataHotels> getHotels() {
            return this.hotels;
        }

    }

}
