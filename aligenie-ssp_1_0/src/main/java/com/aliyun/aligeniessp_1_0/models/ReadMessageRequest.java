// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ReadMessageRequest extends TeaModel {
    /**
     * <p>Message ID</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("MessageId")
    public Long messageId;

    /**
     * <p>User information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ReadMessageRequestUserInfo userInfo;

    public static ReadMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageRequest self = new ReadMessageRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public ReadMessageRequest setUserInfo(ReadMessageRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ReadMessageRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ReadMessageRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILLID, this value is the Skill ID of the application. When the encoding type is PACKAGENAME, this value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the User Identifier in Maojing, and each method corresponds to a different encoding type: PACKAGENAME for the APK package name used in Android client application links, and SKILLID for the skill ID used in cloud-based links.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123L</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID: OPENID is the default User ID identity. UNIONID is the organization-dimension User ID identity, which is available only after an organization has been registered on the Maojing Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ReadMessageRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageRequestUserInfo self = new ReadMessageRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ReadMessageRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ReadMessageRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ReadMessageRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReadMessageRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ReadMessageRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
