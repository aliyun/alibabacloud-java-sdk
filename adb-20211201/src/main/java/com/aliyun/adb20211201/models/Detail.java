// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class Detail extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BATCH</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>amv-bp11q28kv****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;name&quot;: &quot;SparkPi&quot;,     &quot;file&quot;: &quot;local:///tmp/spark-examples.jar&quot;,     &quot;className&quot;: &quot;org.apache.spark.examples.SparkPi&quot;,     &quot;args&quot;: [         &quot;1000000&quot;     ],     &quot;conf&quot;: {         &quot;spark.driver.resourceSpec&quot;: &quot;small&quot;,         &quot;spark.executor.instances&quot;: 1,         &quot;spark.executor.resourceSpec&quot;: &quot;small&quot;     } }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DurationInMillis")
    public Long durationInMillis;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EstimateExecutionCpuTimeInSeconds")
    public Long estimateExecutionCpuTimeInSeconds;

    /**
     * <strong>example:</strong>
     * <p>s202204291426hzpre60cfa*****-0003</p>
     */
    @NameInMap("LastAttemptId")
    public String lastAttemptId;

    /**
     * <strong>example:</strong>
     * <p>1651213645200</p>
     */
    @NameInMap("LastUpdatedTimeInMillis")
    public Long lastUpdatedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p>oss://<bucket-name>/logs/driver</p>
     */
    @NameInMap("LogRootPath")
    public String logRootPath;

    /**
     * <strong>example:</strong>
     * <p>spark-rg</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <strong>example:</strong>
     * <p>1651213645010</p>
     */
    @NameInMap("StartedTimeInMillis")
    public Long startedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p>1651213645000</p>
     */
    @NameInMap("SubmittedTimeInMillis")
    public Long submittedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p>1651213645300</p>
     */
    @NameInMap("TerminatedTimeInMillis")
    public Long terminatedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p><a href="https://sparkui.aliyuncs.com/token=xxx">https://sparkui.aliyuncs.com/token=xxx</a></p>
     */
    @NameInMap("WebUiAddress")
    public String webUiAddress;

    public static Detail build(java.util.Map<String, ?> map) throws Exception {
        Detail self = new Detail();
        return TeaModel.build(map, self);
    }

    public Detail setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public Detail setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public Detail setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Detail setDurationInMillis(Long durationInMillis) {
        this.durationInMillis = durationInMillis;
        return this;
    }
    public Long getDurationInMillis() {
        return this.durationInMillis;
    }

    public Detail setEstimateExecutionCpuTimeInSeconds(Long estimateExecutionCpuTimeInSeconds) {
        this.estimateExecutionCpuTimeInSeconds = estimateExecutionCpuTimeInSeconds;
        return this;
    }
    public Long getEstimateExecutionCpuTimeInSeconds() {
        return this.estimateExecutionCpuTimeInSeconds;
    }

    public Detail setLastAttemptId(String lastAttemptId) {
        this.lastAttemptId = lastAttemptId;
        return this;
    }
    public String getLastAttemptId() {
        return this.lastAttemptId;
    }

    public Detail setLastUpdatedTimeInMillis(Long lastUpdatedTimeInMillis) {
        this.lastUpdatedTimeInMillis = lastUpdatedTimeInMillis;
        return this;
    }
    public Long getLastUpdatedTimeInMillis() {
        return this.lastUpdatedTimeInMillis;
    }

    public Detail setLogRootPath(String logRootPath) {
        this.logRootPath = logRootPath;
        return this;
    }
    public String getLogRootPath() {
        return this.logRootPath;
    }

    public Detail setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public Detail setStartedTimeInMillis(Long startedTimeInMillis) {
        this.startedTimeInMillis = startedTimeInMillis;
        return this;
    }
    public Long getStartedTimeInMillis() {
        return this.startedTimeInMillis;
    }

    public Detail setSubmittedTimeInMillis(Long submittedTimeInMillis) {
        this.submittedTimeInMillis = submittedTimeInMillis;
        return this;
    }
    public Long getSubmittedTimeInMillis() {
        return this.submittedTimeInMillis;
    }

    public Detail setTerminatedTimeInMillis(Long terminatedTimeInMillis) {
        this.terminatedTimeInMillis = terminatedTimeInMillis;
        return this;
    }
    public Long getTerminatedTimeInMillis() {
        return this.terminatedTimeInMillis;
    }

    public Detail setWebUiAddress(String webUiAddress) {
        this.webUiAddress = webUiAddress;
        return this;
    }
    public String getWebUiAddress() {
        return this.webUiAddress;
    }

}
