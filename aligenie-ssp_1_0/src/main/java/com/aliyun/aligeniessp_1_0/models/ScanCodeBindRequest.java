// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScanCodeBindRequest extends TeaModel {
    @NameInMap("BindReq")
    public ScanCodeBindRequestBindReq bindReq;

    @NameInMap("UserInfo")
    public ScanCodeBindRequestUserInfo userInfo;

    public static ScanCodeBindRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanCodeBindRequest self = new ScanCodeBindRequest();
        return TeaModel.build(map, self);
    }

    public ScanCodeBindRequest setBindReq(ScanCodeBindRequestBindReq bindReq) {
        this.bindReq = bindReq;
        return this;
    }
    public ScanCodeBindRequestBindReq getBindReq() {
        return this.bindReq;
    }

    public ScanCodeBindRequest setUserInfo(ScanCodeBindRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ScanCodeBindRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ScanCodeBindRequestBindReq extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>authCode</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtInfo")
        public String extInfo;

        public static ScanCodeBindRequestBindReq build(java.util.Map<String, ?> map) throws Exception {
            ScanCodeBindRequestBindReq self = new ScanCodeBindRequestBindReq();
            return TeaModel.build(map, self);
        }

        public ScanCodeBindRequestBindReq setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ScanCodeBindRequestBindReq setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ScanCodeBindRequestBindReq setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

    public static class ScanCodeBindRequestUserInfo extends TeaModel {
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

        public static ScanCodeBindRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ScanCodeBindRequestUserInfo self = new ScanCodeBindRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ScanCodeBindRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ScanCodeBindRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ScanCodeBindRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ScanCodeBindRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ScanCodeBindRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
