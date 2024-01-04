// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class MobileRecommendRequest extends TeaModel {
    @NameInMap("BotId")
    public String botId;

    @NameInMap("Count")
    public String count;

    @NameInMap("DeviceInfo")
    public MobileRecommendRequestDeviceInfo deviceInfo;

    @NameInMap("Style")
    public String style;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserInfo")
    public MobileRecommendRequestUserInfo userInfo;

    public static MobileRecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileRecommendRequest self = new MobileRecommendRequest();
        return TeaModel.build(map, self);
    }

    public MobileRecommendRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public MobileRecommendRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public MobileRecommendRequest setDeviceInfo(MobileRecommendRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public MobileRecommendRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public MobileRecommendRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public MobileRecommendRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MobileRecommendRequest setUserInfo(MobileRecommendRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public MobileRecommendRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class MobileRecommendRequestDeviceInfo extends TeaModel {
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

        public static MobileRecommendRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            MobileRecommendRequestDeviceInfo self = new MobileRecommendRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public MobileRecommendRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public MobileRecommendRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public MobileRecommendRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public MobileRecommendRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public MobileRecommendRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class MobileRecommendRequestUserInfo extends TeaModel {
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

        public static MobileRecommendRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            MobileRecommendRequestUserInfo self = new MobileRecommendRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public MobileRecommendRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public MobileRecommendRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public MobileRecommendRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public MobileRecommendRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public MobileRecommendRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
