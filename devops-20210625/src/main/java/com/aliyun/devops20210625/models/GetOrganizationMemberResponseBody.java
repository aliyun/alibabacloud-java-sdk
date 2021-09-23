// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetOrganizationMemberResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 成员
    @NameInMap("member")
    public GetOrganizationMemberResponseBodyMember member;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    public static GetOrganizationMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationMemberResponseBody self = new GetOrganizationMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrganizationMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOrganizationMemberResponseBody setMember(GetOrganizationMemberResponseBodyMember member) {
        this.member = member;
        return this;
    }
    public GetOrganizationMemberResponseBodyMember getMember() {
        return this.member;
    }

    public GetOrganizationMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOrganizationMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrganizationMemberResponseBodyMemberIdentities extends TeaModel {
        // 第三方系统的用户 id
        @NameInMap("externUid")
        public String externUid;

        // 第三方系统
        @NameInMap("provider")
        public String provider;

        public static GetOrganizationMemberResponseBodyMemberIdentities build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationMemberResponseBodyMemberIdentities self = new GetOrganizationMemberResponseBodyMemberIdentities();
            return TeaModel.build(map, self);
        }

        public GetOrganizationMemberResponseBodyMemberIdentities setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public GetOrganizationMemberResponseBodyMemberIdentities setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

    public static class GetOrganizationMemberResponseBodyMember extends TeaModel {
        // 阿里云用户PK
        @NameInMap("accountId")
        public String accountId;

        // 生日
        @NameInMap("birthday")
        public Long birthday;

        // 部门名称列表
        @NameInMap("deptLists")
        public java.util.List<String> deptLists;

        // 邮箱
        @NameInMap("email")
        public String email;

        // 入职时间
        @NameInMap("hiredDate")
        public Long hiredDate;

        // 第三方信息
        @NameInMap("identities")
        public GetOrganizationMemberResponseBodyMemberIdentities identities;

        // 加入云效企业时间
        @NameInMap("joinTime")
        public Long joinTime;

        // 最近一次访问时间
        @NameInMap("lastVisitTime")
        public Long lastVisitTime;

        // 手机号
        @NameInMap("mobile")
        public String mobile;

        // 企业成员名
        @NameInMap("organizationMemberName")
        public String organizationMemberName;

        // 企业角色
        @NameInMap("organizationRole")
        public String organizationRole;

        // 用户状态
        @NameInMap("state")
        public String state;

        public static GetOrganizationMemberResponseBodyMember build(java.util.Map<String, ?> map) throws Exception {
            GetOrganizationMemberResponseBodyMember self = new GetOrganizationMemberResponseBodyMember();
            return TeaModel.build(map, self);
        }

        public GetOrganizationMemberResponseBodyMember setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetOrganizationMemberResponseBodyMember setBirthday(Long birthday) {
            this.birthday = birthday;
            return this;
        }
        public Long getBirthday() {
            return this.birthday;
        }

        public GetOrganizationMemberResponseBodyMember setDeptLists(java.util.List<String> deptLists) {
            this.deptLists = deptLists;
            return this;
        }
        public java.util.List<String> getDeptLists() {
            return this.deptLists;
        }

        public GetOrganizationMemberResponseBodyMember setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetOrganizationMemberResponseBodyMember setHiredDate(Long hiredDate) {
            this.hiredDate = hiredDate;
            return this;
        }
        public Long getHiredDate() {
            return this.hiredDate;
        }

        public GetOrganizationMemberResponseBodyMember setIdentities(GetOrganizationMemberResponseBodyMemberIdentities identities) {
            this.identities = identities;
            return this;
        }
        public GetOrganizationMemberResponseBodyMemberIdentities getIdentities() {
            return this.identities;
        }

        public GetOrganizationMemberResponseBodyMember setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public GetOrganizationMemberResponseBodyMember setLastVisitTime(Long lastVisitTime) {
            this.lastVisitTime = lastVisitTime;
            return this;
        }
        public Long getLastVisitTime() {
            return this.lastVisitTime;
        }

        public GetOrganizationMemberResponseBodyMember setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetOrganizationMemberResponseBodyMember setOrganizationMemberName(String organizationMemberName) {
            this.organizationMemberName = organizationMemberName;
            return this;
        }
        public String getOrganizationMemberName() {
            return this.organizationMemberName;
        }

        public GetOrganizationMemberResponseBodyMember setOrganizationRole(String organizationRole) {
            this.organizationRole = organizationRole;
            return this;
        }
        public String getOrganizationRole() {
            return this.organizationRole;
        }

        public GetOrganizationMemberResponseBodyMember setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
