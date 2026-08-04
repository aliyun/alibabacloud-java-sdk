// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingListRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetCurrentPlayingListRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenQueryPlayListRequest")
    public GetCurrentPlayingListRequestOpenQueryPlayListRequest openQueryPlayListRequest;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetCurrentPlayingListRequestUserInfo userInfo;

    public static GetCurrentPlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingListRequest self = new GetCurrentPlayingListRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingListRequest setDeviceInfo(GetCurrentPlayingListRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetCurrentPlayingListRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetCurrentPlayingListRequest setOpenQueryPlayListRequest(GetCurrentPlayingListRequestOpenQueryPlayListRequest openQueryPlayListRequest) {
        this.openQueryPlayListRequest = openQueryPlayListRequest;
        return this;
    }
    public GetCurrentPlayingListRequestOpenQueryPlayListRequest getOpenQueryPlayListRequest() {
        return this.openQueryPlayListRequest;
    }

    public GetCurrentPlayingListRequest setUserInfo(GetCurrentPlayingListRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetCurrentPlayingListRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetCurrentPlayingListRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link. <code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID.</p>
         * <p><code>OPEN_ID</code>: The default Device ID identity. <code>UNION_ID</code>: The organization-dimension Device ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetCurrentPlayingListRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListRequestDeviceInfo self = new GetCurrentPlayingListRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCurrentPlayingListRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCurrentPlayingListRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCurrentPlayingListRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCurrentPlayingListRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetCurrentPlayingListRequestOpenQueryPlayListRequest extends TeaModel {
        /**
         * <p>Page number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Number of items per page</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static GetCurrentPlayingListRequestOpenQueryPlayListRequest build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListRequestOpenQueryPlayListRequest self = new GetCurrentPlayingListRequestOpenQueryPlayListRequest();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListRequestOpenQueryPlayListRequest setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetCurrentPlayingListRequestOpenQueryPlayListRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class GetCurrentPlayingListRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the Skill ID of the application. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the Tmall Genie User Identifier, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link. <code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier, set to either userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of User ID.</p>
         * <p><code>OPEN_ID</code>: The default User ID identity. <code>UNION_ID</code>: The organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is <code>UNION_ID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetCurrentPlayingListRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListRequestUserInfo self = new GetCurrentPlayingListRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCurrentPlayingListRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCurrentPlayingListRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCurrentPlayingListRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCurrentPlayingListRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
