// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CloudPlayerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurPlayIndex")
    public Integer curPlayIndex;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public CloudPlayerRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("PlayMode")
    public String playMode;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SongId")
    public String songId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SongIdList")
    public java.util.List<String> songIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KG</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public CloudPlayerRequestUserInfo userInfo;

    public static CloudPlayerRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudPlayerRequest self = new CloudPlayerRequest();
        return TeaModel.build(map, self);
    }

    public CloudPlayerRequest setCurPlayIndex(Integer curPlayIndex) {
        this.curPlayIndex = curPlayIndex;
        return this;
    }
    public Integer getCurPlayIndex() {
        return this.curPlayIndex;
    }

    public CloudPlayerRequest setDeviceInfo(CloudPlayerRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CloudPlayerRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CloudPlayerRequest setPlayMode(String playMode) {
        this.playMode = playMode;
        return this;
    }
    public String getPlayMode() {
        return this.playMode;
    }

    public CloudPlayerRequest setSongId(String songId) {
        this.songId = songId;
        return this;
    }
    public String getSongId() {
        return this.songId;
    }

    public CloudPlayerRequest setSongIdList(java.util.List<String> songIdList) {
        this.songIdList = songIdList;
        return this;
    }
    public java.util.List<String> getSongIdList() {
        return this.songIdList;
    }

    public CloudPlayerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CloudPlayerRequest setUserInfo(CloudPlayerRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CloudPlayerRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CloudPlayerRequestDeviceInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static CloudPlayerRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CloudPlayerRequestDeviceInfo self = new CloudPlayerRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CloudPlayerRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CloudPlayerRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CloudPlayerRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudPlayerRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CloudPlayerRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CloudPlayerRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static CloudPlayerRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CloudPlayerRequestUserInfo self = new CloudPlayerRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CloudPlayerRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CloudPlayerRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CloudPlayerRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudPlayerRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CloudPlayerRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
