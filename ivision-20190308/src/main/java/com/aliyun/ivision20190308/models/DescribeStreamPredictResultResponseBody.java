// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeStreamPredictResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("StreamPredictDatas")
    public java.util.List<DescribeStreamPredictResultResponseBodyStreamPredictDatas> streamPredictDatas;

    public static DescribeStreamPredictResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamPredictResultResponseBody self = new DescribeStreamPredictResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamPredictResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamPredictResultResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeStreamPredictResultResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeStreamPredictResultResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeStreamPredictResultResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeStreamPredictResultResponseBody setStreamPredictDatas(java.util.List<DescribeStreamPredictResultResponseBodyStreamPredictDatas> streamPredictDatas) {
        this.streamPredictDatas = streamPredictDatas;
        return this;
    }
    public java.util.List<DescribeStreamPredictResultResponseBodyStreamPredictDatas> getStreamPredictDatas() {
        return this.streamPredictDatas;
    }

    public static class DescribeStreamPredictResultResponseBodyStreamPredictDatas extends TeaModel {
        @NameInMap("PredictId")
        public String predictId;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("DataUrl")
        public String dataUrl;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("PredictTime")
        public String predictTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("PredictResult")
        public String predictResult;

        public static DescribeStreamPredictResultResponseBodyStreamPredictDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamPredictResultResponseBodyStreamPredictDatas self = new DescribeStreamPredictResultResponseBodyStreamPredictDatas();
            return TeaModel.build(map, self);
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setPredictId(String predictId) {
            this.predictId = predictId;
            return this;
        }
        public String getPredictId() {
            return this.predictId;
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setDataUrl(String dataUrl) {
            this.dataUrl = dataUrl;
            return this;
        }
        public String getDataUrl() {
            return this.dataUrl;
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setPredictTime(String predictTime) {
            this.predictTime = predictTime;
            return this;
        }
        public String getPredictTime() {
            return this.predictTime;
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStreamPredictResultResponseBodyStreamPredictDatas setPredictResult(String predictResult) {
            this.predictResult = predictResult;
            return this;
        }
        public String getPredictResult() {
            return this.predictResult;
        }

    }

}
