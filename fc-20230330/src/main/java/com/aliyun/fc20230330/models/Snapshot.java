// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Snapshot extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10737418240</p>
     */
    @NameInMap("artifactDiskTotalSizeInB")
    public Long artifactDiskTotalSizeInB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2147483648</p>
     */
    @NameInMap("artifactDiskUsedSizeInB")
    public Long artifactDiskUsedSizeInB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>268435456</p>
     */
    @NameInMap("artifactMemCacheSizeInB")
    public Long artifactMemCacheSizeInB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3221225472</p>
     */
    @NameInMap("artifactMemTotalSizeInB")
    public Long artifactMemTotalSizeInB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("artifactMemUsedSizeInB")
    public Long artifactMemUsedSizeInB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-30T10:00:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Snapshot for production environment</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSizeMB")
    public Long diskSizeMB;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-29T10:00:00Z</p>
     */
    @NameInMap("expiredTime")
    public String expiredTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-function</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:0123456789abcdef</p>
     */
    @NameInMap("imageDigest")
    public String imageDigest;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/example/function</p>
     */
    @NameInMap("imageRepository")
    public String imageRepository;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3072</p>
     */
    @NameInMap("memoryMB")
    public Long memoryMB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("osType")
    public String osType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/code/ready.sh</p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resolvedVersion")
    public String resolvedVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("snapshotId")
    public String snapshotId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-test-session-id</p>
     */
    @NameInMap("sourceSessionId")
    public String sourceSessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/code/start.sh</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("status")
    public String status;

    public static Snapshot build(java.util.Map<String, ?> map) throws Exception {
        Snapshot self = new Snapshot();
        return TeaModel.build(map, self);
    }

    public Snapshot setArtifactDiskTotalSizeInB(Long artifactDiskTotalSizeInB) {
        this.artifactDiskTotalSizeInB = artifactDiskTotalSizeInB;
        return this;
    }
    public Long getArtifactDiskTotalSizeInB() {
        return this.artifactDiskTotalSizeInB;
    }

    public Snapshot setArtifactDiskUsedSizeInB(Long artifactDiskUsedSizeInB) {
        this.artifactDiskUsedSizeInB = artifactDiskUsedSizeInB;
        return this;
    }
    public Long getArtifactDiskUsedSizeInB() {
        return this.artifactDiskUsedSizeInB;
    }

    public Snapshot setArtifactMemCacheSizeInB(Long artifactMemCacheSizeInB) {
        this.artifactMemCacheSizeInB = artifactMemCacheSizeInB;
        return this;
    }
    public Long getArtifactMemCacheSizeInB() {
        return this.artifactMemCacheSizeInB;
    }

    public Snapshot setArtifactMemTotalSizeInB(Long artifactMemTotalSizeInB) {
        this.artifactMemTotalSizeInB = artifactMemTotalSizeInB;
        return this;
    }
    public Long getArtifactMemTotalSizeInB() {
        return this.artifactMemTotalSizeInB;
    }

    public Snapshot setArtifactMemUsedSizeInB(Long artifactMemUsedSizeInB) {
        this.artifactMemUsedSizeInB = artifactMemUsedSizeInB;
        return this;
    }
    public Long getArtifactMemUsedSizeInB() {
        return this.artifactMemUsedSizeInB;
    }

    public Snapshot setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public Snapshot setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Snapshot setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Snapshot setDiskSizeMB(Long diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }
    public Long getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public Snapshot setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public Snapshot setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public Snapshot setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public Snapshot setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public Snapshot setImageRepository(String imageRepository) {
        this.imageRepository = imageRepository;
        return this;
    }
    public String getImageRepository() {
        return this.imageRepository;
    }

    public Snapshot setMemoryMB(Long memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Long getMemoryMB() {
        return this.memoryMB;
    }

    public Snapshot setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public Snapshot setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public Snapshot setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public Snapshot setResolvedVersion(String resolvedVersion) {
        this.resolvedVersion = resolvedVersion;
        return this;
    }
    public String getResolvedVersion() {
        return this.resolvedVersion;
    }

    public Snapshot setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public Snapshot setSourceSessionId(String sourceSessionId) {
        this.sourceSessionId = sourceSessionId;
        return this;
    }
    public String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public Snapshot setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

    public Snapshot setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
