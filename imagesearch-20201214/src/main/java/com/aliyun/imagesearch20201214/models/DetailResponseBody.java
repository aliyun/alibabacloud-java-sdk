// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DetailResponseBody extends TeaModel {
    /**
     * <p>The details about the instance.</p>
     */
    @NameInMap("Instance")
    public DetailResponseBodyInstance instance;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36C43E96-8F68-44AA-B1AF-B1F7AB94A6C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The capacity of the plan. Unit: × 10,000 images.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>imagesearchName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of queries per second supported by the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Qps")
        public Integer qps;

        /**
         * <p>The information about the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The Image Search model.</p>
         * <p>0: commodity search. 1: generic image search.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceType")
        public Integer serviceType;

        /**
         * <p>The number of images.</p>
         * 
         * <strong>example:</strong>
         * <p>10063</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The time when the instance was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620382716000</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the instance expires. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1623081600000</p>
         */
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
