// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsResponseBody extends TeaModel {
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

    public static ListDoctorJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorJobsResponseBody self = new ListDoctorJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorJobsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public static class Metrics extends TeaModel {
        @NameInMap("MemSeconds")
        public MemSeconds memSeconds;

        @NameInMap("VcoreSeconds")
        public VcoreSeconds vcoreSeconds;

        public static Metrics build(java.util.Map<String, ?> map) throws Exception {
            Metrics self = new Metrics();
            return TeaModel.build(map, self);
        }

        public Metrics setMemSeconds(MemSeconds memSeconds) {
            this.memSeconds = memSeconds;
            return this;
        }
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        public Metrics setVcoreSeconds(VcoreSeconds vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        @NameInMap("FinalStatus")
        public String finalStatus;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("LaunchTime")
        public Long launchTime;

        @NameInMap("Metrics")
        public Metrics metrics;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public Data setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public Data setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public Data setFinalStatus(String finalStatus) {
            this.finalStatus = finalStatus;
            return this;
        }
        public String getFinalStatus() {
            return this.finalStatus;
        }

        public Data setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public Data setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

        public Data setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public Data setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public Data setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

    }

}
