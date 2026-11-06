// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class VideoAppReportRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     */
    @NameInMap("DeviceInfo")
    public VideoAppReportRequestDeviceInfo deviceInfo;

    /**
     * <p>业务参数</p>
     */
    @NameInMap("Payload")
    public VideoAppReportRequestPayload payload;

    /**
     * <p>用户标识信息</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public VideoAppReportRequestUserInfo userInfo;

    public static VideoAppReportRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoAppReportRequest self = new VideoAppReportRequest();
        return TeaModel.build(map, self);
    }

    public VideoAppReportRequest setDeviceInfo(VideoAppReportRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public VideoAppReportRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public VideoAppReportRequest setPayload(VideoAppReportRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public VideoAppReportRequestPayload getPayload() {
        return this.payload;
    }

    public VideoAppReportRequest setUserInfo(VideoAppReportRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public VideoAppReportRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class VideoAppReportRequestDeviceInfo extends TeaModel {
        /**
         * <p>编码类型对应的值</p>
         * <ul>
         * <li>编码类型是SKILL_ID时，其值为应用的Skill ID。</li>
         * <li>编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID from Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for Android application customer flows.</li>
         * <li>SKILL_ID: Skill ID, used for cloud-based flows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to either deviceOpenId or deviceUnionId.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of the device ID.</p>
         * <ul>
         * <li>OPEN_ID: The default device ID.</li>
         * <li>UNION_ID: Organization-level device ID. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</li>
         * </ul>
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

        public static VideoAppReportRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            VideoAppReportRequestDeviceInfo self = new VideoAppReportRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public VideoAppReportRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public VideoAppReportRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public VideoAppReportRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VideoAppReportRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public VideoAppReportRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class VideoAppReportRequestPayload extends TeaModel {
        /**
         * <p>会员的结束时间。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1652337963097</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>会员是否登录。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isLogin")
        public Boolean isLogin;

        /**
         * <p>该账号是否为会员。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isVip")
        public Boolean isVip;

        /**
         * <p>账号的昵称。</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("loginNick")
        public String loginNick;

        /**
         * <p>明文uuid</p>
         * 
         * <strong>example:</strong>
         * <p>731D5F********DC3B</p>
         */
        @NameInMap("originUuid")
        public String originUuid;

        /**
         * <p>账户的手机号码。</p>
         * 
         * <strong>example:</strong>
         * <p>188*777</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>应用包名。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.***.test</p>
         */
        @NameInMap("pkgName")
        public String pkgName;

        /**
         * <p>会员的开始时间。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1652337963097</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        public static VideoAppReportRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            VideoAppReportRequestPayload self = new VideoAppReportRequestPayload();
            return TeaModel.build(map, self);
        }

        public VideoAppReportRequestPayload setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public VideoAppReportRequestPayload setIsLogin(Boolean isLogin) {
            this.isLogin = isLogin;
            return this;
        }
        public Boolean getIsLogin() {
            return this.isLogin;
        }

        public VideoAppReportRequestPayload setIsVip(Boolean isVip) {
            this.isVip = isVip;
            return this;
        }
        public Boolean getIsVip() {
            return this.isVip;
        }

        public VideoAppReportRequestPayload setLoginNick(String loginNick) {
            this.loginNick = loginNick;
            return this;
        }
        public String getLoginNick() {
            return this.loginNick;
        }

        public VideoAppReportRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

        public VideoAppReportRequestPayload setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public VideoAppReportRequestPayload setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public VideoAppReportRequestPayload setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class VideoAppReportRequestUserInfo extends TeaModel {
        /**
         * <p>编码类型对应的值</p>
         * <ul>
         * <li>编码类型是SKILL_ID时，其值为应用的Skill ID。</li>
         * <li>编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>编码类型，获取天猫精灵的用户标识的途径有多种，不同途径对应不同的编码类型。</p>
         * <ul>
         * <li>PACKAGE_NAME：apk包名，Android应用客户链路的编码类型。</li>
         * <li>SKILL_ID：技能ID，云端链路的编码类型。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>用户标识，设置为userOpenId或userUnionId。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>用户Id的类型  </p>
         * <ul>
         * <li>OPEN_ID：默认的用户ID标识。</li>
         * <li>UNION_ID: 组织维度的用户ID标识，在天猫精灵技能应用开放平台申请过组织后才会有该值。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>组织ID，如果IdType为UNION_ID时必填。</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static VideoAppReportRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            VideoAppReportRequestUserInfo self = new VideoAppReportRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public VideoAppReportRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public VideoAppReportRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public VideoAppReportRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VideoAppReportRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public VideoAppReportRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
