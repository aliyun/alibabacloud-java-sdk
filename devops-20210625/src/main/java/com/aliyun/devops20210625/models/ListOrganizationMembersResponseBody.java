// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("members")
    public java.util.List<ListOrganizationMembersResponseBodyMembers> members;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersResponseBody self = new ListOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListOrganizationMembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOrganizationMembersResponseBody setMembers(java.util.List<ListOrganizationMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListOrganizationMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public ListOrganizationMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrganizationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOrganizationMembersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationMembersResponseBodyMembersIdentities extends TeaModel {
        @NameInMap("externUid")
        public String externUid;

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
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("birthday")
        public Long birthday;

        @NameInMap("deptLists")
        public java.util.List<String> deptLists;

        @NameInMap("email")
        public String email;

        @NameInMap("hiredDate")
        public Long hiredDate;

        @NameInMap("identities")
        public ListOrganizationMembersResponseBodyMembersIdentities identities;

        @NameInMap("jobNumber")
        public String jobNumber;

        @NameInMap("joinTime")
        public Long joinTime;

        @NameInMap("lastVisitTime")
        public Long lastVisitTime;

        @NameInMap("mobile")
        public String mobile;

        @NameInMap("organizationMemberName")
        public String organizationMemberName;

        @NameInMap("organizationRoleId")
        public String organizationRoleId;

        @NameInMap("organizationRoleName")
        public String organizationRoleName;

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

        public ListOrganizationMembersResponseBodyMembers setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
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

        public ListOrganizationMembersResponseBodyMembers setOrganizationRoleId(String organizationRoleId) {
            this.organizationRoleId = organizationRoleId;
            return this;
        }
        public String getOrganizationRoleId() {
            return this.organizationRoleId;
        }

        public ListOrganizationMembersResponseBodyMembers setOrganizationRoleName(String organizationRoleName) {
            this.organizationRoleName = organizationRoleName;
            return this;
        }
        public String getOrganizationRoleName() {
            return this.organizationRoleName;
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
