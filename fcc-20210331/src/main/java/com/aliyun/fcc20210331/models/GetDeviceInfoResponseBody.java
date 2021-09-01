// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetDeviceInfoResponseBodyData> data;

    public static GetDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoResponseBody self = new GetDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceInfoResponseBody setData(java.util.List<GetDeviceInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDeviceInfoResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CapturedPictureId")
        public String capturedPictureId;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("InProtocol")
        public String inProtocol;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Latitude")
        public String latitude;

        public static GetDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceInfoResponseBodyData self = new GetDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeviceInfoResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetDeviceInfoResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetDeviceInfoResponseBodyData setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public GetDeviceInfoResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDeviceInfoResponseBodyData setCapturedPictureId(String capturedPictureId) {
            this.capturedPictureId = capturedPictureId;
            return this;
        }
        public String getCapturedPictureId() {
            return this.capturedPictureId;
        }

        public GetDeviceInfoResponseBodyData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public GetDeviceInfoResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetDeviceInfoResponseBodyData setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public GetDeviceInfoResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public GetDeviceInfoResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

    }

}
