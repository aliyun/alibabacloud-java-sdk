// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("codeBundleId")
    public Long codeBundleId;

    /**
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>3221</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>discovery</p>
     */
    @NameInMap("currentPhase")
    public String currentPhase;

    @NameInMap("engineSnapshot")
    public DescribeScanResponseBodyEngineSnapshot engineSnapshot;

    /**
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>full</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scanMetrics")
    public DescribeScanResponseBodyScanMetrics scanMetrics;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("scanProgress")
    public Long scanProgress;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("securityCredits")
    public Float securityCredits;

    /**
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("credit")
        public Float credit;

        /**
         * <strong>example:</strong>
         * <p>73894</p>
         */
        @NameInMap("fileCount")
        public Long fileCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("linesOfCode")
        public Long linesOfCode;

        /**
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
