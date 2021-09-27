// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 分页Token
    @NameInMap("nextToken")
    public String nextToken;

    // 总数
    @NameInMap("totalCount")
    public Long totalCount;

    // 成员列表
    @NameInMap("members")
    public java.util.List<ListOrganizationMembersResponseBodyMembers> members;

    public static ListOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersResponseBody self = new ListOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationMembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOrganizationMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOrganizationMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListOrganizationMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrganizationMembersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListOrganizationMembersResponseBody setMembers(java.util.List<ListOrganizationMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListOrganizationMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public static class ListOrganizationMembersResponseBodyMembersIdentities extends TeaModel {
        // 第三方系统的用户Id
        @NameInMap("externUid")
        public String externUid;

        // 第三方系统
        @NameInMap("provider")
        public String provider;

        public static ListOrganizationMembersResponseBodyMembersIdentities build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationMembersResponseBodyMembersIdentities self = new ListOrganizationMembersResponseBodyMembersIdentities();
            return TeaModel.build(map, self);
        }

        public ListOrganizationMembersResponseBodyMembersIdentities setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ListOrganizationMembersResponseBodyMembersIdentities setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

    public static class ListOrganizationMembersResponseBodyMembers extends TeaModel {
        // 阿里云用户ID
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
        public ListOrganizationMembersResponseBodyMembersIdentities identities;

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

        // 企业角色名字
        @NameInMap("organizationRoleName")
        public String organizationRoleName;

        // 企业角色Id
        @NameInMap("organizationRoleId")
        public String organizationRoleId;

        // 用户状态
        @NameInMap("state")
        public String state;

        public static ListOrganizationMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationMembersResponseBodyMembers self = new ListOrganizationMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListOrganizationMembersResponseBodyMembers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListOrganizationMembersResponseBodyMembers setBirthday(Long birthday) {
            this.birthday = birthday;
            return this;
        }
        public Long getBirthday() {
            return this.birthday;
        }

        public ListOrganizationMembersResponseBodyMembers setDeptLists(java.util.List<String> deptLists) {
            this.deptLists = deptLists;
            return this;
        }
        public java.util.List<String> getDeptLists() {
            return this.deptLists;
        }

        public ListOrganizationMembersResponseBodyMembers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListOrganizationMembersResponseBodyMembers setHiredDate(Long hiredDate) {
            this.hiredDate = hiredDate;
            return this;
        }
        public Long getHiredDate() {
            return this.hiredDate;
        }

        public ListOrganizationMembersResponseBodyMembers setIdentities(ListOrganizationMembersResponseBodyMembersIdentities identities) {
            this.identities = identities;
            return this;
        }
        public ListOrganizationMembersResponseBodyMembersIdentities getIdentities() {
            return this.identities;
        }

        public ListOrganizationMembersResponseBodyMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public ListOrganizationMembersResponseBodyMembers setLastVisitTime(Long lastVisitTime) {
            this.lastVisitTime = lastVisitTime;
            return this;
        }
        public Long getLastVisitTime() {
            return this.lastVisitTime;
        }

        public ListOrganizationMembersResponseBodyMembers setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListOrganizationMembersResponseBodyMembers setOrganizationMemberName(String organizationMemberName) {
            this.organizationMemberName = organizationMemberName;
            return this;
        }
        public String getOrganizationMemberName() {
            return this.organizationMemberName;
        }

        public ListOrganizationMembersResponseBodyMembers setOrganizationRoleName(String organizationRoleName) {
            this.organizationRoleName = organizationRoleName;
            return this;
        }
        public String getOrganizationRoleName() {
            return this.organizationRoleName;
        }

        public ListOrganizationMembersResponseBodyMembers setOrganizationRoleId(String organizationRoleId) {
            this.organizationRoleId = organizationRoleId;
            return this;
        }
        public String getOrganizationRoleId() {
            return this.organizationRoleId;
        }

        public ListOrganizationMembersResponseBodyMembers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
