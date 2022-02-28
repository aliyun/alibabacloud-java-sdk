// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDiskGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DiskGroupId")
    public String diskGroupId;

    @NameInMap("Disks")
    public java.util.List<DescribeDiskGroupResponseBodyDisks> disks;

    @NameInMap("Errno")
    public String errno;

    @NameInMap("FullSyncCurrentSize")
    public Long fullSyncCurrentSize;

    @NameInMap("FullSyncProgress")
    public Integer fullSyncProgress;

    @NameInMap("FullSyncStartTime")
    public Long fullSyncStartTime;

    @NameInMap("FullSyncTotalSize")
    public Long fullSyncTotalSize;

    @NameInMap("IncrementalSyncStartTime")
    public Long incrementalSyncStartTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rpo")
    public Integer rpo;

    @NameInMap("SourceGatewayId")
    public String sourceGatewayId;

    @NameInMap("SourceHostIpAddress")
    public String sourceHostIpAddress;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TargetGatewayId")
    public String targetGatewayId;

    @NameInMap("TargetHostIpAddress")
    public String targetHostIpAddress;

    @NameInMap("TaskExecutionEnv")
    public String taskExecutionEnv;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeDiskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskGroupResponseBody self = new DescribeDiskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDiskGroupResponseBody setDiskGroupId(String diskGroupId) {
        this.diskGroupId = diskGroupId;
        return this;
    }
    public String getDiskGroupId() {
        return this.diskGroupId;
    }

    public DescribeDiskGroupResponseBody setDisks(java.util.List<DescribeDiskGroupResponseBodyDisks> disks) {
        this.disks = disks;
        return this;
    }
    public java.util.List<DescribeDiskGroupResponseBodyDisks> getDisks() {
        return this.disks;
    }

    public DescribeDiskGroupResponseBody setErrno(String errno) {
        this.errno = errno;
        return this;
    }
    public String getErrno() {
        return this.errno;
    }

    public DescribeDiskGroupResponseBody setFullSyncCurrentSize(Long fullSyncCurrentSize) {
        this.fullSyncCurrentSize = fullSyncCurrentSize;
        return this;
    }
    public Long getFullSyncCurrentSize() {
        return this.fullSyncCurrentSize;
    }

    public DescribeDiskGroupResponseBody setFullSyncProgress(Integer fullSyncProgress) {
        this.fullSyncProgress = fullSyncProgress;
        return this;
    }
    public Integer getFullSyncProgress() {
        return this.fullSyncProgress;
    }

    public DescribeDiskGroupResponseBody setFullSyncStartTime(Long fullSyncStartTime) {
        this.fullSyncStartTime = fullSyncStartTime;
        return this;
    }
    public Long getFullSyncStartTime() {
        return this.fullSyncStartTime;
    }

    public DescribeDiskGroupResponseBody setFullSyncTotalSize(Long fullSyncTotalSize) {
        this.fullSyncTotalSize = fullSyncTotalSize;
        return this;
    }
    public Long getFullSyncTotalSize() {
        return this.fullSyncTotalSize;
    }

    public DescribeDiskGroupResponseBody setIncrementalSyncStartTime(Long incrementalSyncStartTime) {
        this.incrementalSyncStartTime = incrementalSyncStartTime;
        return this;
    }
    public Long getIncrementalSyncStartTime() {
        return this.incrementalSyncStartTime;
    }

    public DescribeDiskGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDiskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskGroupResponseBody setRpo(Integer rpo) {
        this.rpo = rpo;
        return this;
    }
    public Integer getRpo() {
        return this.rpo;
    }

    public DescribeDiskGroupResponseBody setSourceGatewayId(String sourceGatewayId) {
        this.sourceGatewayId = sourceGatewayId;
        return this;
    }
    public String getSourceGatewayId() {
        return this.sourceGatewayId;
    }

    public DescribeDiskGroupResponseBody setSourceHostIpAddress(String sourceHostIpAddress) {
        this.sourceHostIpAddress = sourceHostIpAddress;
        return this;
    }
    public String getSourceHostIpAddress() {
        return this.sourceHostIpAddress;
    }

    public DescribeDiskGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDiskGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDiskGroupResponseBody setTargetGatewayId(String targetGatewayId) {
        this.targetGatewayId = targetGatewayId;
        return this;
    }
    public String getTargetGatewayId() {
        return this.targetGatewayId;
    }

    public DescribeDiskGroupResponseBody setTargetHostIpAddress(String targetHostIpAddress) {
        this.targetHostIpAddress = targetHostIpAddress;
        return this;
    }
    public String getTargetHostIpAddress() {
        return this.targetHostIpAddress;
    }

    public DescribeDiskGroupResponseBody setTaskExecutionEnv(String taskExecutionEnv) {
        this.taskExecutionEnv = taskExecutionEnv;
        return this;
    }
    public String getTaskExecutionEnv() {
        return this.taskExecutionEnv;
    }

    public DescribeDiskGroupResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DescribeDiskGroupResponseBodyDisks extends TeaModel {
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SourceDiskSize")
        public Long sourceDiskSize;

        @NameInMap("TargetDiskId")
        public String targetDiskId;

        @NameInMap("TargetDiskSize")
        public Long targetDiskSize;

        public static DescribeDiskGroupResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskGroupResponseBodyDisks self = new DescribeDiskGroupResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDiskGroupResponseBodyDisks setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeDiskGroupResponseBodyDisks setSourceDiskSize(Long sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public Long getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeDiskGroupResponseBodyDisks setTargetDiskId(String targetDiskId) {
            this.targetDiskId = targetDiskId;
            return this;
        }
        public String getTargetDiskId() {
            return this.targetDiskId;
        }

        public DescribeDiskGroupResponseBodyDisks setTargetDiskSize(Long targetDiskSize) {
            this.targetDiskSize = targetDiskSize;
            return this;
        }
        public Long getTargetDiskSize() {
            return this.targetDiskSize;
        }

    }

}
