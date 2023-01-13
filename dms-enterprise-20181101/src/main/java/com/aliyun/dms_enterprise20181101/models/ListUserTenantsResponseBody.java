// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserTenantsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the tenants that were returned.</p>
     */
    @NameInMap("TenantList")
    public java.util.List<ListUserTenantsResponseBodyTenantList> tenantList;

    public static ListUserTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserTenantsResponseBody self = new ListUserTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserTenantsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserTenantsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserTenantsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserTenantsResponseBody setTenantList(java.util.List<ListUserTenantsResponseBodyTenantList> tenantList) {
        this.tenantList = tenantList;
        return this;
    }
    public java.util.List<ListUserTenantsResponseBodyTenantList> getTenantList() {
        return this.tenantList;
    }

    public static class ListUserTenantsResponseBodyTenantList extends TeaModel {
        /**
         * <p>The status of the tenant. Valid values:</p>
         * <br>
         * <p>*   **ACTIVE**: The tenant is used to access DMS.</p>
         * <p>*   **IN_ACTIVE**: The tenant is not used.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the tenant.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("Tid")
        public Long tid;

        public static ListUserTenantsResponseBodyTenantList build(java.util.Map<String, ?> map) throws Exception {
            ListUserTenantsResponseBodyTenantList self = new ListUserTenantsResponseBodyTenantList();
            return TeaModel.build(map, self);
        }

        public ListUserTenantsResponseBodyTenantList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserTenantsResponseBodyTenantList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ListUserTenantsResponseBodyTenantList setTid(Long tid) {
            this.tid = tid;
            return this;
        }
        public Long getTid() {
            return this.tid;
        }

    }

}
