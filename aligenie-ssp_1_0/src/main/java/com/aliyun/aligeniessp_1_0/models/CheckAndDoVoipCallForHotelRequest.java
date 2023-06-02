// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAndDoVoipCallForHotelRequest extends TeaModel {
    @NameInMap("BizData")
    public String bizData;

    @NameInMap("CalleeNick")
    public String calleeNick;

    @NameInMap("CalleePhoneNum")
    public String calleePhoneNum;

    @NameInMap("DeviceInfo")
    public CheckAndDoVoipCallForHotelRequestDeviceInfo deviceInfo;

    @NameInMap("UserInfo")
    public CheckAndDoVoipCallForHotelRequestUserInfo userInfo;

    public static CheckAndDoVoipCallForHotelRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAndDoVoipCallForHotelRequest self = new CheckAndDoVoipCallForHotelRequest();
        return TeaModel.build(map, self);
    }

    public CheckAndDoVoipCallForHotelRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public CheckAndDoVoipCallForHotelRequest setCalleeNick(String calleeNick) {
        this.calleeNick = calleeNick;
        return this;
    }
    public String getCalleeNick() {
        return this.calleeNick;
    }

    public CheckAndDoVoipCallForHotelRequest setCalleePhoneNum(String calleePhoneNum) {
        this.calleePhoneNum = calleePhoneNum;
        return this;
    }
    public String getCalleePhoneNum() {
        return this.calleePhoneNum;
    }

    public CheckAndDoVoipCallForHotelRequest setDeviceInfo(CheckAndDoVoipCallForHotelRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CheckAndDoVoipCallForHotelRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CheckAndDoVoipCallForHotelRequest setUserInfo(CheckAndDoVoipCallForHotelRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CheckAndDoVoipCallForHotelRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CheckAndDoVoipCallForHotelRequestDeviceInfo extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static CheckAndDoVoipCallForHotelRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckAndDoVoipCallForHotelRequestDeviceInfo self = new CheckAndDoVoipCallForHotelRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CheckAndDoVoipCallForHotelRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CheckAndDoVoipCallForHotelRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CheckAndDoVoipCallForHotelRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CheckAndDoVoipCallForHotelRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CheckAndDoVoipCallForHotelRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CheckAndDoVoipCallForHotelRequestUserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static CheckAndDoVoipCallForHotelRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckAndDoVoipCallForHotelRequestUserInfo self = new CheckAndDoVoipCallForHotelRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CheckAndDoVoipCallForHotelRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CheckAndDoVoipCallForHotelRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CheckAndDoVoipCallForHotelRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CheckAndDoVoipCallForHotelRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CheckAndDoVoipCallForHotelRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
