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
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableWriteWindows")
        public String disableWriteWindows;

        /**
         * <p>The progress of the data migration.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

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

        public static DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail self = new DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail();
            return TeaModel.build(map, self);
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setDisableWriteWindows(String disableWriteWindows) {
            this.disableWriteWindows = disableWriteWindows;
            return this;
        }
        public String getDisableWriteWindows() {
            return this.disableWriteWindows;
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
