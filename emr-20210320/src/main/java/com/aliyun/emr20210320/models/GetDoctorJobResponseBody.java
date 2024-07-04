// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorJobResponseBody extends TeaModel {
    /**
     * <p>The information about the job.</p>
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

    public static GetDoctorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorJobResponseBody self = new GetDoctorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorJobResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class Metrics extends TeaModel {
        /**
         * <p>The amount of memory consumed.</p>
         */
        @NameInMap("MemSeconds")
        public MemSeconds memSeconds;

        /**
         * <p>The CPU usage.</p>
         */
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
        /**
         * <p>The ID of the job that was submitted to YARN.</p>
         * 
         * <strong>example:</strong>
         * <p>application_1542620905989_****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE test...ranks=1 (Stage-1)</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The total running time of the job. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>278</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <p>The final state of the job. Valid values:</p>
         * <ul>
         * <li>SUCCEEDED</li>
         * <li>FAILED</li>
         * <li>KILLED</li>
         * <li>ENDED</li>
         * <li>UNDEFINED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KILLED</p>
         */
        @NameInMap("FinalStatus")
        public String finalStatus;

        /**
         * <p>The time when the job ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1658388322000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The time when the job was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665014400000</p>
         */
        @NameInMap("LaunchTime")
        public Long launchTime;

        /**
         * <p>The data about metrics.</p>
         */
        @NameInMap("Metrics")
        public Metrics metrics;

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
         * <p>1673946000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The running state of the job. Valid values:</p>
         * <ul>
         * <li>FINISHED</li>
         * <li>FAILED</li>
         * <li>KILLED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The type of the compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>SPARK</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The username that was used to submit the job.</p>
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
