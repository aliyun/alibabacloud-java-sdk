// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListMusicRequest extends TeaModel {
    /**
     * <p>Device ID information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListMusicRequestDeviceInfo deviceInfo;

    /**
     * <p>Input parameters for the service request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public ListMusicRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListMusicRequestUserInfo userInfo;

    public static ListMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMusicRequest self = new ListMusicRequest();
        return TeaModel.build(map, self);
    }

    public ListMusicRequest setDeviceInfo(ListMusicRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListMusicRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListMusicRequest setPayload(ListMusicRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListMusicRequestPayload getPayload() {
        return this.payload;
    }

    public ListMusicRequest setUserInfo(ListMusicRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListMusicRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListMusicRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type: when the encoding type is SKILL_ID, the value is the application\&quot;s SkillID; when the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME refers to the APK package name, used in the Android application customer link; SKILL_ID refers to the skill ID, used in the cloud link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID (deviceOpenId or deviceUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID: OPEN_ID indicates the default device ID; UNION_ID indicates the organization-dimension device ID, which is available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListMusicRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMusicRequestDeviceInfo self = new ListMusicRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListMusicRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListMusicRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListMusicRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMusicRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListMusicRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListMusicRequestPayload extends TeaModel {
        /**
         * <p>Current page</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Ringtone ID, an extension field; currently not required</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicId")
        public Long musicId;

        /**
         * <p>Ringtone name, an extension field; currently not required to be passed.</p>
         * 
         * <strong>example:</strong>
         * <p>xx铃声</p>
         */
        @NameInMap("MusicName")
        public String musicName;

        /**
         * <p>Ringtone category ID, returned by the queryMusicType API</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicType")
        public Long musicType;

        /**
         * <p>Ringtone category name, returned by the queryMusicType API</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx音乐</p>
         */
        @NameInMap("MusicTypeName")
        public String musicTypeName;

        /**
         * <p>Number of entries per page: maximum value is 100</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListMusicRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListMusicRequestPayload self = new ListMusicRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListMusicRequestPayload setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMusicRequestPayload setMusicId(Long musicId) {
            this.musicId = musicId;
            return this;
        }
        public Long getMusicId() {
            return this.musicId;
        }

        public ListMusicRequestPayload setMusicName(String musicName) {
            this.musicName = musicName;
            return this;
        }
        public String getMusicName() {
            return this.musicName;
        }

        public ListMusicRequestPayload setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public ListMusicRequestPayload setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public ListMusicRequestPayload setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListMusicRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the application\&quot;s SkillID. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: PACKAGE_NAME: APK package name, used for Android application customer links; SKILL_ID: skill ID, used for cloud-based links</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of user ID: OPEN_ID: default user ID identifier; UNION_ID: organization-dimension user ID identifier, available only after an organization has been requested on the Maojing Skill Application Open Platform</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID, required if IdType is UNION_ID</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListMusicRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMusicRequestUserInfo self = new ListMusicRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListMusicRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListMusicRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListMusicRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMusicRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListMusicRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
