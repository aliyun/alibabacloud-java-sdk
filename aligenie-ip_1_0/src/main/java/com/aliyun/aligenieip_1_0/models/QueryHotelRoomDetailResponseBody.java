// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelRoomDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryHotelRoomDetailResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static QueryHotelRoomDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelRoomDetailResponseBody self = new QueryHotelRoomDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotelRoomDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotelRoomDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotelRoomDetailResponseBody setResult(QueryHotelRoomDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryHotelRoomDetailResponseBodyResult getResult() {
        return this.result;
    }

    public QueryHotelRoomDetailResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class QueryHotelRoomDetailResponseBodyResultAuthAccounts extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01 12:00:00</p>
         */
        @NameInMap("AuthTime")
        public String authTime;

        public static QueryHotelRoomDetailResponseBodyResultAuthAccounts build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResultAuthAccounts self = new QueryHotelRoomDetailResponseBodyResultAuthAccounts();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResultAuthAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryHotelRoomDetailResponseBodyResultAuthAccounts setAuthTime(String authTime) {
            this.authTime = authTime;
            return this;
        }
        public String getAuthTime() {
            return this.authTime;
        }

    }

    public static class QueryHotelRoomDetailResponseBodyResultDeviceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-01-01 12:00:00</p>
         */
        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>6.1.8-RS-20230425.1806</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <strong>example:</strong>
         * <p>fa:03:23:58:c3:00</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineStatus")
        public Integer onlineStatus;

        /**
         * <strong>example:</strong>
         * <p>sag42dlz4qf</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <strong>example:</strong>
         * <p>41c95c18a0a643bcb58edf438877def5</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static QueryHotelRoomDetailResponseBodyResultDeviceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResultDeviceInfos self = new QueryHotelRoomDetailResponseBodyResultDeviceInfos();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setOnlineStatus(Integer onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Integer getOnlineStatus() {
            return this.onlineStatus;
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public QueryHotelRoomDetailResponseBodyResultDeviceInfos setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryHotelRoomDetailResponseBodyResultOtherService extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OpenCall")
        public Boolean openCall;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnhandleTickets")
        public Integer unhandleTickets;

        public static QueryHotelRoomDetailResponseBodyResultOtherService build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResultOtherService self = new QueryHotelRoomDetailResponseBodyResultOtherService();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResultOtherService setOpenCall(Boolean openCall) {
            this.openCall = openCall;
            return this;
        }
        public Boolean getOpenCall() {
            return this.openCall;
        }

        public QueryHotelRoomDetailResponseBodyResultOtherService setUnhandleTickets(Integer unhandleTickets) {
            this.unhandleTickets = unhandleTickets;
            return this;
        }
        public Integer getUnhandleTickets() {
            return this.unhandleTickets;
        }

    }

    public static class QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("CategoryEnName")
        public String categoryEnName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>rcu</p>
         */
        @NameInMap("DeviceConnectType")
        public String deviceConnectType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DeviceCount")
        public Integer deviceCount;

        /**
         * <strong>example:</strong>
         * <p>readLight</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>room</p>
         */
        @NameInMap("LocationEnName")
        public String locationEnName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("LocationName")
        public String locationName;

        /**
         * <strong>example:</strong>
         * <p>a1ueWGP6W2L</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos self = new QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setCategoryEnName(String categoryEnName) {
            this.categoryEnName = categoryEnName;
            return this;
        }
        public String getCategoryEnName() {
            return this.categoryEnName;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setDeviceConnectType(String deviceConnectType) {
            this.deviceConnectType = deviceConnectType;
            return this;
        }
        public String getDeviceConnectType() {
            return this.deviceConnectType;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setLocationEnName(String locationEnName) {
            this.locationEnName = locationEnName;
            return this;
        }
        public String getLocationEnName() {
            return this.locationEnName;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class QueryHotelRoomDetailResponseBodyResultRoomControlInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DeviceInfos")
        public java.util.List<QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos> deviceInfos;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.com">http://www.xxx.com</a></p>
         */
        @NameInMap("RcuUrl")
        public String rcuUrl;

        /**
         * <strong>example:</strong>
         * <p>1170</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static QueryHotelRoomDetailResponseBodyResultRoomControlInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResultRoomControlInfo self = new QueryHotelRoomDetailResponseBodyResultRoomControlInfo();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo setDeviceInfos(java.util.List<QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos> deviceInfos) {
            this.deviceInfos = deviceInfos;
            return this;
        }
        public java.util.List<QueryHotelRoomDetailResponseBodyResultRoomControlInfoDeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo setRcuUrl(String rcuUrl) {
            this.rcuUrl = rcuUrl;
            return this;
        }
        public String getRcuUrl() {
            return this.rcuUrl;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class QueryHotelRoomDetailResponseBodyResultRoomServiceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BookServiceCnt")
        public Integer bookServiceCnt;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GoodsServiceCnt")
        public Integer goodsServiceCnt;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RepairServiceCnt")
        public Integer repairServiceCnt;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RoomServiceCnt")
        public Integer roomServiceCnt;

        public static QueryHotelRoomDetailResponseBodyResultRoomServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResultRoomServiceInfo self = new QueryHotelRoomDetailResponseBodyResultRoomServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResultRoomServiceInfo setBookServiceCnt(Integer bookServiceCnt) {
            this.bookServiceCnt = bookServiceCnt;
            return this;
        }
        public Integer getBookServiceCnt() {
            return this.bookServiceCnt;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomServiceInfo setGoodsServiceCnt(Integer goodsServiceCnt) {
            this.goodsServiceCnt = goodsServiceCnt;
            return this;
        }
        public Integer getGoodsServiceCnt() {
            return this.goodsServiceCnt;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomServiceInfo setRepairServiceCnt(Integer repairServiceCnt) {
            this.repairServiceCnt = repairServiceCnt;
            return this;
        }
        public Integer getRepairServiceCnt() {
            return this.repairServiceCnt;
        }

        public QueryHotelRoomDetailResponseBodyResultRoomServiceInfo setRoomServiceCnt(Integer roomServiceCnt) {
            this.roomServiceCnt = roomServiceCnt;
            return this;
        }
        public Integer getRoomServiceCnt() {
            return this.roomServiceCnt;
        }

    }

    public static class QueryHotelRoomDetailResponseBodyResult extends TeaModel {
        @NameInMap("AuthAccounts")
        public java.util.List<QueryHotelRoomDetailResponseBodyResultAuthAccounts> authAccounts;

        /**
         * <strong>example:</strong>
         * <p>rcu</p>
         */
        @NameInMap("ConnectType")
        public String connectType;

        @NameInMap("CreatorAccountName")
        public String creatorAccountName;

        @NameInMap("DeviceInfos")
        public java.util.List<QueryHotelRoomDetailResponseBodyResultDeviceInfos> deviceInfos;

        /**
         * <strong>example:</strong>
         * <p>a7***83</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("HotelName")
        public String hotelName;

        @NameInMap("OtherService")
        public QueryHotelRoomDetailResponseBodyResultOtherService otherService;

        @NameInMap("RoomControlInfo")
        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo roomControlInfo;

        /**
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        @NameInMap("RoomServiceInfo")
        public QueryHotelRoomDetailResponseBodyResultRoomServiceInfo roomServiceInfo;

        public static QueryHotelRoomDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelRoomDetailResponseBodyResult self = new QueryHotelRoomDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryHotelRoomDetailResponseBodyResult setAuthAccounts(java.util.List<QueryHotelRoomDetailResponseBodyResultAuthAccounts> authAccounts) {
            this.authAccounts = authAccounts;
            return this;
        }
        public java.util.List<QueryHotelRoomDetailResponseBodyResultAuthAccounts> getAuthAccounts() {
            return this.authAccounts;
        }

        public QueryHotelRoomDetailResponseBodyResult setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public QueryHotelRoomDetailResponseBodyResult setCreatorAccountName(String creatorAccountName) {
            this.creatorAccountName = creatorAccountName;
            return this;
        }
        public String getCreatorAccountName() {
            return this.creatorAccountName;
        }

        public QueryHotelRoomDetailResponseBodyResult setDeviceInfos(java.util.List<QueryHotelRoomDetailResponseBodyResultDeviceInfos> deviceInfos) {
            this.deviceInfos = deviceInfos;
            return this;
        }
        public java.util.List<QueryHotelRoomDetailResponseBodyResultDeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        public QueryHotelRoomDetailResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public QueryHotelRoomDetailResponseBodyResult setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public QueryHotelRoomDetailResponseBodyResult setOtherService(QueryHotelRoomDetailResponseBodyResultOtherService otherService) {
            this.otherService = otherService;
            return this;
        }
        public QueryHotelRoomDetailResponseBodyResultOtherService getOtherService() {
            return this.otherService;
        }

        public QueryHotelRoomDetailResponseBodyResult setRoomControlInfo(QueryHotelRoomDetailResponseBodyResultRoomControlInfo roomControlInfo) {
            this.roomControlInfo = roomControlInfo;
            return this;
        }
        public QueryHotelRoomDetailResponseBodyResultRoomControlInfo getRoomControlInfo() {
            return this.roomControlInfo;
        }

        public QueryHotelRoomDetailResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public QueryHotelRoomDetailResponseBodyResult setRoomServiceInfo(QueryHotelRoomDetailResponseBodyResultRoomServiceInfo roomServiceInfo) {
            this.roomServiceInfo = roomServiceInfo;
            return this;
        }
        public QueryHotelRoomDetailResponseBodyResultRoomServiceInfo getRoomServiceInfo() {
            return this.roomServiceInfo;
        }

    }

}
