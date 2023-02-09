// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ResetInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ResetInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ResetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetInstanceResponseBody self = new ResetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetInstanceResponseBody setData(ResetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetInstanceResponseBodyData getData() {
        return this.data;
    }

    public ResetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetInstanceResponseBodyData extends TeaModel {
        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        @NameInMap("UtcExpireTime")
        public Long utcExpireTime;

        public static ResetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetInstanceResponseBodyData self = new ResetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetInstanceResponseBodyData setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public ResetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ResetInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ResetInstanceResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ResetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResetInstanceResponseBodyData setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public ResetInstanceResponseBodyData setUtcExpireTime(Long utcExpireTime) {
            this.utcExpireTime = utcExpireTime;
            return this;
        }
        public Long getUtcExpireTime() {
            return this.utcExpireTime;
        }

    }

}
