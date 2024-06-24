// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelRoomInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<HotelRoomInfoResponseBodyModule> module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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

    public static HotelRoomInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelRoomInfoResponseBody self = new HotelRoomInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelRoomInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelRoomInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelRoomInfoResponseBody setModule(java.util.List<HotelRoomInfoResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<HotelRoomInfoResponseBodyModule> getModule() {
        return this.module;
    }

    public HotelRoomInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelRoomInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelRoomInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos extends TeaModel {
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

        public static HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos self = new HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos();
            return TeaModel.build(map, self);
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos setBedDesc(String bedDesc) {
            this.bedDesc = bedDesc;
            return this;
        }
        public String getBedDesc() {
            return this.bedDesc;
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos setBedNum(Integer bedNum) {
            this.bedNum = bedNum;
            return this;
        }
        public Integer getBedNum() {
            return this.bedNum;
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos setBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }
        public String getBedSize() {
            return this.bedSize;
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos setLength(String length) {
            this.length = length;
            return this;
        }
        public String getLength() {
            return this.length;
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class HotelRoomInfoResponseBodyModuleBedInfoGroupList extends TeaModel {
        @NameInMap("bed_infos")
        public java.util.List<HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos> bedInfos;

        public static HotelRoomInfoResponseBodyModuleBedInfoGroupList build(java.util.Map<String, ?> map) throws Exception {
            HotelRoomInfoResponseBodyModuleBedInfoGroupList self = new HotelRoomInfoResponseBodyModuleBedInfoGroupList();
            return TeaModel.build(map, self);
        }

        public HotelRoomInfoResponseBodyModuleBedInfoGroupList setBedInfos(java.util.List<HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos> bedInfos) {
            this.bedInfos = bedInfos;
            return this;
        }
        public java.util.List<HotelRoomInfoResponseBodyModuleBedInfoGroupListBedInfos> getBedInfos() {
            return this.bedInfos;
        }

    }

    public static class HotelRoomInfoResponseBodyModuleBedInfos extends TeaModel {
        @NameInMap("bed_desc")
        public String bedDesc;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("bed_num")
        public Integer bedNum;

        /**
         * <strong>example:</strong>
         * <p>1.8*2.0m</p>
         */
        @NameInMap("bed_size")
        public String bedSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("bed_type")
        public String bedType;

        @NameInMap("length")
        public String length;

        @NameInMap("width")
        public String width;

        public static HotelRoomInfoResponseBodyModuleBedInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelRoomInfoResponseBodyModuleBedInfos self = new HotelRoomInfoResponseBodyModuleBedInfos();
            return TeaModel.build(map, self);
        }

        public HotelRoomInfoResponseBodyModuleBedInfos setBedDesc(String bedDesc) {
            this.bedDesc = bedDesc;
            return this;
        }
        public String getBedDesc() {
            return this.bedDesc;
        }

        public HotelRoomInfoResponseBodyModuleBedInfos setBedNum(Integer bedNum) {
            this.bedNum = bedNum;
            return this;
        }
        public Integer getBedNum() {
            return this.bedNum;
        }

        public HotelRoomInfoResponseBodyModuleBedInfos setBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }
        public String getBedSize() {
            return this.bedSize;
        }

        public HotelRoomInfoResponseBodyModuleBedInfos setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

        public HotelRoomInfoResponseBodyModuleBedInfos setLength(String length) {
            this.length = length;
            return this;
        }
        public String getLength() {
            return this.length;
        }

        public HotelRoomInfoResponseBodyModuleBedInfos setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class HotelRoomInfoResponseBodyModuleRoomImages extends TeaModel {
        @NameInMap("bed_infos2")
        public String bedInfos2;

        @NameInMap("tag")
        public Integer tag;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg">https://img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static HotelRoomInfoResponseBodyModuleRoomImages build(java.util.Map<String, ?> map) throws Exception {
            HotelRoomInfoResponseBodyModuleRoomImages self = new HotelRoomInfoResponseBodyModuleRoomImages();
            return TeaModel.build(map, self);
        }

        public HotelRoomInfoResponseBodyModuleRoomImages setBedInfos2(String bedInfos2) {
            this.bedInfos2 = bedInfos2;
            return this;
        }
        public String getBedInfos2() {
            return this.bedInfos2;
        }

        public HotelRoomInfoResponseBodyModuleRoomImages setTag(Integer tag) {
            this.tag = tag;
            return this;
        }
        public Integer getTag() {
            return this.tag;
        }

        public HotelRoomInfoResponseBodyModuleRoomImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class HotelRoomInfoResponseBodyModule extends TeaModel {
        @NameInMap("bed_info_group_list")
        public java.util.List<HotelRoomInfoResponseBodyModuleBedInfoGroupList> bedInfoGroupList;

        @NameInMap("bed_infos")
        public java.util.List<HotelRoomInfoResponseBodyModuleBedInfos> bedInfos;

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
         * <p>2</p>
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
         * <p>3</p>
         */
        @NameInMap("max_occupancy")
        public Integer maxOccupancy;

        @NameInMap("room_desc")
        public String roomDesc;

        @NameInMap("room_facilities")
        public String roomFacilities;

        @NameInMap("room_facility_list")
        public java.util.List<String> roomFacilityList;

        /**
         * <strong>example:</strong>
         * <p>84536009</p>
         */
        @NameInMap("room_id")
        public String roomId;

        /**
         * <strong>example:</strong>
         * <p>//img.alicdn.com/imgextra/i2/6000000007493/O1CN010Vmxaz25DqUblX82A_!!6000000007493-2-hotel.png</p>
         */
        @NameInMap("room_image")
        public String roomImage;

        @NameInMap("room_images")
        public java.util.List<HotelRoomInfoResponseBodyModuleRoomImages> roomImages;

        @NameInMap("room_name")
        public String roomName;

        @NameInMap("room_type")
        public Integer roomType;

        @NameInMap("roomarea")
        public String roomarea;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("rooms")
        public Integer rooms;

        @NameInMap("smoke")
        public String smoke;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("window")
        public String window;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("window_bad")
        public String windowBad;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("window_view")
        public String windowView;

        public static HotelRoomInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelRoomInfoResponseBodyModule self = new HotelRoomInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelRoomInfoResponseBodyModule setBedInfoGroupList(java.util.List<HotelRoomInfoResponseBodyModuleBedInfoGroupList> bedInfoGroupList) {
            this.bedInfoGroupList = bedInfoGroupList;
            return this;
        }
        public java.util.List<HotelRoomInfoResponseBodyModuleBedInfoGroupList> getBedInfoGroupList() {
            return this.bedInfoGroupList;
        }

        public HotelRoomInfoResponseBodyModule setBedInfos(java.util.List<HotelRoomInfoResponseBodyModuleBedInfos> bedInfos) {
            this.bedInfos = bedInfos;
            return this;
        }
        public java.util.List<HotelRoomInfoResponseBodyModuleBedInfos> getBedInfos() {
            return this.bedInfos;
        }

        public HotelRoomInfoResponseBodyModule setExtraBed(Integer extraBed) {
            this.extraBed = extraBed;
            return this;
        }
        public Integer getExtraBed() {
            return this.extraBed;
        }

        public HotelRoomInfoResponseBodyModule setExtraBedDesc(String extraBedDesc) {
            this.extraBedDesc = extraBedDesc;
            return this;
        }
        public String getExtraBedDesc() {
            return this.extraBedDesc;
        }

        public HotelRoomInfoResponseBodyModule setFloor(String floor) {
            this.floor = floor;
            return this;
        }
        public String getFloor() {
            return this.floor;
        }

        public HotelRoomInfoResponseBodyModule setInternetWay(String internetWay) {
            this.internetWay = internetWay;
            return this;
        }
        public String getInternetWay() {
            return this.internetWay;
        }

        public HotelRoomInfoResponseBodyModule setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public HotelRoomInfoResponseBodyModule setRoomDesc(String roomDesc) {
            this.roomDesc = roomDesc;
            return this;
        }
        public String getRoomDesc() {
            return this.roomDesc;
        }

        public HotelRoomInfoResponseBodyModule setRoomFacilities(String roomFacilities) {
            this.roomFacilities = roomFacilities;
            return this;
        }
        public String getRoomFacilities() {
            return this.roomFacilities;
        }

        public HotelRoomInfoResponseBodyModule setRoomFacilityList(java.util.List<String> roomFacilityList) {
            this.roomFacilityList = roomFacilityList;
            return this;
        }
        public java.util.List<String> getRoomFacilityList() {
            return this.roomFacilityList;
        }

        public HotelRoomInfoResponseBodyModule setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public HotelRoomInfoResponseBodyModule setRoomImage(String roomImage) {
            this.roomImage = roomImage;
            return this;
        }
        public String getRoomImage() {
            return this.roomImage;
        }

        public HotelRoomInfoResponseBodyModule setRoomImages(java.util.List<HotelRoomInfoResponseBodyModuleRoomImages> roomImages) {
            this.roomImages = roomImages;
            return this;
        }
        public java.util.List<HotelRoomInfoResponseBodyModuleRoomImages> getRoomImages() {
            return this.roomImages;
        }

        public HotelRoomInfoResponseBodyModule setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public HotelRoomInfoResponseBodyModule setRoomType(Integer roomType) {
            this.roomType = roomType;
            return this;
        }
        public Integer getRoomType() {
            return this.roomType;
        }

        public HotelRoomInfoResponseBodyModule setRoomarea(String roomarea) {
            this.roomarea = roomarea;
            return this;
        }
        public String getRoomarea() {
            return this.roomarea;
        }

        public HotelRoomInfoResponseBodyModule setRooms(Integer rooms) {
            this.rooms = rooms;
            return this;
        }
        public Integer getRooms() {
            return this.rooms;
        }

        public HotelRoomInfoResponseBodyModule setSmoke(String smoke) {
            this.smoke = smoke;
            return this;
        }
        public String getSmoke() {
            return this.smoke;
        }

        public HotelRoomInfoResponseBodyModule setWindow(String window) {
            this.window = window;
            return this;
        }
        public String getWindow() {
            return this.window;
        }

        public HotelRoomInfoResponseBodyModule setWindowBad(String windowBad) {
            this.windowBad = windowBad;
            return this;
        }
        public String getWindowBad() {
            return this.windowBad;
        }

        public HotelRoomInfoResponseBodyModule setWindowView(String windowView) {
            this.windowView = windowView;
            return this;
        }
        public String getWindowView() {
            return this.windowView;
        }

    }

}
