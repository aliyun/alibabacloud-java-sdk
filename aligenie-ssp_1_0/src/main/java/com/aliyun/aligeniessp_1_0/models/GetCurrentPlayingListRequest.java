// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingListRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetCurrentPlayingListRequestDeviceInfo deviceInfo;

    @NameInMap("OpenQueryPlayListRequest")
    public GetCurrentPlayingListRequestOpenQueryPlayListRequest openQueryPlayListRequest;

    @NameInMap("UserInfo")
    public GetCurrentPlayingListRequestUserInfo userInfo;

    public static GetCurrentPlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingListRequest self = new GetCurrentPlayingListRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingListRequest setDeviceInfo(GetCurrentPlayingListRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetCurrentPlayingListRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetCurrentPlayingListRequest setOpenQueryPlayListRequest(GetCurrentPlayingListRequestOpenQueryPlayListRequest openQueryPlayListRequest) {
        this.openQueryPlayListRequest = openQueryPlayListRequest;
        return this;
    }
    public GetCurrentPlayingListRequestOpenQueryPlayListRequest getOpenQueryPlayListRequest() {
        return this.openQueryPlayListRequest;
    }

    public GetCurrentPlayingListRequest setUserInfo(GetCurrentPlayingListRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetCurrentPlayingListRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetCurrentPlayingListRequestDeviceInfo extends TeaModel {
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

        public static GetCurrentPlayingListRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListRequestDeviceInfo self = new GetCurrentPlayingListRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCurrentPlayingListRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCurrentPlayingListRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCurrentPlayingListRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCurrentPlayingListRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetCurrentPlayingListRequestOpenQueryPlayListRequest extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static GetCurrentPlayingListRequestOpenQueryPlayListRequest build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListRequestOpenQueryPlayListRequest self = new GetCurrentPlayingListRequestOpenQueryPlayListRequest();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListRequestOpenQueryPlayListRequest setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetCurrentPlayingListRequestOpenQueryPlayListRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class GetCurrentPlayingListRequestUserInfo extends TeaModel {
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

        public static GetCurrentPlayingListRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListRequestUserInfo self = new GetCurrentPlayingListRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCurrentPlayingListRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCurrentPlayingListRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCurrentPlayingListRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCurrentPlayingListRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
