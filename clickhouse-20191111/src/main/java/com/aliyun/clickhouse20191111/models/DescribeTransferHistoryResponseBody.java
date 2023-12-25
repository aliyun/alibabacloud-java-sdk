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
         * <p>The progress of the data migration.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the source cluster.</p>
         */
        @NameInMap("SourceDBCluster")
        public String sourceDBCluster;

        /**
         * <p>The status of the data migration task. Valid values:</p>
         * <br>
         * <p>*   **Finished**: The data migration task is complete.</p>
         * <p>*   **Processing**: The data migration task is in progress.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the destination cluster.</p>
         */
        @NameInMap("TargetDBCluster")
        public String targetDBCluster;

        public static DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail self = new DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail();
            return TeaModel.build(map, self);
        }

        public DescribeTransferHistoryResponseBodyHistoryDetailsHistoryDetail setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
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
