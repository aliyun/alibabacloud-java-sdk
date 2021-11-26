// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeTransferHistoryResponseBody extends TeaModel {
    @NameInMap("HistoryDetails")
    public DescribeTransferHistoryResponseBodyHistoryDetails historyDetails;

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
        @NameInMap("Progress")
        public String progress;

        @NameInMap("SourceDBCluster")
        public String sourceDBCluster;

        @NameInMap("Status")
        public String status;

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
