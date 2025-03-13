// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetOrganizationMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error info</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("member")
    public GetOrganizationMemberResponseBodyMember member;

    /**
     * <strong>example:</strong>
     * <p>HC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetOrganizationMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationMemberResponseBody self = new GetOrganizationMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrganizationMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public GetOrganizationMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrganizationMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrganizationMemberResponseBodyMemberIdentities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1236666</p>
         */
        @NameInMap("externUid")
        public String externUid;

        /**
         * <strong>example:</strong>
         * <p>Dingtalk</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>123456677888</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>1631845101798</p>
         */
        @NameInMap("birthday")
        public Long birthday;

        @NameInMap("deptLists")
        public java.util.List<String> deptLists;

        /**
         * <strong>example:</strong>
         * <p>(敏感字段，暂不返回)</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1631845101798</p>
         */
        @NameInMap("hiredDate")
        public Long hiredDate;

        @NameInMap("identities")
        public GetOrganizationMemberResponseBodyMemberIdentities identities;

        /**
         * <strong>example:</strong>
         * <p>373***</p>
         */
        @NameInMap("jobNumber")
        public String jobNumber;

        /**
         * <strong>example:</strong>
         * <p>1631845101798</p>
         */
        @NameInMap("joinTime")
        public Long joinTime;

        /**
         * <strong>example:</strong>
         * <p>1631845101798</p>
         */
        @NameInMap("lastVisitTime")
        public Long lastVisitTime;

        /**
         * <strong>example:</strong>
         * <p>(敏感字段，暂不返回)</p>
         */
        @NameInMap("mobile")
        public String mobile;

        @NameInMap("organizationMemberName")
        public String organizationMemberName;

        /**
         * <strong>example:</strong>
         * <p>8fc0c9ff039711dd64acd000</p>
         */
        @NameInMap("organizationRoleId")
        public String organizationRoleId;

        @NameInMap("organizationRoleName")
        public String organizationRoleName;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
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

        public GetOrganizationMemberResponseBodyMember setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
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

        public GetOrganizationMemberResponseBodyMember setOrganizationRoleId(String organizationRoleId) {
            this.organizationRoleId = organizationRoleId;
            return this;
        }
        public String getOrganizationRoleId() {
            return this.organizationRoleId;
        }

        public GetOrganizationMemberResponseBodyMember setOrganizationRoleName(String organizationRoleName) {
            this.organizationRoleName = organizationRoleName;
            return this;
        }
        public String getOrganizationRoleName() {
            return this.organizationRoleName;
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
