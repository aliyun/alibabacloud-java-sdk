// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListMusicRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public ListMusicRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public ListMusicRequestPayload payload;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("MusicId")
        public Long musicId;

        @NameInMap("MusicName")
        public String musicName;

        @NameInMap("MusicType")
        public Long musicType;

        @NameInMap("MusicTypeName")
        public String musicTypeName;

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
