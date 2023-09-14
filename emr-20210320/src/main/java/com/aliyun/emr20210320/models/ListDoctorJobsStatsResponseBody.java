// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsStatsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorJobsStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorJobsStatsResponseBody self = new ListDoctorJobsStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorJobsStatsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorJobsStatsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorJobsStatsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorJobsStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorJobsStatsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class AppsCount extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static AppsCount build(java.util.Map<String, ?> map) throws Exception {
            AppsCount self = new AppsCount();
            return TeaModel.build(map, self);
        }

        public AppsCount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AppsCount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppsCount setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public AppsCount setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class MemSeconds extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static MemSeconds build(java.util.Map<String, ?> map) throws Exception {
            MemSeconds self = new MemSeconds();
            return TeaModel.build(map, self);
        }

        public MemSeconds setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MemSeconds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MemSeconds setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MemSeconds setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class VcoreSeconds extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Long value;

        public static VcoreSeconds build(java.util.Map<String, ?> map) throws Exception {
            VcoreSeconds self = new VcoreSeconds();
            return TeaModel.build(map, self);
        }

        public VcoreSeconds setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VcoreSeconds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VcoreSeconds setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public VcoreSeconds setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("AppsCount")
        public AppsCount appsCount;

        @NameInMap("MemSeconds")
        public MemSeconds memSeconds;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        @NameInMap("VcoreSeconds")
        public VcoreSeconds vcoreSeconds;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAppsCount(AppsCount appsCount) {
            this.appsCount = appsCount;
            return this;
        }
        public AppsCount getAppsCount() {
            return this.appsCount;
        }

        public Data setMemSeconds(MemSeconds memSeconds) {
            this.memSeconds = memSeconds;
            return this;
        }
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        public Data setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public Data setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public Data setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public Data setVcoreSeconds(VcoreSeconds vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

    }

}
