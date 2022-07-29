// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class IndexControlPlayingListRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public IndexControlPlayingListRequestDeviceInfo deviceInfo;

    @NameInMap("OpenIndexControlRequest")
    public IndexControlPlayingListRequestOpenIndexControlRequest openIndexControlRequest;

    @NameInMap("UserInfo")
    public IndexControlPlayingListRequestUserInfo userInfo;

    public static IndexControlPlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexControlPlayingListRequest self = new IndexControlPlayingListRequest();
        return TeaModel.build(map, self);
    }

    public IndexControlPlayingListRequest setDeviceInfo(IndexControlPlayingListRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public IndexControlPlayingListRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public IndexControlPlayingListRequest setOpenIndexControlRequest(IndexControlPlayingListRequestOpenIndexControlRequest openIndexControlRequest) {
        this.openIndexControlRequest = openIndexControlRequest;
        return this;
    }
    public IndexControlPlayingListRequestOpenIndexControlRequest getOpenIndexControlRequest() {
        return this.openIndexControlRequest;
    }

    public IndexControlPlayingListRequest setUserInfo(IndexControlPlayingListRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public IndexControlPlayingListRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class IndexControlPlayingListRequestDeviceInfo extends TeaModel {
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

        public static IndexControlPlayingListRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListRequestDeviceInfo self = new IndexControlPlayingListRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public IndexControlPlayingListRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public IndexControlPlayingListRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IndexControlPlayingListRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public IndexControlPlayingListRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class IndexControlPlayingListRequestOpenIndexControlRequest extends TeaModel {
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("NeedContentContinued")
        public Boolean needContentContinued;

        public static IndexControlPlayingListRequestOpenIndexControlRequest build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListRequestOpenIndexControlRequest self = new IndexControlPlayingListRequestOpenIndexControlRequest();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListRequestOpenIndexControlRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public IndexControlPlayingListRequestOpenIndexControlRequest setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public IndexControlPlayingListRequestOpenIndexControlRequest setNeedContentContinued(Boolean needContentContinued) {
            this.needContentContinued = needContentContinued;
            return this;
        }
        public Boolean getNeedContentContinued() {
            return this.needContentContinued;
        }

    }

    public static class IndexControlPlayingListRequestUserInfo extends TeaModel {
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

        public static IndexControlPlayingListRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListRequestUserInfo self = new IndexControlPlayingListRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public IndexControlPlayingListRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public IndexControlPlayingListRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IndexControlPlayingListRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public IndexControlPlayingListRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
