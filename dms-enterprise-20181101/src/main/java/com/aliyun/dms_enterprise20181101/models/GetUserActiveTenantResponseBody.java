// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserActiveTenantResponseBody extends TeaModel {
    @NameInMap("Tenant")
    public GetUserActiveTenantResponseBodyTenant tenant;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserActiveTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserActiveTenantResponseBody self = new GetUserActiveTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserActiveTenantResponseBody setTenant(GetUserActiveTenantResponseBodyTenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public GetUserActiveTenantResponseBodyTenant getTenant() {
        return this.tenant;
    }

    public GetUserActiveTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetUserActiveTenantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserActiveTenantResponseBodyTenant extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Tid")
        public Long tid;

        @NameInMap("TenantName")
        public String tenantName;

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

        public GetUserActiveTenantResponseBodyTenant setTid(Long tid) {
            this.tid = tid;
            return this;
        }
        public Long getTid() {
            return this.tid;
        }

        public GetUserActiveTenantResponseBodyTenant setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
