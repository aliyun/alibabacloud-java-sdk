// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListRecommendContentRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public ListRecommendContentRequestDeviceInfo deviceInfo;

    @NameInMap("Request")
    public ListRecommendContentRequestRequest request;

    @NameInMap("UserInfo")
    public ListRecommendContentRequestUserInfo userInfo;

    public static ListRecommendContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendContentRequest self = new ListRecommendContentRequest();
        return TeaModel.build(map, self);
    }

    public ListRecommendContentRequest setDeviceInfo(ListRecommendContentRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListRecommendContentRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListRecommendContentRequest setRequest(ListRecommendContentRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListRecommendContentRequestRequest getRequest() {
        return this.request;
    }

    public ListRecommendContentRequest setUserInfo(ListRecommendContentRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListRecommendContentRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListRecommendContentRequestDeviceInfo extends TeaModel {
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

        public static ListRecommendContentRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentRequestDeviceInfo self = new ListRecommendContentRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRecommendContentRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRecommendContentRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecommendContentRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRecommendContentRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListRecommendContentRequestRequest extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Type")
        public String type;

        public static ListRecommendContentRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentRequestRequest self = new ListRecommendContentRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentRequestRequest setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListRecommendContentRequestRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRecommendContentRequestUserInfo extends TeaModel {
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

        public static ListRecommendContentRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentRequestUserInfo self = new ListRecommendContentRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRecommendContentRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRecommendContentRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecommendContentRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRecommendContentRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
