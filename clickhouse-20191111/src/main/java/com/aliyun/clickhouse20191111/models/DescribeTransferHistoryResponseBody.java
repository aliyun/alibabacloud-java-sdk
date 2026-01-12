// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeTransferHistoryResponseBody extends TeaModel {
    /**
     * <p>The migration information.</p>
     */
    @NameInMap("HistoryDetails")
    public DescribeTransferHistoryResponseBodyHistoryDetails historyDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTransferHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferHistoryResponseBody self = new DescribeTransferHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransferHistoryResponseBody setHistoryDetails(DescribeTransferHistoryResponseBodyHistoryDetails historyDetails) {
        this.historyDetails = historyDetails;
        return this;
    }
    public DescribeTransferHistoryResponseBodyHistoryDetails getHistoryDetails() {
        return this.historyDetails;
    }

    public DescribeTransferHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail extends TeaModel {
        /**
         * <p>The amount of data that is migrated per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("BytesPerMinute")
        public Long bytesPerMinute;

        /**
         * <p>The time window during which write operations are stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-08T00:00:00+08:00,2025-02-12T00:00:00+08:00</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableWriteWindows")
        public String disableWriteWindows;

        /**
         * <p>The number of parts that are migrated per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>1.24</p>
         */
        @NameInMap("PartsPerMinute")
        public Double partsPerMinute;

        /**
         * <p>The progress of the data migration.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The control version of the source cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("SourceControlVersion")
        public String sourceControlVersion;

        /**
         * <p>The ID of the source cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        @NameInMap("SourceDBCluster")
        public String sourceDBCluster;

        /**
         * <p>The status of the data migration task. Valid values:</p>
         * <ul>
         * <li><strong>Finished</strong>: The data migration task is complete.</li>
         * <li><strong>Processing</strong>: The data migration task is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The running subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>SubJob</p>
         */
        @NameInMap("SubJob")
        public String subJob;

        @NameInMap("SubJobMessage")
        public String subJobMessage;

        /**
         * <p>The subtask status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("SubJobStatus")
        public String subJobStatus;

        /**
         * <p>The control version of the destination cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("TargetControlVersion")
        public String targetControlVersion;

        /**
         * <p>The ID of the destination cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp13zkh9uw523****</p>
         */
        @NameInMap("TargetDBCluster")
        public String targetDBCluster;

        /**
         * <p>The amount of data that is not migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("UnsyncedBytes")
        public Long unsyncedBytes;

        /**
         * <p>The number of parts that are not migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("UnsyncedParts")
        public Long unsyncedParts;

        public static DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail self = new DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail();
            return TeaModel.build(map, self);
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setBytesPerMinute(Long bytesPerMinute) {
            this.bytesPerMinute = bytesPerMinute;
            return this;
        }
        public Long getBytesPerMinute() {
            return this.bytesPerMinute;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setDisableWriteWindows(String disableWriteWindows) {
            this.disableWriteWindows = disableWriteWindows;
            return this;
        }
        public String getDisableWriteWindows() {
            return this.disableWriteWindows;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setPartsPerMinute(Double partsPerMinute) {
            this.partsPerMinute = partsPerMinute;
            return this;
        }
        public Double getPartsPerMinute() {
            return this.partsPerMinute;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setSourceControlVersion(String sourceControlVersion) {
            this.sourceControlVersion = sourceControlVersion;
            return this;
        }
        public String getSourceControlVersion() {
            return this.sourceControlVersion;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setSourceDBCluster(String sourceDBCluster) {
            this.sourceDBCluster = sourceDBCluster;
            return this;
        }
        public String getSourceDBCluster() {
            return this.sourceDBCluster;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setSubJob(String subJob) {
            this.subJob = subJob;
            return this;
        }
        public String getSubJob() {
            return this.subJob;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setSubJobMessage(String subJobMessage) {
            this.subJobMessage = subJobMessage;
            return this;
        }
        public String getSubJobMessage() {
            return this.subJobMessage;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setSubJobStatus(String subJobStatus) {
            this.subJobStatus = subJobStatus;
            return this;
        }
        public String getSubJobStatus() {
            return this.subJobStatus;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setTargetControlVersion(String targetControlVersion) {
            this.targetControlVersion = targetControlVersion;
            return this;
        }
        public String getTargetControlVersion() {
            return this.targetControlVersion;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setTargetDBCluster(String targetDBCluster) {
            this.targetDBCluster = targetDBCluster;
            return this;
        }
        public String getTargetDBCluster() {
            return this.targetDBCluster;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setUnsyncedBytes(Long unsyncedBytes) {
            this.unsyncedBytes = unsyncedBytes;
            return this;
        }
        public Long getUnsyncedBytes() {
            return this.unsyncedBytes;
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setUnsyncedParts(Long unsyncedParts) {
            this.unsyncedParts = unsyncedParts;
            return this;
        }
        public Long getUnsyncedParts() {
            return this.unsyncedParts;
        }

    }

    public static class DescribeTransferHistoryResponseBodyHistoryDetails extends TeaModel {
        @NameInMap("HistoryDetail")
        public java.util.List<DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail> historyDetail;

        public static DescribeTransferHistoryResponseBodyHistoryDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferHistoryResponseBodyHistoryDetails self = new DescribeTransferHistoryResponseBodyHistoryDetails();
            return TeaModel.build(map, self);
        }

        public DescribeTransferHistoryResponseBodyHistoryDetails setHistoryDetail(java.util.List<DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail> historyDetail) {
            this.historyDetail = historyDetail;
            return this;
        }
        public java.util.List<DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail> getHistoryDetail() {
            return this.historyDetail;
        }

    }

}
