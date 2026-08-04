// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUnreadMessageCountRequest extends TeaModel {
    /**
     * <p>User Identifier information</p>
     */
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
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILLID, this value is the application\&quot;s Skill ID. When the encoding type is PACKAGENAME, this value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier from Maojing, and each method corresponds to a different encoding type: PACKAGENAME for the APK package name used in the Android application client link, and SKILLID for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier (userOpenId or userUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID: OPENID is the default user ID identity; UNIONID is the organization-dimension user ID identity, which is available only after an organization has been requested on the Maojing Skill Application Open Platform.</p>
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
