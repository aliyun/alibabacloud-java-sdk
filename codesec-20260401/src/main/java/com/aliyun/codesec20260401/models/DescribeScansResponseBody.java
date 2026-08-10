// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScansResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<DescribeScansResponseBodyItems> items;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("sast")
        public Boolean sast;

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
        @NameInMap("credit")
        public Float credit;

        @NameInMap("fileCount")
        public Long fileCount;

        @NameInMap("linesOfCode")
        public Long linesOfCode;

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
        @NameInMap("codeBundleId")
        public Long codeBundleId;

        /**
         * <p>扫描任务创建时间（RFC3339）</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("createdBy")
        public String createdBy;

        @NameInMap("engineSnapshot")
        public DescribeScansResponseBodyItemsEngineSnapshot engineSnapshot;

        /**
         * <p>扫描结束时间（RFC3339）</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        @NameInMap("id")
        public Long id;

        @NameInMap("kind")
        public String kind;

        @NameInMap("projectId")
        public Long projectId;

        @NameInMap("scanMetrics")
        public DescribeScansResponseBodyItemsScanMetrics scanMetrics;

        @NameInMap("scanProgress")
        public Long scanProgress;

        /**
         * <p>扫描开始时间（RFC3339）</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        @NameInMap("status")
        public String status;

        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>扫描任务更新时间（RFC3339）</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

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
