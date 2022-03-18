// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCodeupOrganizationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetCodeupOrganizationResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetCodeupOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCodeupOrganizationResponseBody self = new GetCodeupOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCodeupOrganizationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCodeupOrganizationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCodeupOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCodeupOrganizationResponseBody setResult(GetCodeupOrganizationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCodeupOrganizationResponseBodyResult getResult() {
        return this.result;
    }

    public GetCodeupOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCodeupOrganizationResponseBodyResult extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NamespaceId")
        public Long namespaceId;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("UserRole")
        public String userRole;

        public static GetCodeupOrganizationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCodeupOrganizationResponseBodyResult self = new GetCodeupOrganizationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCodeupOrganizationResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCodeupOrganizationResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCodeupOrganizationResponseBodyResult setNamespaceId(Long namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        public GetCodeupOrganizationResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetCodeupOrganizationResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetCodeupOrganizationResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetCodeupOrganizationResponseBodyResult setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }
        public String getUserRole() {
            return this.userRole;
        }

    }

}
