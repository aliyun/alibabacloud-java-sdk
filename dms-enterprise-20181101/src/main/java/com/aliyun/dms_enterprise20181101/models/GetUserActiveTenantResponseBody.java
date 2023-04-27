// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserActiveTenantResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The status of the tenant. Valid values:</p>
     * <br>
     * <p>*   **ACTIVE**: The tenant is used to access DMS.</p>
     * <p>*   **IN_ACTIVE**: The tenant is not used.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the tenant.</p>
     */
    @NameInMap("Tenant")
    public GetUserActiveTenantResponseBodyTenant tenant;

    public static GetUserActiveTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserActiveTenantResponseBody self = new GetUserActiveTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserActiveTenantResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserActiveTenantResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserActiveTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserActiveTenantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserActiveTenantResponseBody setTenant(GetUserActiveTenantResponseBodyTenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public GetUserActiveTenantResponseBodyTenant getTenant() {
        return this.tenant;
    }

    public static class GetUserActiveTenantResponseBodyTenant extends TeaModel {
        /**
         * <p>The error code.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The operation that you want to perform. Set the value to **GetUserActiveTenant**.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Tid")
        public Long tid;

        public static GetUserActiveTenantResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            GetUserActiveTenantResponseBodyTenant self = new GetUserActiveTenantResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public GetUserActiveTenantResponseBodyTenant setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserActiveTenantResponseBodyTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public GetUserActiveTenantResponseBodyTenant setTid(Long tid) {
            this.tid = tid;
            return this;
        }
        public Long getTid() {
            return this.tid;
        }

    }

}
