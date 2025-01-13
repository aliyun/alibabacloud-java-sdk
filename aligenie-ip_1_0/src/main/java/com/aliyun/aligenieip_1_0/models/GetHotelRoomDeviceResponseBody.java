// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelRoomDeviceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>vrehvuifdsgrts</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetHotelRoomDeviceResponseBodyResult> result;

    public static GetHotelRoomDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelRoomDeviceResponseBody self = new GetHotelRoomDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelRoomDeviceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHotelRoomDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelRoomDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelRoomDeviceResponseBody setResult(java.util.List<GetHotelRoomDeviceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetHotelRoomDeviceResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetHotelRoomDeviceResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.0.0-release</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <strong>example:</strong>
         * <p>af7***536</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        /**
         * <strong>example:</strong>
         * <p>aa:aa:aa:aa:aa:aa</p>
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
         * <p>1211</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        /**
         * <strong>example:</strong>
         * <p>dsfdsfrgreg</p>
         */
        @NameInMap("Sn")
        public String sn;

        public static GetHotelRoomDeviceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelRoomDeviceResponseBodyResult self = new GetHotelRoomDeviceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelRoomDeviceResponseBodyResult setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public GetHotelRoomDeviceResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public GetHotelRoomDeviceResponseBodyResult setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetHotelRoomDeviceResponseBodyResult setOnlineStatus(Integer onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Integer getOnlineStatus() {
            return this.onlineStatus;
        }

        public GetHotelRoomDeviceResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public GetHotelRoomDeviceResponseBodyResult setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

}
