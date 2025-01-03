// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCodeupOrganizationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidTagGroup.IdNotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetCodeupOrganizationResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
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
        /**
         * <strong>example:</strong>
         * <p>2022-03-12 12:00:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>3624</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>100003</p>
         */
        @NameInMap("namespaceId")
        public Long namespaceId;

        /**
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>ORG_MEMBER</p>
         */
        @NameInMap("userRole")
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
