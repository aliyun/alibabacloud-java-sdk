// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanResponseBody extends TeaModel {
    /**
     * <p>The code package ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("codeBundleId")
    public Long codeBundleId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The user ID of the task creator.</p>
     * 
     * <strong>example:</strong>
     * <p>3221</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <p>The supported types.</p>
     */
    @NameInMap("engineSnapshot")
    public CreateScanResponseBodyEngineSnapshot engineSnapshot;

    /**
     * <p>The scan end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li>full: full data</li>
     * <li>incremental: incremental</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>full</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The scan information.</p>
     */
    @NameInMap("scanMetrics")
    public CreateScanResponseBodyScanMetrics scanMetrics;

    /**
     * <p>The task progress.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("scanProgress")
    public Long scanProgress;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>running: Running.</li>
     * <li>completed: Completed.</li>
     * <li>failed: Failed.</li>
     * <li>canceling: Being canceled.</li>
     * <li>canceled: Canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("workerId")
    public String workerId;

    public static CreateScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScanResponseBody self = new CreateScanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScanResponseBody setCodeBundleId(Long codeBundleId) {
        this.codeBundleId = codeBundleId;
        return this;
    }
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    public CreateScanResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateScanResponseBody setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public CreateScanResponseBody setEngineSnapshot(CreateScanResponseBodyEngineSnapshot engineSnapshot) {
        this.engineSnapshot = engineSnapshot;
        return this;
    }
    public CreateScanResponseBodyEngineSnapshot getEngineSnapshot() {
        return this.engineSnapshot;
    }

    public CreateScanResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public CreateScanResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateScanResponseBody setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public CreateScanResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScanResponseBody setScanMetrics(CreateScanResponseBodyScanMetrics scanMetrics) {
        this.scanMetrics = scanMetrics;
        return this;
    }
    public CreateScanResponseBodyScanMetrics getScanMetrics() {
        return this.scanMetrics;
    }

    public CreateScanResponseBody setScanProgress(Long scanProgress) {
        this.scanProgress = scanProgress;
        return this;
    }
    public Long getScanProgress() {
        return this.scanProgress;
    }

    public CreateScanResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public CreateScanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateScanResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateScanResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateScanResponseBody setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

    public static class CreateScanResponseBodyEngineSnapshot extends TeaModel {
        /**
         * <p>Indicates whether SAST is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
         * <p>Indicates whether SCA is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sca")
        public Boolean sca;

        public static CreateScanResponseBodyEngineSnapshot build(java.util.Map<String, ?> map) throws Exception {
            CreateScanResponseBodyEngineSnapshot self = new CreateScanResponseBodyEngineSnapshot();
            return TeaModel.build(map, self);
        }

        public CreateScanResponseBodyEngineSnapshot setSast(Boolean sast) {
            this.sast = sast;
            return this;
        }
        public Boolean getSast() {
            return this.sast;
        }

        public CreateScanResponseBodyEngineSnapshot setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

    }

    public static class CreateScanResponseBodyScanMetrics extends TeaModel {
        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fileCount")
        public Long fileCount;

        /**
         * <p>The number of lines of code.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("linesOfCode")
        public Long linesOfCode;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("tokenTotal")
        public Long tokenTotal;

        public static CreateScanResponseBodyScanMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateScanResponseBodyScanMetrics self = new CreateScanResponseBodyScanMetrics();
            return TeaModel.build(map, self);
        }

        public CreateScanResponseBodyScanMetrics setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

        public CreateScanResponseBodyScanMetrics setLinesOfCode(Long linesOfCode) {
            this.linesOfCode = linesOfCode;
            return this;
        }
        public Long getLinesOfCode() {
            return this.linesOfCode;
        }

        public CreateScanResponseBodyScanMetrics setTokenTotal(Long tokenTotal) {
            this.tokenTotal = tokenTotal;
            return this;
        }
        public Long getTokenTotal() {
            return this.tokenTotal;
        }

    }

}
