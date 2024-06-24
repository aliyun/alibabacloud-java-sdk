// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelStaticInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public HotelStaticInfoResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelStaticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelStaticInfoResponseBody self = new HotelStaticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelStaticInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelStaticInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelStaticInfoResponseBody setModule(HotelStaticInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelStaticInfoResponseBodyModule getModule() {
        return this.module;
    }

    public HotelStaticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelStaticInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelStaticInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17:00</p>
         */
        @NameInMap("check_in")
        public String checkIn;

        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("check_out")
        public String checkOut;

        /**
         * <strong>example:</strong>
         * <p>2020</p>
         */
        @NameInMap("decorate_time")
        public String decorateTime;

        @NameInMap("floors")
        public String floors;

        @NameInMap("hotel_facilities")
        public java.util.List<String> hotelFacilities;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("hotel_type")
        public Integer hotelType;

        /**
         * <strong>example:</strong>
         * <p>2020</p>
         */
        @NameInMap("opening_time")
        public String openingTime;

        @NameInMap("room_facilities")
        public java.util.List<String> roomFacilities;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("rooms")
        public Integer rooms;

        @NameInMap("service")
        public java.util.List<String> service;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("theme_tag")
        public String themeTag;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo self = new HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setDecorateTime(String decorateTime) {
            this.decorateTime = decorateTime;
            return this;
        }
        public String getDecorateTime() {
            return this.decorateTime;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setFloors(String floors) {
            this.floors = floors;
            return this;
        }
        public String getFloors() {
            return this.floors;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setHotelFacilities(java.util.List<String> hotelFacilities) {
            this.hotelFacilities = hotelFacilities;
            return this;
        }
        public java.util.List<String> getHotelFacilities() {
            return this.hotelFacilities;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setHotelType(Integer hotelType) {
            this.hotelType = hotelType;
            return this;
        }
        public Integer getHotelType() {
            return this.hotelType;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }
        public String getOpeningTime() {
            return this.openingTime;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setRoomFacilities(java.util.List<String> roomFacilities) {
            this.roomFacilities = roomFacilities;
            return this;
        }
        public java.util.List<String> getRoomFacilities() {
            return this.roomFacilities;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setRooms(Integer rooms) {
            this.rooms = rooms;
            return this;
        }
        public Integer getRooms() {
            return this.rooms;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setService(java.util.List<String> service) {
            this.service = service;
            return this;
        }
        public java.util.List<String> getService() {
            return this.service;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo setThemeTag(String themeTag) {
            this.themeTag = themeTag;
            return this;
        }
        public String getThemeTag() {
            return this.themeTag;
        }

    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("tag")
        public Integer tag;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg">https://img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos self = new HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos setTag(Integer tag) {
            this.tag = tag;
            return this;
        }
        public Integer getTag() {
            return this.tag;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos extends TeaModel {
        @NameInMap("bed_desc")
        public String bedDesc;

        @NameInMap("bed_num")
        public Integer bedNum;

        @NameInMap("bed_size")
        public String bedSize;

        @NameInMap("bed_type")
        public String bedType;

        @NameInMap("length")
        public String length;

        @NameInMap("width")
        public String width;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos self = new HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos setBedDesc(String bedDesc) {
            this.bedDesc = bedDesc;
            return this;
        }
        public String getBedDesc() {
            return this.bedDesc;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos setBedNum(Integer bedNum) {
            this.bedNum = bedNum;
            return this;
        }
        public Integer getBedNum() {
            return this.bedNum;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos setBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }
        public String getBedSize() {
            return this.bedSize;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos setLength(String length) {
            this.length = length;
            return this;
        }
        public String getLength() {
            return this.length;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList extends TeaModel {
        @NameInMap("bed_Infos")
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos> bedInfos;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList self = new HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList setBedInfos(java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos> bedInfos) {
            this.bedInfos = bedInfos;
            return this;
        }
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupListBedInfos> getBedInfos() {
            return this.bedInfos;
        }

    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos extends TeaModel {
        @NameInMap("bed_desc")
        public String bedDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("bed_num")
        public Integer bedNum;

        /**
         * <strong>example:</strong>
         * <p>1.8m</p>
         */
        @NameInMap("bed_size")
        public String bedSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("bed_type")
        public String bedType;

        @NameInMap("length")
        public String length;

        @NameInMap("width")
        public String width;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos self = new HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos setBedDesc(String bedDesc) {
            this.bedDesc = bedDesc;
            return this;
        }
        public String getBedDesc() {
            return this.bedDesc;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos setBedNum(Integer bedNum) {
            this.bedNum = bedNum;
            return this;
        }
        public Integer getBedNum() {
            return this.bedNum;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos setBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }
        public String getBedSize() {
            return this.bedSize;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos setLength(String length) {
            this.length = length;
            return this;
        }
        public String getLength() {
            return this.length;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos extends TeaModel {
        @NameInMap("bed_info_group_list")
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList> bedInfoGroupList;

        @NameInMap("bed_infos")
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos> bedInfos;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("extra_bed")
        public Integer extraBed;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("extra_bed_desc")
        public String extraBedDesc;

        /**
         * <strong>example:</strong>
         * <p>1,2,3,4,5,6</p>
         */
        @NameInMap("floor")
        public String floor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("internet_way")
        public String internetWay;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_occupancy")
        public Integer maxOccupancy;

        @NameInMap("room_facilities")
        public String roomFacilities;

        @NameInMap("room_facility_list")
        public java.util.List<String> roomFacilityList;

        /**
         * <strong>example:</strong>
         * <p>71652158</p>
         */
        @NameInMap("room_id")
        public String roomId;

        /**
         * <strong>example:</strong>
         * <p>//img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg</p>
         */
        @NameInMap("room_image")
        public String roomImage;

        @NameInMap("room_images")
        public java.util.List<String> roomImages;

        @NameInMap("room_name")
        public String roomName;

        @NameInMap("room_type")
        public Integer roomType;

        @NameInMap("roomarea")
        public String roomarea;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("rooms")
        public Integer rooms;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("window")
        public String window;

        @NameInMap("window_bad")
        public String windowBad;

        @NameInMap("window_view")
        public String windowView;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos self = new HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setBedInfoGroupList(java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList> bedInfoGroupList) {
            this.bedInfoGroupList = bedInfoGroupList;
            return this;
        }
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfoGroupList> getBedInfoGroupList() {
            return this.bedInfoGroupList;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setBedInfos(java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos> bedInfos) {
            this.bedInfos = bedInfos;
            return this;
        }
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfosBedInfos> getBedInfos() {
            return this.bedInfos;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setExtraBed(Integer extraBed) {
            this.extraBed = extraBed;
            return this;
        }
        public Integer getExtraBed() {
            return this.extraBed;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setExtraBedDesc(String extraBedDesc) {
            this.extraBedDesc = extraBedDesc;
            return this;
        }
        public String getExtraBedDesc() {
            return this.extraBedDesc;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setFloor(String floor) {
            this.floor = floor;
            return this;
        }
        public String getFloor() {
            return this.floor;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setInternetWay(String internetWay) {
            this.internetWay = internetWay;
            return this;
        }
        public String getInternetWay() {
            return this.internetWay;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomFacilities(String roomFacilities) {
            this.roomFacilities = roomFacilities;
            return this;
        }
        public String getRoomFacilities() {
            return this.roomFacilities;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomFacilityList(java.util.List<String> roomFacilityList) {
            this.roomFacilityList = roomFacilityList;
            return this;
        }
        public java.util.List<String> getRoomFacilityList() {
            return this.roomFacilityList;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomImage(String roomImage) {
            this.roomImage = roomImage;
            return this;
        }
        public String getRoomImage() {
            return this.roomImage;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomImages(java.util.List<String> roomImages) {
            this.roomImages = roomImages;
            return this;
        }
        public java.util.List<String> getRoomImages() {
            return this.roomImages;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomType(Integer roomType) {
            this.roomType = roomType;
            return this;
        }
        public Integer getRoomType() {
            return this.roomType;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRoomarea(String roomarea) {
            this.roomarea = roomarea;
            return this;
        }
        public String getRoomarea() {
            return this.roomarea;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setRooms(Integer rooms) {
            this.rooms = rooms;
            return this;
        }
        public Integer getRooms() {
            return this.rooms;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setWindow(String window) {
            this.window = window;
            return this;
        }
        public String getWindow() {
            return this.window;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setWindowBad(String windowBad) {
            this.windowBad = windowBad;
            return this;
        }
        public String getWindowBad() {
            return this.windowBad;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos setWindowView(String windowView) {
            this.windowView = windowView;
            return this;
        }
        public String getWindowView() {
            return this.windowView;
        }

    }

    public static class HotelStaticInfoResponseBodyModuleHotelStaticInfos extends TeaModel {
        @NameInMap("block_room_type_information")
        public java.util.Map<String, String> blockRoomTypeInformation;

        /**
         * <strong>example:</strong>
         * <p>19039</p>
         */
        @NameInMap("brand")
        public String brand;

        @NameInMap("brand_name")
        public String brandName;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("country_code")
        public String countryCode;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>330183</p>
         */
        @NameInMap("district")
        public String district;

        @NameInMap("district_name")
        public String districtName;

        @NameInMap("expand_info")
        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo expandInfo;

        @NameInMap("hotel_address")
        public String hotelAddress;

        /**
         * <strong>example:</strong>
         * <p>Building 5, Haichuang Building, 998 Wenyi West Road</p>
         */
        @NameInMap("hotel_en_address")
        public String hotelEnAddress;

        /**
         * <strong>example:</strong>
         * <p>Business travel hotel</p>
         */
        @NameInMap("hotel_en_name")
        public String hotelEnName;

        /**
         * <strong>example:</strong>
         * <p>55335212</p>
         */
        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("hotel_name")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>2020</p>
         */
        @NameInMap("hotel_open_time")
        public String hotelOpenTime;

        /**
         * <strong>example:</strong>
         * <p>0086#0571#28350117</p>
         */
        @NameInMap("hotel_phones")
        public String hotelPhones;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("hotel_policies")
        public String hotelPolicies;

        /**
         * <strong>example:</strong>
         * <p>0086#0571#28350117</p>
         */
        @NameInMap("hotelfax")
        public String hotelfax;

        @NameInMap("hotelpics")
        public String hotelpics;

        @NameInMap("imageinfos")
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos> imageinfos;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("invoice_provider_method")
        public String invoiceProviderMethod;

        @NameInMap("invoice_types")
        public java.util.List<Integer> invoiceTypes;

        /**
         * <strong>example:</strong>
         * <p>119.844005,30.054384</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>330000</p>
         */
        @NameInMap("province")
        public String province;

        @NameInMap("province_name")
        public String provinceName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("rating_average")
        public String ratingAverage;

        @NameInMap("room_infos")
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos> roomInfos;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("star")
        public String star;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("star_rate")
        public String starRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("themes")
        public String themes;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("visa_reminding")
        public Boolean visaReminding;

        public static HotelStaticInfoResponseBodyModuleHotelStaticInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModuleHotelStaticInfos self = new HotelStaticInfoResponseBodyModuleHotelStaticInfos();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setBlockRoomTypeInformation(java.util.Map<String, String> blockRoomTypeInformation) {
            this.blockRoomTypeInformation = blockRoomTypeInformation;
            return this;
        }
        public java.util.Map<String, String> getBlockRoomTypeInformation() {
            return this.blockRoomTypeInformation;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setExpandInfo(HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo expandInfo) {
            this.expandInfo = expandInfo;
            return this;
        }
        public HotelStaticInfoResponseBodyModuleHotelStaticInfosExpandInfo getExpandInfo() {
            return this.expandInfo;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelEnAddress(String hotelEnAddress) {
            this.hotelEnAddress = hotelEnAddress;
            return this;
        }
        public String getHotelEnAddress() {
            return this.hotelEnAddress;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelEnName(String hotelEnName) {
            this.hotelEnName = hotelEnName;
            return this;
        }
        public String getHotelEnName() {
            return this.hotelEnName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelOpenTime(String hotelOpenTime) {
            this.hotelOpenTime = hotelOpenTime;
            return this;
        }
        public String getHotelOpenTime() {
            return this.hotelOpenTime;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelPhones(String hotelPhones) {
            this.hotelPhones = hotelPhones;
            return this;
        }
        public String getHotelPhones() {
            return this.hotelPhones;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelPolicies(String hotelPolicies) {
            this.hotelPolicies = hotelPolicies;
            return this;
        }
        public String getHotelPolicies() {
            return this.hotelPolicies;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelfax(String hotelfax) {
            this.hotelfax = hotelfax;
            return this;
        }
        public String getHotelfax() {
            return this.hotelfax;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setHotelpics(String hotelpics) {
            this.hotelpics = hotelpics;
            return this;
        }
        public String getHotelpics() {
            return this.hotelpics;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setImageinfos(java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos> imageinfos) {
            this.imageinfos = imageinfos;
            return this;
        }
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosImageinfos> getImageinfos() {
            return this.imageinfos;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setInvoiceProviderMethod(String invoiceProviderMethod) {
            this.invoiceProviderMethod = invoiceProviderMethod;
            return this;
        }
        public String getInvoiceProviderMethod() {
            return this.invoiceProviderMethod;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setInvoiceTypes(java.util.List<Integer> invoiceTypes) {
            this.invoiceTypes = invoiceTypes;
            return this;
        }
        public java.util.List<Integer> getInvoiceTypes() {
            return this.invoiceTypes;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setRatingAverage(String ratingAverage) {
            this.ratingAverage = ratingAverage;
            return this;
        }
        public String getRatingAverage() {
            return this.ratingAverage;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setRoomInfos(java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos> roomInfos) {
            this.roomInfos = roomInfos;
            return this;
        }
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfosRoomInfos> getRoomInfos() {
            return this.roomInfos;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setStar(String star) {
            this.star = star;
            return this;
        }
        public String getStar() {
            return this.star;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setStarRate(String starRate) {
            this.starRate = starRate;
            return this;
        }
        public String getStarRate() {
            return this.starRate;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setThemes(String themes) {
            this.themes = themes;
            return this;
        }
        public String getThemes() {
            return this.themes;
        }

        public HotelStaticInfoResponseBodyModuleHotelStaticInfos setVisaReminding(Boolean visaReminding) {
            this.visaReminding = visaReminding;
            return this;
        }
        public Boolean getVisaReminding() {
            return this.visaReminding;
        }

    }

    public static class HotelStaticInfoResponseBodyModule extends TeaModel {
        @NameInMap("hotel_static_infos")
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfos> hotelStaticInfos;

        public static HotelStaticInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelStaticInfoResponseBodyModule self = new HotelStaticInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelStaticInfoResponseBodyModule setHotelStaticInfos(java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfos> hotelStaticInfos) {
            this.hotelStaticInfos = hotelStaticInfos;
            return this;
        }
        public java.util.List<HotelStaticInfoResponseBodyModuleHotelStaticInfos> getHotelStaticInfos() {
            return this.hotelStaticInfos;
        }

    }

}
