// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSubAccountInfoResponseBody extends TeaModel {
    @NameInMap("Authorization")
    public GetSubAccountInfoResponseBodyAuthorization authorization;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetSubAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubAccountInfoResponseBody self = new GetSubAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubAccountInfoResponseBody setAuthorization(GetSubAccountInfoResponseBodyAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
    public GetSubAccountInfoResponseBodyAuthorization getAuthorization() {
        return this.authorization;
    }

    public GetSubAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubAccountInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetSubAccountInfoResponseBodyAuthorization extends TeaModel {
        @NameInMap("RoleIdData")
        public String roleIdData;

        @NameInMap("RamOperation")
        public Boolean ramOperation;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("EdasId")
        public String edasId;

        @NameInMap("IsRamDel")
        public Boolean isRamDel;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("AdminEdasId")
        public String adminEdasId;

        @NameInMap("ResGroupId")
        public Long resGroupId;

        @NameInMap("IsRamSlave")
        public Boolean isRamSlave;

        @NameInMap("AdminUserId")
        public String adminUserId;

        @NameInMap("SubUserKp")
        public String subUserKp;

        @NameInMap("AppIdData")
        public String appIdData;

        @NameInMap("ResGroupIdData")
        public String resGroupIdData;

        @NameInMap("Sts")
        public Boolean sts;

        @NameInMap("DelegateAdmin")
        public Boolean delegateAdmin;

        public static GetSubAccountInfoResponseBodyAuthorization build(java.util.Map<String, ?> map) throws Exception {
            GetSubAccountInfoResponseBodyAuthorization self = new GetSubAccountInfoResponseBodyAuthorization();
            return TeaModel.build(map, self);
        }

        public GetSubAccountInfoResponseBodyAuthorization setRoleIdData(String roleIdData) {
            this.roleIdData = roleIdData;
            return this;
        }
        public String getRoleIdData() {
            return this.roleIdData;
        }

        public GetSubAccountInfoResponseBodyAuthorization setRamOperation(Boolean ramOperation) {
            this.ramOperation = ramOperation;
            return this;
        }
        public Boolean getRamOperation() {
            return this.ramOperation;
        }

        public GetSubAccountInfoResponseBodyAuthorization setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetSubAccountInfoResponseBodyAuthorization setEdasId(String edasId) {
            this.edasId = edasId;
            return this;
        }
        public String getEdasId() {
            return this.edasId;
        }

        public GetSubAccountInfoResponseBodyAuthorization setIsRamDel(Boolean isRamDel) {
            this.isRamDel = isRamDel;
            return this;
        }
        public Boolean getIsRamDel() {
            return this.isRamDel;
        }

        public GetSubAccountInfoResponseBodyAuthorization setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetSubAccountInfoResponseBodyAuthorization setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSubAccountInfoResponseBodyAuthorization setAdminEdasId(String adminEdasId) {
            this.adminEdasId = adminEdasId;
            return this;
        }
        public String getAdminEdasId() {
            return this.adminEdasId;
        }

        public GetSubAccountInfoResponseBodyAuthorization setResGroupId(Long resGroupId) {
            this.resGroupId = resGroupId;
            return this;
        }
        public Long getResGroupId() {
            return this.resGroupId;
        }

        public GetSubAccountInfoResponseBodyAuthorization setIsRamSlave(Boolean isRamSlave) {
            this.isRamSlave = isRamSlave;
            return this;
        }
        public Boolean getIsRamSlave() {
            return this.isRamSlave;
        }

        public GetSubAccountInfoResponseBodyAuthorization setAdminUserId(String adminUserId) {
            this.adminUserId = adminUserId;
            return this;
        }
        public String getAdminUserId() {
            return this.adminUserId;
        }

        public GetSubAccountInfoResponseBodyAuthorization setSubUserKp(String subUserKp) {
            this.subUserKp = subUserKp;
            return this;
        }
        public String getSubUserKp() {
            return this.subUserKp;
        }

        public GetSubAccountInfoResponseBodyAuthorization setAppIdData(String appIdData) {
            this.appIdData = appIdData;
            return this;
        }
        public String getAppIdData() {
            return this.appIdData;
        }

        public GetSubAccountInfoResponseBodyAuthorization setResGroupIdData(String resGroupIdData) {
            this.resGroupIdData = resGroupIdData;
            return this;
        }
        public String getResGroupIdData() {
            return this.resGroupIdData;
        }

        public GetSubAccountInfoResponseBodyAuthorization setSts(Boolean sts) {
            this.sts = sts;
            return this;
        }
        public Boolean getSts() {
            return this.sts;
        }

        public GetSubAccountInfoResponseBodyAuthorization setDelegateAdmin(Boolean delegateAdmin) {
            this.delegateAdmin = delegateAdmin;
            return this;
        }
        public Boolean getDelegateAdmin() {
            return this.delegateAdmin;
        }

    }

}
