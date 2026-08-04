// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    /**
     * <p>Message URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xx">http://xx</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public SendMessageRequestUserInfo userInfo;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SendMessageRequest setUserInfo(SendMessageRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public SendMessageRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class SendMessageRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILLID, this value is the application\&quot;s Skill ID. When the encoding type is PACKAGENAME, this value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123L</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the User Identifier for Maojing, and each method corresponds to a different encoding type: - PACKAGENAME: APK package name, used for Android application customer links - SKILLID: Skill ID, used for cloud-based links</p>
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
         * <p>Type of User ID: - OPENID: default User ID identity - UNIONID: organization-dimension User ID identity, available only after an organization has been requested on the Maojing Skill Application Open Platform</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID; required when IdType is UNION_ID</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static SendMessageRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestUserInfo self = new SendMessageRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SendMessageRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SendMessageRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendMessageRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SendMessageRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
