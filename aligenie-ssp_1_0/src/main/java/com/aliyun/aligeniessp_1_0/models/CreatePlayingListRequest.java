// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListRequest extends TeaModel {
    /**
     * <p>Device ID information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public CreatePlayingListRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenCreatePlayingListRequest")
    public CreatePlayingListRequestOpenCreatePlayingListRequest openCreatePlayingListRequest;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public CreatePlayingListRequestUserInfo userInfo;

    public static CreatePlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListRequest self = new CreatePlayingListRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListRequest setDeviceInfo(CreatePlayingListRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CreatePlayingListRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CreatePlayingListRequest setOpenCreatePlayingListRequest(CreatePlayingListRequestOpenCreatePlayingListRequest openCreatePlayingListRequest) {
        this.openCreatePlayingListRequest = openCreatePlayingListRequest;
        return this;
    }
    public CreatePlayingListRequestOpenCreatePlayingListRequest getOpenCreatePlayingListRequest() {
        return this.openCreatePlayingListRequest;
    }

    public CreatePlayingListRequest setUserInfo(CreatePlayingListRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreatePlayingListRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CreatePlayingListRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID.<br>When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used as the encoding type for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used as the encoding type for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID.</p>
         * <p><code>OPEN_ID</code>: Default device ID identity.<br><code>UNION_ID</code>: Organization-dimension device ID identity. This value is available only after an organization has been requested on the Tmall Genie skill application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreatePlayingListRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListRequestDeviceInfo self = new CreatePlayingListRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreatePlayingListRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreatePlayingListRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePlayingListRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreatePlayingListRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CreatePlayingListRequestOpenCreatePlayingListRequestContentList extends TeaModel {
        /**
         * <p>Third-party ID.</p>
         * <p>If the content type is &quot;content&quot;, this is the content ID. If it is &quot;album&quot;, this is the album ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <p>Source</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xiami</p>
         */
        @NameInMap("Source")
        public String source;

        public static CreatePlayingListRequestOpenCreatePlayingListRequestContentList build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListRequestOpenCreatePlayingListRequestContentList self = new CreatePlayingListRequestOpenCreatePlayingListRequestContentList();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequestContentList setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequestContentList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class CreatePlayingListRequestOpenCreatePlayingListRequest extends TeaModel {
        /**
         * <p>Playback content list.</p>
         * <p>If the content type is &quot;content&quot;, multiple entries are supported. If it is &quot;album&quot;, only the first entry takes effect.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ContentList")
        public java.util.List<CreatePlayingListRequestOpenCreatePlayingListRequestContentList> contentList;

        /**
         * <p>Content type for playback.</p>
         * <p>Values: &quot;content&quot; for content, &quot;album&quot; for album, and &quot;collect&quot; for playlist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>extension information</p>
         */
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <p>Playback index.</p>
         * <p>Can be empty. Default is 0, indicating playback starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>Whether to resume album playback. For example, if the user previously listened up to episode 5 of an album, whether to continue from episode 5. Default is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAlbumContinued")
        public Boolean needAlbumContinued;

        /**
         * <p>Playback source, the UUID for configuring playback control capabilities.</p>
         * <p>Can be empty. Default is &quot;default&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("PlayFrom")
        public String playFrom;

        /**
         * <p>Playback pattern.</p>
         * <p>Repeat: list loop; Shuffle: random; RepeatOne: single track loop; Normal: sequential playback.</p>
         * 
         * <strong>example:</strong>
         * <p>Repeat</p>
         */
        @NameInMap("PlayMode")
        public String playMode;

        public static CreatePlayingListRequestOpenCreatePlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListRequestOpenCreatePlayingListRequest self = new CreatePlayingListRequestOpenCreatePlayingListRequest();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setContentList(java.util.List<CreatePlayingListRequestOpenCreatePlayingListRequestContentList> contentList) {
            this.contentList = contentList;
            return this;
        }
        public java.util.List<CreatePlayingListRequestOpenCreatePlayingListRequestContentList> getContentList() {
            return this.contentList;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setNeedAlbumContinued(Boolean needAlbumContinued) {
            this.needAlbumContinued = needAlbumContinued;
            return this;
        }
        public Boolean getNeedAlbumContinued() {
            return this.needAlbumContinued;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setPlayFrom(String playFrom) {
            this.playFrom = playFrom;
            return this;
        }
        public String getPlayFrom() {
            return this.playFrom;
        }

        public CreatePlayingListRequestOpenCreatePlayingListRequest setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

    }

    public static class CreatePlayingListRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID.<br>When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used as the encoding type for the Android application customer link.<br><code>SKILL_ID</code>: Skill ID, used as the encoding type for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to either userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID.</p>
         * <p><code>OPEN_ID</code>: Default User ID identity.<br><code>UNION_ID</code>: Organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie skill application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreatePlayingListRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListRequestUserInfo self = new CreatePlayingListRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreatePlayingListRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreatePlayingListRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePlayingListRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreatePlayingListRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
