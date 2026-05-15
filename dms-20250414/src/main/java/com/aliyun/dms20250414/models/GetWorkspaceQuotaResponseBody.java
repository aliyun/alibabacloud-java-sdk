// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NOT_FOUND</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public GetWorkspaceQuotaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkspaceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceQuotaResponseBody self = new GetWorkspaceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceQuotaResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetWorkspaceQuotaResponseBody setData(GetWorkspaceQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceQuotaResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceQuotaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkspaceQuotaResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkspaceQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspaceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkspaceQuotaResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CuQuota")
        public Long cuQuota;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CuQuotaUsage")
        public Long cuQuotaUsage;

        /**
         * <strong>example:</strong>
         * <p>i-bp16pha0zu99yybi59qr</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotebookFreeQuotaAvailable")
        public Long notebookFreeQuotaAvailable;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotebookFreeQuotaTotal")
        public Long notebookFreeQuotaTotal;

        /**
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetWorkspaceQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceQuotaResponseBodyData self = new GetWorkspaceQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceQuotaResponseBodyData setCuQuota(Long cuQuota) {
            this.cuQuota = cuQuota;
            return this;
        }
        public Long getCuQuota() {
            return this.cuQuota;
        }

        public GetWorkspaceQuotaResponseBodyData setCuQuotaUsage(Long cuQuotaUsage) {
            this.cuQuotaUsage = cuQuotaUsage;
            return this;
        }
        public Long getCuQuotaUsage() {
            return this.cuQuotaUsage;
        }

        public GetWorkspaceQuotaResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkspaceQuotaResponseBodyData setNotebookFreeQuotaAvailable(Long notebookFreeQuotaAvailable) {
            this.notebookFreeQuotaAvailable = notebookFreeQuotaAvailable;
            return this;
        }
        public Long getNotebookFreeQuotaAvailable() {
            return this.notebookFreeQuotaAvailable;
        }

        public GetWorkspaceQuotaResponseBodyData setNotebookFreeQuotaTotal(Long notebookFreeQuotaTotal) {
            this.notebookFreeQuotaTotal = notebookFreeQuotaTotal;
            return this;
        }
        public Long getNotebookFreeQuotaTotal() {
            return this.notebookFreeQuotaTotal;
        }

        public GetWorkspaceQuotaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkspaceQuotaResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
