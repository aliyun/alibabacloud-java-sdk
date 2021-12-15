// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DetailResponseBody extends TeaModel {
    @NameInMap("Instance")
    public DetailResponseBodyInstance instance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailResponseBody self = new DetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailResponseBody setInstance(DetailResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public DetailResponseBodyInstance getInstance() {
        return this.instance;
    }

    public DetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DetailResponseBodyInstance extends TeaModel {
        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("Name")
        public String name;

        @NameInMap("Qps")
        public Integer qps;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceType")
        public Integer serviceType;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcExpireTime")
        public String utcExpireTime;

        public static DetailResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DetailResponseBodyInstance self = new DetailResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DetailResponseBodyInstance setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DetailResponseBodyInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DetailResponseBodyInstance setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DetailResponseBodyInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DetailResponseBodyInstance setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public DetailResponseBodyInstance setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DetailResponseBodyInstance setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public DetailResponseBodyInstance setUtcExpireTime(String utcExpireTime) {
            this.utcExpireTime = utcExpireTime;
            return this;
        }
        public String getUtcExpireTime() {
            return this.utcExpireTime;
        }

    }

}
