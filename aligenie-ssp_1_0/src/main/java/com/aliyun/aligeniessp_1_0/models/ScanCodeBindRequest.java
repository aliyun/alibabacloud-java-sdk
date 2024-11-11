// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScanCodeBindRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BindReq")
    public ScanCodeBindRequestBindReq bindReq;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RnY8v0W0ZVn58ZrUAOr2RD</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>authCode</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASdfre</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>129****0946</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
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
