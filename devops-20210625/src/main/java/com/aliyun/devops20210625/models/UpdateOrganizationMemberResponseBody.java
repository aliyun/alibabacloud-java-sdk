// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateOrganizationMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("member")
    public UpdateOrganizationMemberResponseBodyMember member;

    /**
     * <strong>example:</strong>
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateOrganizationMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationMemberResponseBody self = new UpdateOrganizationMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateOrganizationMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateOrganizationMemberResponseBody setMember(UpdateOrganizationMemberResponseBodyMember member) {
        this.member = member;
        return this;
    }
    public UpdateOrganizationMemberResponseBodyMember getMember() {
        return this.member;
    }

    public UpdateOrganizationMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateOrganizationMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateOrganizationMemberResponseBodyMember extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>292035769476261xxx</p>
         */
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("organizationMemberName")
        public String organizationMemberName;

        public static UpdateOrganizationMemberResponseBodyMember build(java.util.Map<String, ?> map) throws Exception {
            UpdateOrganizationMemberResponseBodyMember self = new UpdateOrganizationMemberResponseBodyMember();
            return TeaModel.build(map, self);
        }

        public UpdateOrganizationMemberResponseBodyMember setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateOrganizationMemberResponseBodyMember setOrganizationMemberName(String organizationMemberName) {
            this.organizationMemberName = organizationMemberName;
            return this;
        }
        public String getOrganizationMemberName() {
            return this.organizationMemberName;
        }

    }

}
