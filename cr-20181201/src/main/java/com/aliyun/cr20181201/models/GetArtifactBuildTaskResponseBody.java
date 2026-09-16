// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskResponseBody extends TeaModel {
    /**
     * <p>The artifact build type. Valid values:</p>
     * <ul>
     * <li><p><code>IMAGE_TO_ACCELERATED_IMAGE</code>: Accelerated image creation optimized for ACK scenarios.</p>
     * </li>
     * <li><p><code>IMAGE_TO_ECI_ACCELERATED_IMAGE</code>: Accelerated image artifact optimized for ECI scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_TO_ACCELERATED_IMAGE</p>
     */
    @NameInMap("ArtifactBuildType")
    public String artifactBuildType;

    /**
     * <p>The artifact compression parameters.</p>
     */
    @NameInMap("ArtifactCompression")
    public GetArtifactBuildTaskResponseBodyArtifactCompression artifactCompression;

    /**
     * <p>The ID of the artifact build task.</p>
     * 
     * <strong>example:</strong>
     * <p>i2a-1yu****</p>
     */
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The end time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1685415871</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The reserved field list of the artifact build task. The list elements should be empty.</p>
     */
    @NameInMap("Instructions")
    public java.util.List<String> instructions;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The request ID.</p>
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
     * <p>The start time. The value is a UNIX timestamp in seconds.</p>
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
     * <p>The artifact build status. Valid values:</p>
     * <ul>
     * <li><p><code>PENDING</code>: Scheduling in progress.</p>
     * </li>
     * <li><p><code>BUILDING</code>: Building in progress.</p>
     * </li>
     * <li><p><code>SUCCESS</code>: Build succeeded.</p>
     * </li>
     * <li><p><code>FAILED</code>: Build failed.</p>
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

    public GetArtifactBuildTaskResponseBody setArtifactCompression(GetArtifactBuildTaskResponseBodyArtifactCompression artifactCompression) {
        this.artifactCompression = artifactCompression;
        return this;
    }
    public GetArtifactBuildTaskResponseBodyArtifactCompression getArtifactCompression() {
        return this.artifactCompression;
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

    public GetArtifactBuildTaskResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
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

    public static class GetArtifactBuildTaskResponseBodyArtifactCompression extends TeaModel {
        /**
         * <p>The operating system and architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>linux/arm64</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The number of layers to retain after compression.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SquashKeepLayers")
        public Integer squashKeepLayers;

        /**
         * <p>The digest of the starting layer for compression.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:xxxxx</p>
         */
        @NameInMap("StartLayerDigest")
        public String startLayerDigest;

        public static GetArtifactBuildTaskResponseBodyArtifactCompression build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactBuildTaskResponseBodyArtifactCompression self = new GetArtifactBuildTaskResponseBodyArtifactCompression();
            return TeaModel.build(map, self);
        }

        public GetArtifactBuildTaskResponseBodyArtifactCompression setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetArtifactBuildTaskResponseBodyArtifactCompression setSquashKeepLayers(Integer squashKeepLayers) {
            this.squashKeepLayers = squashKeepLayers;
            return this;
        }
        public Integer getSquashKeepLayers() {
            return this.squashKeepLayers;
        }

        public GetArtifactBuildTaskResponseBodyArtifactCompression setStartLayerDigest(String startLayerDigest) {
            this.startLayerDigest = startLayerDigest;
            return this;
        }
        public String getStartLayerDigest() {
            return this.startLayerDigest;
        }

    }

    public static class GetArtifactBuildTaskResponseBodySourceArtifact extends TeaModel {
        /**
         * <p>The artifact type. Only IMAGE is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The number of artifact layers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LayerCount")
        public Integer layerCount;

        /**
         * <p>The repository ID. Only image repositories are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-shac42yvqzvq****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The artifact size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The artifact version. Only image versions are supported.</p>
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

        public GetArtifactBuildTaskResponseBodySourceArtifact setLayerCount(Integer layerCount) {
            this.layerCount = layerCount;
            return this;
        }
        public Integer getLayerCount() {
            return this.layerCount;
        }

        public GetArtifactBuildTaskResponseBodySourceArtifact setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetArtifactBuildTaskResponseBodySourceArtifact setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
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
         * <p>The artifact type. Only IMAGE is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("ArtifactType")
        public String artifactType;

        /**
         * <p>The number of artifact layers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LayerCount")
        public Integer layerCount;

        /**
         * <p>The repository ID. Only image repositories are supported. The repository ID of the target artifact must be the same as that of the source artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-1234567</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The artifact size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The artifact version. Only images are supported.</p>
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

        public GetArtifactBuildTaskResponseBodyTargetArtifact setLayerCount(Integer layerCount) {
            this.layerCount = layerCount;
            return this;
        }
        public Integer getLayerCount() {
            return this.layerCount;
        }

        public GetArtifactBuildTaskResponseBodyTargetArtifact setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetArtifactBuildTaskResponseBodyTargetArtifact setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
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
