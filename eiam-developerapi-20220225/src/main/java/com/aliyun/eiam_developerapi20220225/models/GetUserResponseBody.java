// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("accountExpireTime")
    public Long accountExpireTime;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("email")
    public String email;

    @NameInMap("emailVerified")
    public Boolean emailVerified;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("lockExpireTime")
    public Long lockExpireTime;

    @NameInMap("organizationalUnits")
    public java.util.List<GetUserResponseBodyOrganizationalUnits> organizationalUnits;

    @NameInMap("phoneNumber")
    public String phoneNumber;

    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    @NameInMap("phoneRegion")
    public String phoneRegion;

    @NameInMap("primaryOrganizationalUnitId")
    public String primaryOrganizationalUnitId;

    @NameInMap("registerTime")
    public Long registerTime;

    @NameInMap("status")
    public String status;

    @NameInMap("updateTime")
    public Long updateTime;

    @NameInMap("userExternalId")
    public String userExternalId;

    @NameInMap("userId")
    public String userId;

    @NameInMap("userSourceId")
    public String userSourceId;

    @NameInMap("userSourceType")
    public String userSourceType;

    @NameInMap("username")
    public String username;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setAccountExpireTime(Long accountExpireTime) {
        this.accountExpireTime = accountExpireTime;
        return this;
    }
    public Long getAccountExpireTime() {
        return this.accountExpireTime;
    }

    public GetUserResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetUserResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetUserResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetUserResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetUserResponseBody setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public GetUserResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserResponseBody setLockExpireTime(Long lockExpireTime) {
        this.lockExpireTime = lockExpireTime;
        return this;
    }
    public Long getLockExpireTime() {
        return this.lockExpireTime;
    }

    public GetUserResponseBody setOrganizationalUnits(java.util.List<GetUserResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<GetUserResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public GetUserResponseBody setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetUserResponseBody setPhoneNumberVerified(Boolean phoneNumberVerified) {
        this.phoneNumberVerified = phoneNumberVerified;
        return this;
    }
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    public GetUserResponseBody setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public GetUserResponseBody setPrimaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
        this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
        return this;
    }
    public String getPrimaryOrganizationalUnitId() {
        return this.primaryOrganizationalUnitId;
    }

    public GetUserResponseBody setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

    public GetUserResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUserResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public GetUserResponseBody setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public GetUserResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserResponseBody setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
        return this;
    }
    public String getUserSourceId() {
        return this.userSourceId;
    }

    public GetUserResponseBody setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType;
        return this;
    }
    public String getUserSourceType() {
        return this.userSourceType;
    }

    public GetUserResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class GetUserResponseBodyOrganizationalUnits extends TeaModel {
        @NameInMap("organizationalUnitId")
        public String organizationalUnitId;

        @NameInMap("organizationalUnitName")
        public String organizationalUnitName;

        @NameInMap("primary")
        public Boolean primary;

        public static GetUserResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyOrganizationalUnits self = new GetUserResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public GetUserResponseBodyOrganizationalUnits setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public GetUserResponseBodyOrganizationalUnits setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

    }

}
