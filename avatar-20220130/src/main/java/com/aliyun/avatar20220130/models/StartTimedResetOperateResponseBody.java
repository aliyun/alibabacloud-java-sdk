// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartTimedResetOperateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartTimedResetOperateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StartTimedResetOperateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTimedResetOperateResponseBody self = new StartTimedResetOperateResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTimedResetOperateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartTimedResetOperateResponseBody setData(StartTimedResetOperateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartTimedResetOperateResponseBodyData getData() {
        return this.data;
    }

    public StartTimedResetOperateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartTimedResetOperateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTimedResetOperateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartTimedResetOperateResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TenantId")
        public Long tenantId;

        public static StartTimedResetOperateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartTimedResetOperateResponseBodyData self = new StartTimedResetOperateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartTimedResetOperateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartTimedResetOperateResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
