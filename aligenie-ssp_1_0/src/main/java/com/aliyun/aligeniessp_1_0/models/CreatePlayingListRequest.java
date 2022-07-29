// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public CreatePlayingListRequestDeviceInfo deviceInfo;

    @NameInMap("OpenCreatePlayingListRequest")
    public CreatePlayingListRequestOpenCreatePlayingListRequest openCreatePlayingListRequest;

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
        @NameInMap("RawId")
        public String rawId;

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
        @NameInMap("ContentList")
        public java.util.List<CreatePlayingListRequestOpenCreatePlayingListRequestContentList> contentList;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("NeedAlbumContinued")
        public Boolean needAlbumContinued;

        @NameInMap("PlayFrom")
        public String playFrom;

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
