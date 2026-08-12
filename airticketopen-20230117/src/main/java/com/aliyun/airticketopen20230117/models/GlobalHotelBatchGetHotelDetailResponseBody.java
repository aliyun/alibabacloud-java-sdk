// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelBatchGetHotelDetailResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelBatchGetHotelDetailResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>City code cannot be empty</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelBatchGetHotelDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelBatchGetHotelDetailResponseBody self = new GlobalHotelBatchGetHotelDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelBatchGetHotelDetailResponseBody setData(GlobalHotelBatchGetHotelDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelBatchGetHotelDetailResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelBatchGetHotelDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelBatchGetHotelDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelBatchGetHotelDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelBatchGetHotelDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelBatchGetHotelDetailResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities extends TeaModel {
        /**
         * <p>The facility description.</p>
         * 
         * <strong>example:</strong>
         * <p>Outdoor heated swimming pool</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The facility name.</p>
         * 
         * <strong>example:</strong>
         * <p>Swimming Pool</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The facility type.</p>
         * 
         * <strong>example:</strong>
         * <p>parkade</p>
         */
        @NameInMap("Type")
        public String type;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures extends TeaModel {
        /**
         * <p>The picture description.</p>
         * 
         * <strong>example:</strong>
         * <p>Hotel lobby</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The first-level category code.</p>
         * 
         * <strong>example:</strong>
         * <p>HOTEL</p>
         */
        @NameInMap("FirstCategoryCode")
        public String firstCategoryCode;

        /**
         * <p>The first-level category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Hotel</p>
         */
        @NameInMap("FirstCategoryName")
        public String firstCategoryName;

        /**
         * <p>Indicates whether the picture is the cover image.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsHeadPic")
        public Boolean isHeadPic;

        /**
         * <p>The picture ID (subject to the URL).</p>
         * 
         * <strong>example:</strong>
         * <p>PIC001</p>
         */
        @NameInMap("PictureId")
        public String pictureId;

        /**
         * <p>The second-level category code.</p>
         * 
         * <strong>example:</strong>
         * <p>LOBBY</p>
         */
        @NameInMap("SecondCategoryCode")
        public String secondCategoryCode;

        /**
         * <p>The second-level category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Lobby</p>
         */
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        /**
         * <p>The picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.example.com/1.jpg">https://img.example.com/1.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setFirstCategoryCode(String firstCategoryCode) {
            this.firstCategoryCode = firstCategoryCode;
            return this;
        }
        public String getFirstCategoryCode() {
            return this.firstCategoryCode;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setFirstCategoryName(String firstCategoryName) {
            this.firstCategoryName = firstCategoryName;
            return this;
        }
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setIsHeadPic(Boolean isHeadPic) {
            this.isHeadPic = isHeadPic;
            return this;
        }
        public Boolean getIsHeadPic() {
            return this.isHeadPic;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setPictureId(String pictureId) {
            this.pictureId = pictureId;
            return this;
        }
        public String getPictureId() {
            return this.pictureId;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setSecondCategoryCode(String secondCategoryCode) {
            this.secondCategoryCode = secondCategoryCode;
            return this;
        }
        public String getSecondCategoryCode() {
            return this.secondCategoryCode;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems extends TeaModel {
        /**
         * <p>The list of sub-items.</p>
         */
        @NameInMap("Children")
        public java.util.List<?> children;

        /**
         * <p>The item name.</p>
         * 
         * <strong>example:</strong>
         * <p>Check-in Time</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The item type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_IN_TIME</p>
         */
        @NameInMap("ItemTypeId")
        public String itemTypeId;

        /**
         * <p>The text value.</p>
         * 
         * <strong>example:</strong>
         * <p>14:00</p>
         */
        @NameInMap("Value")
        public String value;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setItemTypeId(String itemTypeId) {
            this.itemTypeId = itemTypeId;
            return this;
        }
        public String getItemTypeId() {
            return this.itemTypeId;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies extends TeaModel {
        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Check-in Policy</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The group type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_IN</p>
         */
        @NameInMap("GroupTypeId")
        public String groupTypeId;

        /**
         * <p>The list of policy items.</p>
         */
        @NameInMap("Items")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems> items;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies setGroupTypeId(String groupTypeId) {
            this.groupTypeId = groupTypeId;
            return this;
        }
        public String getGroupTypeId() {
            return this.groupTypeId;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies setItems(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPoliciesItems> getItems() {
            return this.items;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType extends TeaModel {
        /**
         * <p>The number of beds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BedCount")
        public Integer bedCount;

        /**
         * <p>The bed width in meters.</p>
         * 
         * <strong>example:</strong>
         * <p>1.8</p>
         */
        @NameInMap("BedSize")
        public String bedSize;

        /**
         * <p>The bed type name.</p>
         * 
         * <strong>example:</strong>
         * <p>King Bed</p>
         */
        @NameInMap("BedType")
        public String bedType;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType setBedCount(Integer bedCount) {
            this.bedCount = bedCount;
            return this;
        }
        public Integer getBedCount() {
            return this.bedCount;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType setBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }
        public String getBedSize() {
            return this.bedSize;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures extends TeaModel {
        /**
         * <p>The picture description.</p>
         * 
         * <strong>example:</strong>
         * <p>Hotel lobby</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The first-level category code.</p>
         * 
         * <strong>example:</strong>
         * <p>HOTEL</p>
         */
        @NameInMap("FirstCategoryCode")
        public String firstCategoryCode;

        /**
         * <p>The first-level category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Hotel</p>
         */
        @NameInMap("FirstCategoryName")
        public String firstCategoryName;

        /**
         * <p>Indicates whether the picture is the cover image.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsHeadPic")
        public Boolean isHeadPic;

        /**
         * <p>The picture ID (subject to the URL).</p>
         * 
         * <strong>example:</strong>
         * <p>PIC001</p>
         */
        @NameInMap("PictureId")
        public String pictureId;

        /**
         * <p>The second-level category code.</p>
         * 
         * <strong>example:</strong>
         * <p>LOBBY</p>
         */
        @NameInMap("SecondCategoryCode")
        public String secondCategoryCode;

        /**
         * <p>The second-level category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Lobby</p>
         */
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        /**
         * <p>The picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.example.com/1.jpg">https://img.example.com/1.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setFirstCategoryCode(String firstCategoryCode) {
            this.firstCategoryCode = firstCategoryCode;
            return this;
        }
        public String getFirstCategoryCode() {
            return this.firstCategoryCode;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setFirstCategoryName(String firstCategoryName) {
            this.firstCategoryName = firstCategoryName;
            return this;
        }
        public String getFirstCategoryName() {
            return this.firstCategoryName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setIsHeadPic(Boolean isHeadPic) {
            this.isHeadPic = isHeadPic;
            return this;
        }
        public Boolean getIsHeadPic() {
            return this.isHeadPic;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setPictureId(String pictureId) {
            this.pictureId = pictureId;
            return this;
        }
        public String getPictureId() {
            return this.pictureId;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setSecondCategoryCode(String secondCategoryCode) {
            this.secondCategoryCode = secondCategoryCode;
            return this;
        }
        public String getSecondCategoryCode() {
            return this.secondCategoryCode;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes extends TeaModel {
        /**
         * <p>The list of bed types.</p>
         */
        @NameInMap("BedType")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType> bedType;

        /**
         * <p>The list of room type pictures.</p>
         */
        @NameInMap("Pictures")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures> pictures;

        /**
         * <p>The room type name.</p>
         * 
         * <strong>example:</strong>
         * <p>Deluxe King Room</p>
         */
        @NameInMap("RoomName")
        public String roomName;

        /**
         * <p>The Chinese room type name (always in Chinese, regardless of the language parameter).</p>
         * 
         * <strong>example:</strong>
         * <p>豪华大床房</p>
         */
        @NameInMap("RoomNameCn")
        public String roomNameCn;

        /**
         * <p>The room area (passed through as-is, may be a range value).</p>
         * 
         * <strong>example:</strong>
         * <p>35.0</p>
         */
        @NameInMap("RoomSize")
        public String roomSize;

        /**
         * <p>The area unit. Valid values: SQM (square meters) and SQFT (square feet). Default value: SQM.</p>
         * 
         * <strong>example:</strong>
         * <p>SQM</p>
         */
        @NameInMap("RoomSizeUnit")
        public String roomSizeUnit;

        /**
         * <p>The platform standard room type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>R001</p>
         */
        @NameInMap("StandardRoomId")
        public String standardRoomId;

        /**
         * <p>The window type. Valid values:</p>
         * <ul>
         * <li>0: no window</li>
         * <li>1: with window</li>
         * <li>2: partially with window</li>
         * <li>3: opaque window</li>
         * <li>4: partially opaque window</li>
         * <li>5: floor-to-ceiling window</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WINDOW</p>
         */
        @NameInMap("WindowType")
        public String windowType;

        /**
         * <p>The window defect code. Valid values:</p>
         * <ul>
         * <li>0: window cannot be opened for ventilation</li>
         * <li>1: view is obstructed outside the window</li>
         * <li>2: window faces the interior of the hotel</li>
         * <li>3: window is located in a corridor or hallway</li>
         * <li>4: window can be opened for ventilation and faces an outdoor open environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMALL_WINDOW</p>
         */
        @NameInMap("WindowTypeDefect")
        public String windowTypeDefect;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setBedType(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType> bedType) {
            this.bedType = bedType;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesBedType> getBedType() {
            return this.bedType;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setPictures(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures> pictures) {
            this.pictures = pictures;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypesPictures> getPictures() {
            return this.pictures;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomNameCn(String roomNameCn) {
            this.roomNameCn = roomNameCn;
            return this;
        }
        public String getRoomNameCn() {
            return this.roomNameCn;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomSize(String roomSize) {
            this.roomSize = roomSize;
            return this;
        }
        public String getRoomSize() {
            return this.roomSize;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setRoomSizeUnit(String roomSizeUnit) {
            this.roomSizeUnit = roomSizeUnit;
            return this;
        }
        public String getRoomSizeUnit() {
            return this.roomSizeUnit;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setStandardRoomId(String standardRoomId) {
            this.standardRoomId = standardRoomId;
            return this;
        }
        public String getStandardRoomId() {
            return this.standardRoomId;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setWindowType(String windowType) {
            this.windowType = windowType;
            return this;
        }
        public String getWindowType() {
            return this.windowType;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes setWindowTypeDefect(String windowTypeDefect) {
            this.windowTypeDefect = windowTypeDefect;
            return this;
        }
        public String getWindowTypeDefect() {
            return this.windowTypeDefect;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyDataHotels extends TeaModel {
        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>No.33 East Chang An Avenue</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The default check-in time.</p>
         * 
         * <strong>example:</strong>
         * <p>14:00</p>
         */
        @NameInMap("CheckInTime")
        public String checkInTime;

        /**
         * <p>The default check-out time.</p>
         * 
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("CheckOutTime")
        public String checkOutTime;

        /**
         * <p>The city name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The country name.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <p>The hotel description.</p>
         * 
         * <strong>example:</strong>
         * <p>Five-star luxury hotel</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error code for the individual hotel.</p>
         * 
         * <strong>example:</strong>
         * <p>HOTEL_NOT_FOUND</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message for the individual hotel.</p>
         * 
         * <strong>example:</strong>
         * <p>Hotel does not exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The list of facilities.</p>
         */
        @NameInMap("Facilities")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities> facilities;

        /**
         * <p>The hotel name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing Hotel</p>
         */
        @NameInMap("HotelName")
        public String hotelName;

        /**
         * <p>The Chinese hotel name.</p>
         * 
         * <strong>example:</strong>
         * <p>北京饭店</p>
         */
        @NameInMap("HotelNameCn")
        public String hotelNameCn;

        /**
         * <p>The hotel type (LUXURY/DELUXE/COMFORT).</p>
         * 
         * <strong>example:</strong>
         * <p>LUXURY</p>
         */
        @NameInMap("HotelType")
        public String hotelType;

        /**
         * <p>The latitude.</p>
         * 
         * <strong>example:</strong>
         * <p>39.9042</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <p>The longitude.</p>
         * 
         * <strong>example:</strong>
         * <p>116.4074</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        /**
         * <p>The opening year.</p>
         * 
         * <strong>example:</strong>
         * <p>2018</p>
         */
        @NameInMap("OpeningTime")
        public Integer openingTime;

        /**
         * <p>The list of pictures.</p>
         */
        @NameInMap("Pictures")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures> pictures;

        /**
         * <p>The hotel policy information.</p>
         */
        @NameInMap("Policies")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies> policies;

        /**
         * <p>The source of the coordinates.</p>
         * 
         * <strong>example:</strong>
         * <p>GOOGLE</p>
         */
        @NameInMap("PositionType")
        public String positionType;

        /**
         * <p>The renovation year.</p>
         * 
         * <strong>example:</strong>
         * <p>2021</p>
         */
        @NameInMap("RenovationTime")
        public Integer renovationTime;

        /**
         * <p>The list of room types.</p>
         */
        @NameInMap("RoomTypes")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes> roomTypes;

        /**
         * <p>The platform standard hotel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>H001</p>
         */
        @NameInMap("StandardHotelId")
        public String standardHotelId;

        /**
         * <p>The star rating.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Star")
        public String star;

        /**
         * <p>The hotel status (ONLINE/OFFLINE).</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>+86-10-65137766</p>
         */
        @NameInMap("Tel")
        public String tel;

        /**
         * <p>The hotel time zone (IANA ID).</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static GlobalHotelBatchGetHotelDetailResponseBodyDataHotels build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyDataHotels self = new GlobalHotelBatchGetHotelDetailResponseBodyDataHotels();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setFacilities(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities> facilities) {
            this.facilities = facilities;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsFacilities> getFacilities() {
            return this.facilities;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setHotelNameCn(String hotelNameCn) {
            this.hotelNameCn = hotelNameCn;
            return this;
        }
        public String getHotelNameCn() {
            return this.hotelNameCn;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setHotelType(String hotelType) {
            this.hotelType = hotelType;
            return this;
        }
        public String getHotelType() {
            return this.hotelType;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setOpeningTime(Integer openingTime) {
            this.openingTime = openingTime;
            return this;
        }
        public Integer getOpeningTime() {
            return this.openingTime;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setPictures(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures> pictures) {
            this.pictures = pictures;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPictures> getPictures() {
            return this.pictures;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setPolicies(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsPolicies> getPolicies() {
            return this.policies;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setPositionType(String positionType) {
            this.positionType = positionType;
            return this;
        }
        public String getPositionType() {
            return this.positionType;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setRenovationTime(Integer renovationTime) {
            this.renovationTime = renovationTime;
            return this;
        }
        public Integer getRenovationTime() {
            return this.renovationTime;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setRoomTypes(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes> roomTypes) {
            this.roomTypes = roomTypes;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotelsRoomTypes> getRoomTypes() {
            return this.roomTypes;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setStandardHotelId(String standardHotelId) {
            this.standardHotelId = standardHotelId;
            return this;
        }
        public String getStandardHotelId() {
            return this.standardHotelId;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setStar(String star) {
            this.star = star;
            return this;
        }
        public String getStar() {
            return this.star;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyDataHotels setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GlobalHotelBatchGetHotelDetailResponseBodyData extends TeaModel {
        /**
         * <p>The list of hotel details.</p>
         */
        @NameInMap("Hotels")
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotels> hotels;

        public static GlobalHotelBatchGetHotelDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelBatchGetHotelDetailResponseBodyData self = new GlobalHotelBatchGetHotelDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelBatchGetHotelDetailResponseBodyData setHotels(java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotels> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.List<GlobalHotelBatchGetHotelDetailResponseBodyDataHotels> getHotels() {
            return this.hotels;
        }

    }

}
