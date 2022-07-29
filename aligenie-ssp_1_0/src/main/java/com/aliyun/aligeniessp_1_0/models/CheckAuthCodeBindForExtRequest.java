// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAuthCodeBindForExtRequest extends TeaModel {
    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("EncodeKey")
    public String encodeKey;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("UserInfo")
    public CheckAuthCodeBindForExtRequestUserInfo userInfo;

    public static CheckAuthCodeBindForExtRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthCodeBindForExtRequest self = new CheckAuthCodeBindForExtRequest();
        return TeaModel.build(map, self);
    }

    public CheckAuthCodeBindForExtRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CheckAuthCodeBindForExtRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public CheckAuthCodeBindForExtRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public CheckAuthCodeBindForExtRequest setUserInfo(CheckAuthCodeBindForExtRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CheckAuthCodeBindForExtRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CheckAuthCodeBindForExtRequestUserInfo extends TeaModel {
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

        public static CheckAuthCodeBindForExtRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckAuthCodeBindForExtRequestUserInfo self = new CheckAuthCodeBindForExtRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CheckAuthCodeBindForExtRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public CheckAuthCodeBindForExtRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public CheckAuthCodeBindForExtRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CheckAuthCodeBindForExtRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public CheckAuthCodeBindForExtRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
