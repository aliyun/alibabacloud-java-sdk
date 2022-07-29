// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListUserMessageRequest extends TeaModel {
    @NameInMap("BeforeTime")
    public String beforeTime;

    @NameInMap("UserInfo")
    public ListUserMessageRequestUserInfo userInfo;

    @NameInMap("limit")
    public Integer limit;

    public static ListUserMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserMessageRequest self = new ListUserMessageRequest();
        return TeaModel.build(map, self);
    }

    public ListUserMessageRequest setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public String getBeforeTime() {
        return this.beforeTime;
    }

    public ListUserMessageRequest setUserInfo(ListUserMessageRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListUserMessageRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public ListUserMessageRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public static class ListUserMessageRequestUserInfo extends TeaModel {
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

        public static ListUserMessageRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserMessageRequestUserInfo self = new ListUserMessageRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListUserMessageRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListUserMessageRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListUserMessageRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserMessageRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListUserMessageRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
