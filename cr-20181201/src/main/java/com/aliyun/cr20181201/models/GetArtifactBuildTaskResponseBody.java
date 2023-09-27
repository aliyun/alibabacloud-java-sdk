// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskResponseBody extends TeaModel {
    /**
     * <p>The type of the artifact building task. Valid values:</p>
     * <br>
     * <p>*   `IMAGE_TO_ACCELERATED_IMAGE`: builds accelerated images for Container Service for Kubernetes (ACK) clusters.</p>
     * <p>*   `IMAGE_TO_ECI_ACCELERATED_IMAGE`: builds accelerated images for elastic container instances.</p>
     */
    @NameInMap("ArtifactBuildType")
    public String artifactBuildType;

    /**
     * <p>The ID of the artifact building task.</p>
     */
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the artifact building task ends.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Instructions")
    public java.util.List<String> instructions;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the source artifact.</p>
     */
    @NameInMap("SourceArtifact")
    public GetArtifactBuildTaskResponseBodySourceArtifact sourceArtifact;

    /**
     * <p>The time when the artifact building task starts.</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    /**
     * <p>The artifact that is built in the task.</p>
     */
    @NameInMap("TargetArtifact")
    public GetArtifactBuildTaskResponseBodyTargetArtifact targetArtifact;

    /**
     * <p>The status of the artifact that is built in the task. Valid values:</p>
     * <br>
     * <p>*   `PENDING`: The artifact is being scheduled.</p>
     * <p>*   `BUILDING`: The artifact is being built.</p>
     * <p>*   `SUCCESS`: The artifact is built.</p>
     * <p>*   `FAILED`: The artifact fails to be built.</p>
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
         * <p>The type of the artifact that is built in the task. The value can only be IMAGE.</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The ID of the repository to which the source artifact belongs. The repository can only be an image repository.</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The version of the artifact. The artifact can only be an image.</p>
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
         * <p>The type of the artifact that is built in the task. The value can only be IMAGE.</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The ID of the repository to which the artifact that is built in the task belongs. The repository can only be an image repository. The value is the same as the ID of the repository to which the source artifact belongs.</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The version of the artifact that is built in the task. The artifact can only be an image.</p>
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
