// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setData(ListInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceResponseBodyDataInstances extends TeaModel {
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

        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        @NameInMap("UtcExpireTime")
        public Long utcExpireTime;

        public static ListInstanceResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyDataInstances self = new ListInstanceResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyDataInstances setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public ListInstanceResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyDataInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceResponseBodyDataInstances setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public ListInstanceResponseBodyDataInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListInstanceResponseBodyDataInstances setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListInstanceResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceResponseBodyDataInstances setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public ListInstanceResponseBodyDataInstances setUtcExpireTime(Long utcExpireTime) {
            this.utcExpireTime = utcExpireTime;
            return this;
        }
        public Long getUtcExpireTime() {
            return this.utcExpireTime;
        }

    }

    public static class ListInstanceResponseBodyData extends TeaModel {
        @NameInMap("Instances")
        public java.util.List<ListInstanceResponseBodyDataInstances> instances;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyData self = new ListInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyData setInstances(java.util.List<ListInstanceResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public ListInstanceResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstanceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstanceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
