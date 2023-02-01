// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryTimedResetOperateStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTimedResetOperateStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTimedResetOperateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTimedResetOperateStatusResponseBody self = new QueryTimedResetOperateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTimedResetOperateStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTimedResetOperateStatusResponseBody setData(QueryTimedResetOperateStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTimedResetOperateStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryTimedResetOperateStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTimedResetOperateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTimedResetOperateStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTimedResetOperateStatusResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusStr")
        public String statusStr;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryTimedResetOperateStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTimedResetOperateStatusResponseBodyData self = new QueryTimedResetOperateStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTimedResetOperateStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTimedResetOperateStatusResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryTimedResetOperateStatusResponseBodyData setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public QueryTimedResetOperateStatusResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
