// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListOAuth2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public CreatePlayingListOAuth2RequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenCreatePlayingListRequest")
    public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest openCreatePlayingListRequest;

    public static CreatePlayingListOAuth2Request build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListOAuth2Request self = new CreatePlayingListOAuth2Request();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListOAuth2Request setDeviceInfo(CreatePlayingListOAuth2RequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public CreatePlayingListOAuth2RequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public CreatePlayingListOAuth2Request setOpenCreatePlayingListRequest(CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest openCreatePlayingListRequest) {
        this.openCreatePlayingListRequest = openCreatePlayingListRequest;
        return this;
    }
    public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest getOpenCreatePlayingListRequest() {
        return this.openCreatePlayingListRequest;
    }

    public static class CreatePlayingListOAuth2RequestDeviceInfo extends TeaModel {
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
         * <p>123</p>
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreatePlayingListOAuth2RequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListOAuth2RequestDeviceInfo self = new CreatePlayingListOAuth2RequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListOAuth2RequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CreatePlayingListOAuth2RequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CreatePlayingListOAuth2RequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePlayingListOAuth2RequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CreatePlayingListOAuth2RequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xiami</p>
         */
        @NameInMap("Source")
        public String source;

        public static CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList self = new CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ContentList")
        public java.util.List<CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList> contentList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>content</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAlbumContinued")
        public Boolean needAlbumContinued;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("PlayFrom")
        public String playFrom;

        /**
         * <strong>example:</strong>
         * <p>Repeat</p>
         */
        @NameInMap("PlayMode")
        public String playMode;

        public static CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest self = new CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setContentList(java.util.List<CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList> contentList) {
            this.contentList = contentList;
            return this;
        }
        public java.util.List<CreatePlayingListOAuth2RequestOpenCreatePlayingListRequestContentList> getContentList() {
            return this.contentList;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setNeedAlbumContinued(Boolean needAlbumContinued) {
            this.needAlbumContinued = needAlbumContinued;
            return this;
        }
        public Boolean getNeedAlbumContinued() {
            return this.needAlbumContinued;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setPlayFrom(String playFrom) {
            this.playFrom = playFrom;
            return this;
        }
        public String getPlayFrom() {
            return this.playFrom;
        }

        public CreatePlayingListOAuth2RequestOpenCreatePlayingListRequest setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

    }

}
