// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SetWorkspaceQuotaResponseBody extends TeaModel {
    /**
     * <p>Details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>NOT_FOUND</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SetWorkspaceQuotaResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>A human-readable message about the request\&quot;s outcome.</p>
     * 
     * <strong>example:</strong>
     * <p>This record is being collected, please wait for a moment.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetWorkspaceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetWorkspaceQuotaResponseBody self = new SetWorkspaceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public SetWorkspaceQuotaResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SetWorkspaceQuotaResponseBody setData(SetWorkspaceQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetWorkspaceQuotaResponseBodyData getData() {
        return this.data;
    }

    public SetWorkspaceQuotaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SetWorkspaceQuotaResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SetWorkspaceQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetWorkspaceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetWorkspaceQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetWorkspaceQuotaResponseBodyData extends TeaModel {
        /**
         * <p>The compute unit (CU) quota.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CuQuota")
        public Long cuQuota;

        /**
         * <p>The amount of compute unit (CU) quota used.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CuQuotaUsage")
        public Long cuQuotaUsage;

        /**
         * <p>The ID of the billing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zehld3y1tphzctyyq7o</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>263013787210103</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The status of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>Catched</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static SetWorkspaceQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetWorkspaceQuotaResponseBodyData self = new SetWorkspaceQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetWorkspaceQuotaResponseBodyData setCuQuota(Long cuQuota) {
            this.cuQuota = cuQuota;
            return this;
        }
        public Long getCuQuota() {
            return this.cuQuota;
        }

        public SetWorkspaceQuotaResponseBodyData setCuQuotaUsage(Long cuQuotaUsage) {
            this.cuQuotaUsage = cuQuotaUsage;
            return this;
        }
        public Long getCuQuotaUsage() {
            return this.cuQuotaUsage;
        }

        public SetWorkspaceQuotaResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SetWorkspaceQuotaResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public SetWorkspaceQuotaResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SetWorkspaceQuotaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SetWorkspaceQuotaResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
