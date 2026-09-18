// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResponseBody extends TeaModel {
    /**
     * <p>The function code package ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("codeBundleId")
    public Long codeBundleId;

    /**
     * <p>The time when the task was created.</p>
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
     * <p>The scan phase. Valid values:</p>
     * <ul>
     * <li>threat_model: threat modeling.</li>
     * <li>discovery: vulnerability discovery.</li>
     * <li>panel: vulnerability review.</li>
     * <li>adversarial: adversarial verification.</li>
     * <li>finalize: report compilation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>discovery</p>
     */
    @NameInMap("currentPhase")
    public String currentPhase;

    /**
     * <p>The supported engine types.</p>
     */
    @NameInMap("engineSnapshot")
    public DescribeScanResponseBodyEngineSnapshot engineSnapshot;

    /**
     * <p>The time when the scan finished.</p>
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
     * <p>The scan type. Valid values:</p>
     * <ul>
     * <li>full: full</li>
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
     * <p>1111</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The scan results.</p>
     */
    @NameInMap("scanMetrics")
    public DescribeScanResponseBodyScanMetrics scanMetrics;

    /**
     * <p>The task progress.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("scanProgress")
    public Long scanProgress;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("securityCredits")
    public Float securityCredits;

    /**
     * <p>The time when the task started.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>running: Running.</li>
     * <li>completed: Completed.</li>
     * <li>failed: Failed.</li>
     * <li>canceling: Being canceled.</li>
     * <li>canceled: Canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
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
     * <p>The time when the task was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("workerId")
    public String workerId;

    public static DescribeScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanResponseBody self = new DescribeScanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanResponseBody setCodeBundleId(Long codeBundleId) {
        this.codeBundleId = codeBundleId;
        return this;
    }
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    public DescribeScanResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DescribeScanResponseBody setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public DescribeScanResponseBody setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
        return this;
    }
    public String getCurrentPhase() {
        return this.currentPhase;
    }

    public DescribeScanResponseBody setEngineSnapshot(DescribeScanResponseBodyEngineSnapshot engineSnapshot) {
        this.engineSnapshot = engineSnapshot;
        return this;
    }
    public DescribeScanResponseBodyEngineSnapshot getEngineSnapshot() {
        return this.engineSnapshot;
    }

    public DescribeScanResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public DescribeScanResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeScanResponseBody setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public DescribeScanResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DescribeScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanResponseBody setScanMetrics(DescribeScanResponseBodyScanMetrics scanMetrics) {
        this.scanMetrics = scanMetrics;
        return this;
    }
    public DescribeScanResponseBodyScanMetrics getScanMetrics() {
        return this.scanMetrics;
    }

    public DescribeScanResponseBody setScanProgress(Long scanProgress) {
        this.scanProgress = scanProgress;
        return this;
    }
    public Long getScanProgress() {
        return this.scanProgress;
    }

    public DescribeScanResponseBody setSecurityCredits(Float securityCredits) {
        this.securityCredits = securityCredits;
        return this;
    }
    public Float getSecurityCredits() {
        return this.securityCredits;
    }

    public DescribeScanResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public DescribeScanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeScanResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeScanResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DescribeScanResponseBody setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
    public String getWorkerId() {
        return this.workerId;
    }

    public static class DescribeScanResponseBodyEngineSnapshot extends TeaModel {
        /**
         * <p>Indicates whether Static Application Security Testing (SAST) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
         * <p>Indicates whether Software Composition Analysis (SCA) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sca")
        public Boolean sca;

        public static DescribeScanResponseBodyEngineSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResponseBodyEngineSnapshot self = new DescribeScanResponseBodyEngineSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeScanResponseBodyEngineSnapshot setSast(Boolean sast) {
            this.sast = sast;
            return this;
        }
        public Boolean getSast() {
            return this.sast;
        }

        public DescribeScanResponseBodyEngineSnapshot setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

    }

    public static class DescribeScanResponseBodyScanMetrics extends TeaModel {
        /**
         * <p>The number of credits consumed by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("credit")
        public Float credit;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>73894</p>
         */
        @NameInMap("fileCount")
        public Long fileCount;

        /**
         * <p>The number of lines of code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("linesOfCode")
        public Long linesOfCode;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tokenTotal")
        public Long tokenTotal;

        public static DescribeScanResponseBodyScanMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeScanResponseBodyScanMetrics self = new DescribeScanResponseBodyScanMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeScanResponseBodyScanMetrics setCredit(Float credit) {
            this.credit = credit;
            return this;
        }
        public Float getCredit() {
            return this.credit;
        }

        public DescribeScanResponseBodyScanMetrics setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

        public DescribeScanResponseBodyScanMetrics setLinesOfCode(Long linesOfCode) {
            this.linesOfCode = linesOfCode;
            return this;
        }
        public Long getLinesOfCode() {
            return this.linesOfCode;
        }

        public DescribeScanResponseBodyScanMetrics setTokenTotal(Long tokenTotal) {
            this.tokenTotal = tokenTotal;
            return this;
        }
        public Long getTokenTotal() {
            return this.tokenTotal;
        }

    }

}
