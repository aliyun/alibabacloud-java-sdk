// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CloseTimedResetOperateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloseTimedResetOperateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CloseTimedResetOperateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseTimedResetOperateResponseBody self = new CloseTimedResetOperateResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseTimedResetOperateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloseTimedResetOperateResponseBody setData(CloseTimedResetOperateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloseTimedResetOperateResponseBodyData getData() {
        return this.data;
    }

    public CloseTimedResetOperateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloseTimedResetOperateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseTimedResetOperateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CloseTimedResetOperateResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TenantId")
        public Long tenantId;

        public static CloseTimedResetOperateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloseTimedResetOperateResponseBodyData self = new CloseTimedResetOperateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloseTimedResetOperateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CloseTimedResetOperateResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
