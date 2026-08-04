// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAuthCodeBindForExtRequest extends TeaModel {
    /**
     * <p>The authCode obtained by specifying a user ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aexfgc</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The value corresponding to the encoding type. Enter the Project ID of the project containing the ProductKey of this product in the Tmall Genie AI platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EncodeKey")
    public String encodeKey;

    /**
     * <p>Encoding type. Enter PROJECT_ID here.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_ID</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <p>List of user identifier information.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>Value corresponding to the encoding type. Enter the Project ID of the product\&quot;s project here. You can view it in the Tmall Genie AI platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Enter PROJECT_ID here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier. Enter the value of userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of User ID:<br>OPEN_ID: The default User ID identity.<br>UNION_ID: The User ID identity at the organization dimension, which requires prior request for an organization on the Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1***2</p>
         */
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
