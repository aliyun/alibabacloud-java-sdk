// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
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
     * <p>95FE5953-FF5B-5F80-94AD-FFF97D990FE0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListOrganizationsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

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

    public ListOrganizationsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListOrganizationsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("accessLevel")
        public Integer accessLevel;

        /**
         * <strong>example:</strong>
         * <p>5240</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("namespaceId")
        public String namespaceId;

        @NameInMap("organizationAlias")
        public String organizationAlias;

        /**
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("organizationName")
        public String organizationName;

        /**
         * <strong>example:</strong>
         * <p>ORG_ADMIN</p>
         */
        @NameInMap("organizationRole")
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

        public ListOrganizationsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOrganizationsResponseBodyResult setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListOrganizationsResponseBodyResult setOrganizationAlias(String organizationAlias) {
            this.organizationAlias = organizationAlias;
            return this;
        }
        public String getOrganizationAlias() {
            return this.organizationAlias;
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
