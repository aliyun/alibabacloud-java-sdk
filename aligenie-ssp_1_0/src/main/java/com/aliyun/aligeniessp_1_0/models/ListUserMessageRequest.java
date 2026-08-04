// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListUserMessageRequest extends TeaModel {
    /**
     * <p>After a specific point in time</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-27 14:06:55.984</p>
     */
    @NameInMap("BeforeTime")
    public String beforeTime;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListUserMessageRequestUserInfo userInfo;

    /**
     * <p>Number of records to query</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>Value corresponding to the encoding type. When the encoding type is SKILLID, this value is the application\&quot;s Skill ID. When the encoding type is PACKAGENAME, this value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Maojing, and each method corresponds to a different encoding type: - PACKAGENAME: APK package name, used for Android application client links - SKILLID: Skill ID, used for cloud-based links</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier (userOpenId or userUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of user ID: - OPENID: Default user ID identifier - UNIONID: Organization-level user ID identifier, available only after an organization has been registered on the Maojing skill application Open Platform</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
