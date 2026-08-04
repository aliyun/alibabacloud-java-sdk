// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class MobileRecommendRequest extends TeaModel {
    /**
     * <p>Bot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>Quantity of recommended Result</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>Device identification information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public MobileRecommendRequestDeviceInfo deviceInfo;

    /**
     * <p>Required when the request type is STYLE.</p>
     * 
     * <strong>example:</strong>
     * <p>轻音乐</p>
     */
    @NameInMap("Style")
    public String style;

    /**
     * <p>Request Type: Obtain daily recommendations, hot songs, or genre-based playlists.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY_REC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>User information – userId</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>Value corresponding to the encoding type. Enter the Project ID of the project to which the product belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1414895629783187053</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Enter PROJECT_ID here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID. Enter the value of deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fjwZiYQdtkaI95fHaLNjYcaOA/mxUPzxxw2J5iBiTBnjUCWKwER4TSHCqkBnNOYvGJ4bRZA9KzBB2naS4r/Am0lSe8ECDAAOcJ9QKLFF6DM=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID.</p>
         * <p>OPEN_ID: Default device ID.
         * UNION_ID: Organization-level device ID. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is required when <strong>IdType</strong> is set to <strong>UNION_ID</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>暂无</p>
         */
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
        /**
         * <p>The value corresponding to the encoding Type. Enter the Project ID of the project to which this product belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1414895629783187053</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>ID value</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R457Av3qg/OXTwVnFt12z6MwNe0HAS699V6n63OaLdu+VmwvhcNfMzBd+la553wWJhj3kBMjgHq2Y2dyCFoDBg==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>ID Type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is Required when IdType is set to UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>暂无</p>
         */
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
