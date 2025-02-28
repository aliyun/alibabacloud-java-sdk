// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssBucketReplicationProgressResponseBody extends TeaModel {
    @NameInMap("Progress")
    public DescribeOssBucketReplicationProgressResponseBodyProgress progress;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeOssBucketReplicationProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketReplicationProgressResponseBody self = new DescribeOssBucketReplicationProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketReplicationProgressResponseBody setProgress(DescribeOssBucketReplicationProgressResponseBodyProgress progress) {
        this.progress = progress;
        return this;
    }
    public DescribeOssBucketReplicationProgressResponseBodyProgress getProgress() {
        return this.progress;
    }

    public DescribeOssBucketReplicationProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssBucketReplicationProgressResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeOssBucketReplicationProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssBucketReplicationProgressResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeOssBucketReplicationProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOssBucketReplicationProgressResponseBodyProgress extends TeaModel {
        @NameInMap("enableHistoricalObjectReplication")
        public Boolean enableHistoricalObjectReplication;

        @NameInMap("historicalObjectProgress")
        public Float historicalObjectProgress;

        @NameInMap("newObjectProgress")
        public Long newObjectProgress;

        @NameInMap("replicationRuleId")
        public String replicationRuleId;

        @NameInMap("replicationStatus")
        public String replicationStatus;

        @NameInMap("targetBucketLocation")
        public String targetBucketLocation;

        @NameInMap("targetBucketName")
        public String targetBucketName;

        @NameInMap("targetCloud")
        public String targetCloud;

        @NameInMap("targetCloudLocation")
        public String targetCloudLocation;

        public static DescribeOssBucketReplicationProgressResponseBodyProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssBucketReplicationProgressResponseBodyProgress self = new DescribeOssBucketReplicationProgressResponseBodyProgress();
            return TeaModel.build(map, self);
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setEnableHistoricalObjectReplication(Boolean enableHistoricalObjectReplication) {
            this.enableHistoricalObjectReplication = enableHistoricalObjectReplication;
            return this;
        }
        public Boolean getEnableHistoricalObjectReplication() {
            return this.enableHistoricalObjectReplication;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setHistoricalObjectProgress(Float historicalObjectProgress) {
            this.historicalObjectProgress = historicalObjectProgress;
            return this;
        }
        public Float getHistoricalObjectProgress() {
            return this.historicalObjectProgress;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setNewObjectProgress(Long newObjectProgress) {
            this.newObjectProgress = newObjectProgress;
            return this;
        }
        public Long getNewObjectProgress() {
            return this.newObjectProgress;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setReplicationRuleId(String replicationRuleId) {
            this.replicationRuleId = replicationRuleId;
            return this;
        }
        public String getReplicationRuleId() {
            return this.replicationRuleId;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setReplicationStatus(String replicationStatus) {
            this.replicationStatus = replicationStatus;
            return this;
        }
        public String getReplicationStatus() {
            return this.replicationStatus;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setTargetBucketLocation(String targetBucketLocation) {
            this.targetBucketLocation = targetBucketLocation;
            return this;
        }
        public String getTargetBucketLocation() {
            return this.targetBucketLocation;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setTargetBucketName(String targetBucketName) {
            this.targetBucketName = targetBucketName;
            return this;
        }
        public String getTargetBucketName() {
            return this.targetBucketName;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setTargetCloud(String targetCloud) {
            this.targetCloud = targetCloud;
            return this;
        }
        public String getTargetCloud() {
            return this.targetCloud;
        }

        public DescribeOssBucketReplicationProgressResponseBodyProgress setTargetCloudLocation(String targetCloudLocation) {
            this.targetCloudLocation = targetCloudLocation;
            return this;
        }
        public String getTargetCloudLocation() {
            return this.targetCloudLocation;
        }

    }

}
