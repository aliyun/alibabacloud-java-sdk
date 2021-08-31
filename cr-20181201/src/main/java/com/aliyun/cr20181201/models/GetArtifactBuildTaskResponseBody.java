// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("ArtifactBuildType")
    public String artifactBuildType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("BuildTaskId")
    public String buildTaskId;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("Instructions")
    public java.util.List<String> instructions;

    @NameInMap("SourceArtifact")
    public GetArtifactBuildTaskResponseBodySourceArtifact sourceArtifact;

    @NameInMap("TargetArtifact")
    public GetArtifactBuildTaskResponseBodyTargetArtifact targetArtifact;

    public static GetArtifactBuildTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildTaskResponseBody self = new GetArtifactBuildTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildTaskResponseBody setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetArtifactBuildTaskResponseBody setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetArtifactBuildTaskResponseBody setArtifactBuildType(String artifactBuildType) {
        this.artifactBuildType = artifactBuildType;
        return this;
    }
    public String getArtifactBuildType() {
        return this.artifactBuildType;
    }

    public GetArtifactBuildTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactBuildTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
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

    public GetArtifactBuildTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetArtifactBuildTaskResponseBody setInstructions(java.util.List<String> instructions) {
        this.instructions = instructions;
        return this;
    }
    public java.util.List<String> getInstructions() {
        return this.instructions;
    }

    public GetArtifactBuildTaskResponseBody setSourceArtifact(GetArtifactBuildTaskResponseBodySourceArtifact sourceArtifact) {
        this.sourceArtifact = sourceArtifact;
        return this;
    }
    public GetArtifactBuildTaskResponseBodySourceArtifact getSourceArtifact() {
        return this.sourceArtifact;
    }

    public GetArtifactBuildTaskResponseBody setTargetArtifact(GetArtifactBuildTaskResponseBodyTargetArtifact targetArtifact) {
        this.targetArtifact = targetArtifact;
        return this;
    }
    public GetArtifactBuildTaskResponseBodyTargetArtifact getTargetArtifact() {
        return this.targetArtifact;
    }

    public static class GetArtifactBuildTaskResponseBodySourceArtifact extends TeaModel {
        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("Version")
        public String version;

        @NameInMap("ArtifactType")
        public String artifactType;

        public static GetArtifactBuildTaskResponseBodySourceArtifact build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactBuildTaskResponseBodySourceArtifact self = new GetArtifactBuildTaskResponseBodySourceArtifact();
            return TeaModel.build(map, self);
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

        public GetArtifactBuildTaskResponseBodySourceArtifact setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

    }

    public static class GetArtifactBuildTaskResponseBodyTargetArtifact extends TeaModel {
        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("Version")
        public String version;

        @NameInMap("ArtifactType")
        public String artifactType;

        public static GetArtifactBuildTaskResponseBodyTargetArtifact build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactBuildTaskResponseBodyTargetArtifact self = new GetArtifactBuildTaskResponseBodyTargetArtifact();
            return TeaModel.build(map, self);
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

        public GetArtifactBuildTaskResponseBodyTargetArtifact setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

    }

}
