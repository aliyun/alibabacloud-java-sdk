// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorApplicationResponseBody extends TeaModel {
    /**
     * <p>The details of the job.</p>
     */
    @NameInMap("Data")
    public Data data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDoctorApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorApplicationResponseBody self = new GetDoctorApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorApplicationResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Analysis extends TeaModel {
        /**
         * <p>The score of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The suggestion for running the job.</p>
         */
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
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Total memory usage over time in seconds</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>memSeconds</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>MB * Sec</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>12312312</p>
         */
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
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Ratio of used memory to total available memory</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>memUtilization</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>0.82</p>
         */
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
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Total vcore usage over time in seconds</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>vcoreSeconds</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>VCores * Sec</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>11123</p>
         */
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
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Ratio of used vcore to total available cores</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>vcoreUtilization</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>32.1</p>
         */
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
        /**
         * <p>The aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running.</p>
         */
        @NameInMap("MemSeconds")
        public MemSeconds memSeconds;

        /**
         * <p>The memory usage.</p>
         */
        @NameInMap("MemUtilization")
        public MemUtilization memUtilization;

        /**
         * <p>The aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running.</p>
         */
        @NameInMap("VcoreSeconds")
        public VcoreSeconds vcoreSeconds;

        /**
         * <p>The CPU utilization. The meaning is the same as that of the %CPU command in the output of the Linux top command.</p>
         */
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
        /**
         * <p>The job analysis result.</p>
         */
        @NameInMap("Analysis")
        public Analysis analysis;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE test...ranks=1 (Stage-1)</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The end time of the job. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1666213200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The job IDs. Multiple job IDs are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>The metric information.</p>
         */
        @NameInMap("Metrics")
        public Metrics metrics;

        /**
         * <p>The SQL statement of the job. This parameter is left empty for non-SQL jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT id, count(1) FROM test group by id;</p>
         */
        @NameInMap("QuerySql")
        public String querySql;

        /**
         * <p>The YARN queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>DW</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>The time when the job was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1677465658275</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The type of the compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>SPARK</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The username that is used to submit the job.</p>
         * 
         * <strong>example:</strong>
         * <p>DW</p>
         */
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
