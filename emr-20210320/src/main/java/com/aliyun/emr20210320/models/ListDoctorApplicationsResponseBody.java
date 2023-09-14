// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorApplicationsResponseBody extends TeaModel {
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

    public static ListDoctorApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorApplicationsResponseBody self = new ListDoctorApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorApplicationsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Analysis extends TeaModel {
        @NameInMap("Score")
        public Integer score;

        @NameInMap("Suggestion")
        public String suggestion;

        public static Analysis build(java.util.Map<String, ?> map) throws Exception {
            Analysis self = new Analysis();
            return TeaModel.build(map, self);
        }

        public Analysis setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public Analysis setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
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

    public static class MemUtilization extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Float value;

        public static MemUtilization build(java.util.Map<String, ?> map) throws Exception {
            MemUtilization self = new MemUtilization();
            return TeaModel.build(map, self);
        }

        public MemUtilization setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MemUtilization setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MemUtilization setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public MemUtilization setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
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

    public static class VcoreUtilization extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Float value;

        public static VcoreUtilization build(java.util.Map<String, ?> map) throws Exception {
            VcoreUtilization self = new VcoreUtilization();
            return TeaModel.build(map, self);
        }

        public VcoreUtilization setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VcoreUtilization setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VcoreUtilization setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public VcoreUtilization setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class Metrics extends TeaModel {
        @NameInMap("MemSeconds")
        public MemSeconds memSeconds;

        @NameInMap("MemUtilization")
        public MemUtilization memUtilization;

        @NameInMap("VcoreSeconds")
        public VcoreSeconds vcoreSeconds;

        @NameInMap("VcoreUtilization")
        public VcoreUtilization vcoreUtilization;

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

        public Metrics setMemUtilization(MemUtilization memUtilization) {
            this.memUtilization = memUtilization;
            return this;
        }
        public MemUtilization getMemUtilization() {
            return this.memUtilization;
        }

        public Metrics setVcoreSeconds(VcoreSeconds vcoreSeconds) {
            this.vcoreSeconds = vcoreSeconds;
            return this;
        }
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public Metrics setVcoreUtilization(VcoreUtilization vcoreUtilization) {
            this.vcoreUtilization = vcoreUtilization;
            return this;
        }
        public VcoreUtilization getVcoreUtilization() {
            return this.vcoreUtilization;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("Analysis")
        public Analysis analysis;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Ids")
        public java.util.List<String> ids;

        @NameInMap("Metrics")
        public Metrics metrics;

        @NameInMap("QuerySql")
        public String querySql;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public String user;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAnalysis(Analysis analysis) {
            this.analysis = analysis;
            return this;
        }
        public Analysis getAnalysis() {
            return this.analysis;
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

        public Data setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Data setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public Data setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public Metrics getMetrics() {
            return this.metrics;
        }

        public Data setQuerySql(String querySql) {
            this.querySql = querySql;
            return this;
        }
        public String getQuerySql() {
            return this.querySql;
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
