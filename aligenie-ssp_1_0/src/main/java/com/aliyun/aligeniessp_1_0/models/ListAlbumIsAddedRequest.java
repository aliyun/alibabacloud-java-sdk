// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumIsAddedRequest extends TeaModel {
    @NameInMap("AlbumIdList")
    public java.util.List<String> albumIdList;

    @NameInMap("DeviceInfo")
    public ListAlbumIsAddedRequestDeviceInfo deviceInfo;

    @NameInMap("UserInfo")
    public ListAlbumIsAddedRequestUserInfo userInfo;

    public static ListAlbumIsAddedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumIsAddedRequest self = new ListAlbumIsAddedRequest();
        return TeaModel.build(map, self);
    }

    public ListAlbumIsAddedRequest setAlbumIdList(java.util.List<String> albumIdList) {
        this.albumIdList = albumIdList;
        return this;
    }
    public java.util.List<String> getAlbumIdList() {
        return this.albumIdList;
    }

    public ListAlbumIsAddedRequest setDeviceInfo(ListAlbumIsAddedRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListAlbumIsAddedRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListAlbumIsAddedRequest setUserInfo(ListAlbumIsAddedRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListAlbumIsAddedRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListAlbumIsAddedRequestDeviceInfo extends TeaModel {
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

        public static ListAlbumIsAddedRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumIsAddedRequestDeviceInfo self = new ListAlbumIsAddedRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListAlbumIsAddedRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListAlbumIsAddedRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListAlbumIsAddedRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlbumIsAddedRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListAlbumIsAddedRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListAlbumIsAddedRequestUserInfo extends TeaModel {
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

        public static ListAlbumIsAddedRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumIsAddedRequestUserInfo self = new ListAlbumIsAddedRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListAlbumIsAddedRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListAlbumIsAddedRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListAlbumIsAddedRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlbumIsAddedRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListAlbumIsAddedRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
