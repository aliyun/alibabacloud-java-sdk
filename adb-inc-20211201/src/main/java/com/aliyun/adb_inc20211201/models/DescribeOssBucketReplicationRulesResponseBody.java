// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssBucketReplicationRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeOssBucketReplicationRulesResponseBodyResult result;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeOssBucketReplicationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketReplicationRulesResponseBody self = new DescribeOssBucketReplicationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketReplicationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssBucketReplicationRulesResponseBody setResult(DescribeOssBucketReplicationRulesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeOssBucketReplicationRulesResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeOssBucketReplicationRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeOssBucketReplicationRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssBucketReplicationRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeOssBucketReplicationRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOssBucketReplicationRulesResponseBodyResultRules extends TeaModel {
        @NameInMap("enableHistoricalObjectReplication")
        public Boolean enableHistoricalObjectReplication;

        @NameInMap("objectPrefixList")
        public java.util.List<String> objectPrefixList;

        @NameInMap("replicaKmsKeyID")
        public String replicaKmsKeyID;

        @NameInMap("replicationActionList")
        public java.util.List<String> replicationActionList;

        @NameInMap("replicationRuleID")
        public String replicationRuleID;

        @NameInMap("replicationStatus")
        public String replicationStatus;

        @NameInMap("sseKmsEncryptedObjectsStatus")
        public String sseKmsEncryptedObjectsStatus;

        @NameInMap("syncRole")
        public String syncRole;

        @NameInMap("targetBucketLocation")
        public String targetBucketLocation;

        @NameInMap("targetBucketName")
        public String targetBucketName;

        @NameInMap("targetCloud")
        public String targetCloud;

        @NameInMap("targetCloudLocation")
        public String targetCloudLocation;

        public static DescribeOssBucketReplicationRulesResponseBodyResultRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssBucketReplicationRulesResponseBodyResultRules self = new DescribeOssBucketReplicationRulesResponseBodyResultRules();
            return TeaModel.build(map, self);
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setEnableHistoricalObjectReplication(Boolean enableHistoricalObjectReplication) {
            this.enableHistoricalObjectReplication = enableHistoricalObjectReplication;
            return this;
        }
        public Boolean getEnableHistoricalObjectReplication() {
            return this.enableHistoricalObjectReplication;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setObjectPrefixList(java.util.List<String> objectPrefixList) {
            this.objectPrefixList = objectPrefixList;
            return this;
        }
        public java.util.List<String> getObjectPrefixList() {
            return this.objectPrefixList;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setReplicaKmsKeyID(String replicaKmsKeyID) {
            this.replicaKmsKeyID = replicaKmsKeyID;
            return this;
        }
        public String getReplicaKmsKeyID() {
            return this.replicaKmsKeyID;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setReplicationActionList(java.util.List<String> replicationActionList) {
            this.replicationActionList = replicationActionList;
            return this;
        }
        public java.util.List<String> getReplicationActionList() {
            return this.replicationActionList;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setReplicationRuleID(String replicationRuleID) {
            this.replicationRuleID = replicationRuleID;
            return this;
        }
        public String getReplicationRuleID() {
            return this.replicationRuleID;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setReplicationStatus(String replicationStatus) {
            this.replicationStatus = replicationStatus;
            return this;
        }
        public String getReplicationStatus() {
            return this.replicationStatus;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setSseKmsEncryptedObjectsStatus(String sseKmsEncryptedObjectsStatus) {
            this.sseKmsEncryptedObjectsStatus = sseKmsEncryptedObjectsStatus;
            return this;
        }
        public String getSseKmsEncryptedObjectsStatus() {
            return this.sseKmsEncryptedObjectsStatus;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setSyncRole(String syncRole) {
            this.syncRole = syncRole;
            return this;
        }
        public String getSyncRole() {
            return this.syncRole;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setTargetBucketLocation(String targetBucketLocation) {
            this.targetBucketLocation = targetBucketLocation;
            return this;
        }
        public String getTargetBucketLocation() {
            return this.targetBucketLocation;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setTargetBucketName(String targetBucketName) {
            this.targetBucketName = targetBucketName;
            return this;
        }
        public String getTargetBucketName() {
            return this.targetBucketName;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setTargetCloud(String targetCloud) {
            this.targetCloud = targetCloud;
            return this;
        }
        public String getTargetCloud() {
            return this.targetCloud;
        }

        public DescribeOssBucketReplicationRulesResponseBodyResultRules setTargetCloudLocation(String targetCloudLocation) {
            this.targetCloudLocation = targetCloudLocation;
            return this;
        }
        public String getTargetCloudLocation() {
            return this.targetCloudLocation;
        }

    }

    public static class DescribeOssBucketReplicationRulesResponseBodyResult extends TeaModel {
        @NameInMap("Rules")
        public java.util.List<DescribeOssBucketReplicationRulesResponseBodyResultRules> rules;

        public static DescribeOssBucketReplicationRulesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssBucketReplicationRulesResponseBodyResult self = new DescribeOssBucketReplicationRulesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOssBucketReplicationRulesResponseBodyResult setRules(java.util.List<DescribeOssBucketReplicationRulesResponseBodyResultRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeOssBucketReplicationRulesResponseBodyResultRules> getRules() {
            return this.rules;
        }

    }

}
