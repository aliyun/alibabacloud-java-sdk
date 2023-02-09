// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Qps")
        public String qps;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        @NameInMap("UtcExpireTime")
        public Long utcExpireTime;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public GetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public GetInstanceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetInstanceResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceResponseBodyData setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public GetInstanceResponseBodyData setUtcExpireTime(Long utcExpireTime) {
            this.utcExpireTime = utcExpireTime;
            return this;
        }
        public Long getUtcExpireTime() {
            return this.utcExpireTime;
        }

    }

}
