// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUnreadMessageCountRequest extends TeaModel {
    @NameInMap("UserInfo")
    public GetUnreadMessageCountRequestUserInfo userInfo;

    public static GetUnreadMessageCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnreadMessageCountRequest self = new GetUnreadMessageCountRequest();
        return TeaModel.build(map, self);
    }

    public GetUnreadMessageCountRequest setUserInfo(GetUnreadMessageCountRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetUnreadMessageCountRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetUnreadMessageCountRequestUserInfo extends TeaModel {
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

        public static GetUnreadMessageCountRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUnreadMessageCountRequestUserInfo self = new GetUnreadMessageCountRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetUnreadMessageCountRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetUnreadMessageCountRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetUnreadMessageCountRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUnreadMessageCountRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetUnreadMessageCountRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
