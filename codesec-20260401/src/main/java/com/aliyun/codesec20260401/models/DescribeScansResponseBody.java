// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScansResponseBody extends TeaModel {
    /**
     * <p>The task list.</p>
     */
    @NameInMap("items")
    public java.util.List<DescribeScansResponseBodyItems> items;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. An empty value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static DescribeScansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScansResponseBody self = new DescribeScansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScansResponseBody setItems(java.util.List<DescribeScansResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeScansResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeScansResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeScansResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScansResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScansResponseBodyItemsEngineSnapshot extends TeaModel {
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

        public static DescribeScansResponseBodyItemsEngineSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeScansResponseBodyItemsEngineSnapshot self = new DescribeScansResponseBodyItemsEngineSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeScansResponseBodyItemsEngineSnapshot setSast(Boolean sast) {
            this.sast = sast;
            return this;
        }
        public Boolean getSast() {
            return this.sast;
        }

        public DescribeScansResponseBodyItemsEngineSnapshot setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

    }

    public static class DescribeScansResponseBodyItemsScanMetrics extends TeaModel {
        /**
         * <p>The number of credits consumed by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1.25</p>
         */
        @NameInMap("credit")
        public Float credit;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>459</p>
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
         * <p>1</p>
         */
        @NameInMap("tokenTotal")
        public Long tokenTotal;

        public static DescribeScansResponseBodyItemsScanMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeScansResponseBodyItemsScanMetrics self = new DescribeScansResponseBodyItemsScanMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeScansResponseBodyItemsScanMetrics setCredit(Float credit) {
            this.credit = credit;
            return this;
        }
        public Float getCredit() {
            return this.credit;
        }

        public DescribeScansResponseBodyItemsScanMetrics setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

        public DescribeScansResponseBodyItemsScanMetrics setLinesOfCode(Long linesOfCode) {
            this.linesOfCode = linesOfCode;
            return this;
        }
        public Long getLinesOfCode() {
            return this.linesOfCode;
        }

        public DescribeScansResponseBodyItemsScanMetrics setTokenTotal(Long tokenTotal) {
            this.tokenTotal = tokenTotal;
            return this;
        }
        public Long getTokenTotal() {
            return this.tokenTotal;
        }

    }

    public static class DescribeScansResponseBodyItems extends TeaModel {
        /**
         * <p>The code bundle ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("codeBundleId")
        public Long codeBundleId;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The user ID of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The scan phase. Valid values:</p>
         * <ul>
         * <li>threat_model: Threat modeling.</li>
         * <li>discovery: Vulnerability discovery.</li>
         * <li>panel: Vulnerability review.</li>
         * <li>adversarial: Adversarial verification.</li>
         * <li>finalize: Report generation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finalize</p>
         */
        @NameInMap("currentPhase")
        public String currentPhase;

        /**
         * <p>The supported scan types.</p>
         */
        @NameInMap("engineSnapshot")
        public DescribeScansResponseBodyItemsEngineSnapshot engineSnapshot;

        /**
         * <p>The time when the scan finished.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>934</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The scan type. Valid values:</p>
         * <ul>
         * <li>full: Full scan.</li>
         * <li>incremental: Incremental scan.</li>
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
         * <p>p-n72k9yrkq81ny7z</p>
         */
        @NameInMap("projectId")
        public Long projectId;

        /**
         * <p>The scan result statistics information.</p>
         */
        @NameInMap("scanMetrics")
        public DescribeScansResponseBodyItemsScanMetrics scanMetrics;

        /**
         * <p>The task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("scanProgress")
        public Long scanProgress;

        /**
         * <p>The time when the task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>completed: Completed.</li>
         * <li>failed: Failed.</li>
         * <li>canceling: Being canceled. </li>
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
         * <p>1648622222394847-ha-cn-lm64p7tby01_dsl_kb_video_1773817008236_full</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>The time when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
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

        public static DescribeScansResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeScansResponseBodyItems self = new DescribeScansResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeScansResponseBodyItems setCodeBundleId(Long codeBundleId) {
            this.codeBundleId = codeBundleId;
            return this;
        }
        public Long getCodeBundleId() {
            return this.codeBundleId;
        }

        public DescribeScansResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeScansResponseBodyItems setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeScansResponseBodyItems setCurrentPhase(String currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }
        public String getCurrentPhase() {
            return this.currentPhase;
        }

        public DescribeScansResponseBodyItems setEngineSnapshot(DescribeScansResponseBodyItemsEngineSnapshot engineSnapshot) {
            this.engineSnapshot = engineSnapshot;
            return this;
        }
        public DescribeScansResponseBodyItemsEngineSnapshot getEngineSnapshot() {
            return this.engineSnapshot;
        }

        public DescribeScansResponseBodyItems setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public DescribeScansResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeScansResponseBodyItems setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribeScansResponseBodyItems setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public DescribeScansResponseBodyItems setScanMetrics(DescribeScansResponseBodyItemsScanMetrics scanMetrics) {
            this.scanMetrics = scanMetrics;
            return this;
        }
        public DescribeScansResponseBodyItemsScanMetrics getScanMetrics() {
            return this.scanMetrics;
        }

        public DescribeScansResponseBodyItems setScanProgress(Long scanProgress) {
            this.scanProgress = scanProgress;
            return this;
        }
        public Long getScanProgress() {
            return this.scanProgress;
        }

        public DescribeScansResponseBodyItems setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public DescribeScansResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScansResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeScansResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeScansResponseBodyItems setWorkerId(String workerId) {
            this.workerId = workerId;
            return this;
        }
        public String getWorkerId() {
            return this.workerId;
        }

    }

}
