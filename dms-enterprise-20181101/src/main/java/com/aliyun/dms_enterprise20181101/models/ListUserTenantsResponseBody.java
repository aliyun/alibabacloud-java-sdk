// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserTenantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantList")
    public java.util.List<ListUserTenantsResponseBodyTenantList> tenantList;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListUserTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserTenantsResponseBody self = new ListUserTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserTenantsResponseBody setTenantList(java.util.List<ListUserTenantsResponseBodyTenantList> tenantList) {
        this.tenantList = tenantList;
        return this;
    }
    public java.util.List<ListUserTenantsResponseBodyTenantList> getTenantList() {
        return this.tenantList;
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

    public ListUserTenantsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserTenantsResponseBodyTenantList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Tid")
        public Long tid;

        @NameInMap("TenantName")
        public String tenantName;

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

        public ListUserTenantsResponseBodyTenantList setTid(Long tid) {
            this.tid = tid;
            return this;
        }
        public Long getTid() {
            return this.tid;
        }

        public ListUserTenantsResponseBodyTenantList setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
