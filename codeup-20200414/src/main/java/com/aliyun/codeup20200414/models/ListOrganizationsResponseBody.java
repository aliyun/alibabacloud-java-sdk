// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListOrganizationsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListOrganizationsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static ListOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationsResponseBody self = new ListOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListOrganizationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationsResponseBody setResult(java.util.List<ListOrganizationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOrganizationsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOrganizationsResponseBodyResult extends TeaModel {
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("OrganizationRole")
        public String organizationRole;

        public static ListOrganizationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationsResponseBodyResult self = new ListOrganizationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOrganizationsResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public ListOrganizationsResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListOrganizationsResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public ListOrganizationsResponseBodyResult setOrganizationRole(String organizationRole) {
            this.organizationRole = organizationRole;
            return this;
        }
        public String getOrganizationRole() {
            return this.organizationRole;
        }

    }

}
