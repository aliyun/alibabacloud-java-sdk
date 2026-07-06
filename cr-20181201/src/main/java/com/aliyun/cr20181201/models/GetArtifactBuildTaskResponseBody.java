// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskResponseBody extends TeaModel {
    /**
     * <p>The artifact build type. Valid values:</p>
     * <ul>
     * <li><p><code>IMAGE_TO_ACCELERATED_IMAGE</code>: an accelerated image for ACK.</p>
     * </li>
     * <li><p><code>IMAGE_TO_ECI_ACCELERATED_IMAGE</code>: an accelerated image for ECI.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_TO_ACCELERATED_IMAGE</p>
     */
    @NameInMap("ArtifactBuildType")
    public String artifactBuildType;

    /**
     * <p>The ID of the artifact build task.</p>
     * 
     * <strong>example:</strong>
     * <p>i2a-1yu****</p>
     */
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The Unix timestamp in seconds when the task ended.</p>
     * 
     * <strong>example:</strong>
     * <p>1685415871</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Instructions")
    public java.util.List<String> instructions;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C4C7DD0C-C9D6-437A-A7EE-121EFD70D002</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source artifact.</p>
     */
    @NameInMap("SourceArtifact")
    public GetArtifactBuildTaskResponseBodySourceArtifact sourceArtifact;

    /**
     * <p>The Unix timestamp in seconds when the task started.</p>
     * 
     * <strong>example:</strong>
     * <p>1685437471</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    /**
     * <p>The target artifact.</p>
     */
    @NameInMap("TargetArtifact")
    public GetArtifactBuildTaskResponseBodyTargetArtifact targetArtifact;

    /**
     * <p>The status of the artifact build task. Valid values:</p>
     * <ul>
     * <li><p><code>PENDING</code>: The task is being scheduled.</p>
     * </li>
     * <li><p><code>BUILDING</code>: The task is in progress.</p>
     * </li>
     * <li><p><code>SUCCESS</code>: The task is successful.</p>
     * </li>
     * <li><p><code>FAILED</code>: The task failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUILDING</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static GetArtifactBuildTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildTaskResponseBody self = new GetArtifactBuildTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildTaskResponseBody setArtifactBuildType(String artifactBuildType) {
        this.artifactBuildType = artifactBuildType;
        return this;
    }
    public String getArtifactBuildType() {
        return this.artifactBuildType;
    }

    public GetArtifactBuildTaskResponseBody setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    public GetArtifactBuildTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetArtifactBuildTaskResponseBody setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetArtifactBuildTaskResponseBody setInstructions(java.util.List<String> instructions) {
        this.instructions = instructions;
        return this;
    }
    public java.util.List<String> getInstructions() {
        return this.instructions;
    }

    public GetArtifactBuildTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactBuildTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactBuildTaskResponseBody setSourceArtifact(GetArtifactBuildTaskResponseBodySourceArtifact sourceArtifact) {
        this.sourceArtifact = sourceArtifact;
        return this;
    }
    public GetArtifactBuildTaskResponseBodySourceArtifact getSourceArtifact() {
        return this.sourceArtifact;
    }

    public GetArtifactBuildTaskResponseBody setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetArtifactBuildTaskResponseBody setTargetArtifact(GetArtifactBuildTaskResponseBodyTargetArtifact targetArtifact) {
        this.targetArtifact = targetArtifact;
        return this;
    }
    public GetArtifactBuildTaskResponseBodyTargetArtifact getTargetArtifact() {
        return this.targetArtifact;
    }

    public GetArtifactBuildTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static class GetArtifactBuildTaskResponseBodySourceArtifact extends TeaModel {
        /**
         * <p>The artifact type. Currently, only <code>IMAGE</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The repository ID. Currently, only image repositories are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-shac42yvqzvq****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The artifact version. Currently, only image versions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetArtifactBuildTaskResponseBodySourceArtifact build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactBuildTaskResponseBodySourceArtifact self = new GetArtifactBuildTaskResponseBodySourceArtifact();
            return TeaModel.build(map, self);
        }

        public GetArtifactBuildTaskResponseBodySourceArtifact setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public GetArtifactBuildTaskResponseBodySourceArtifact setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetArtifactBuildTaskResponseBodySourceArtifact setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetArtifactBuildTaskResponseBodyTargetArtifact extends TeaModel {
        /**
         * <p>The artifact type. Currently, only <code>IMAGE</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The repository ID. It must be the same as the repository ID of the source artifact. Only image repositories are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-1234567</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The artifact version. Currently, only image versions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>latest_accelerated</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetArtifactBuildTaskResponseBodyTargetArtifact build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactBuildTaskResponseBodyTargetArtifact self = new GetArtifactBuildTaskResponseBodyTargetArtifact();
            return TeaModel.build(map, self);
        }

        public GetArtifactBuildTaskResponseBodyTargetArtifact setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public GetArtifactBuildTaskResponseBodyTargetArtifact setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetArtifactBuildTaskResponseBodyTargetArtifact setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
