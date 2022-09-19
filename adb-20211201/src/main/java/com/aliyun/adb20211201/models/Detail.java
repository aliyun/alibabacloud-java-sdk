// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class Detail extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Data")
    public String data;

    @NameInMap("DurationInMillis")
    public Long durationInMillis;

    @NameInMap("EstimateExecutionCpuTimeInSeconds")
    public Long estimateExecutionCpuTimeInSeconds;

    @NameInMap("LastAttemptId")
    public String lastAttemptId;

    @NameInMap("LastUpdatedTimeInMillis")
    public Long lastUpdatedTimeInMillis;

    @NameInMap("LogRootPath")
    public String logRootPath;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("StartedTimeInMillis")
    public Long startedTimeInMillis;

    @NameInMap("SubmittedTimeInMillis")
    public Long submittedTimeInMillis;

    @NameInMap("TerminatedTimeInMillis")
    public Long terminatedTimeInMillis;

    @NameInMap("WebUiAddress")
    public String webUiAddress;

    public static Detail build(java.util.Map<String, ?> map) throws Exception {
        Detail self = new Detail();
        return TeaModel.build(map, self);
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
