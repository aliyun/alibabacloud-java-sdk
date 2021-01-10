// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeStreamPredictsResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("StreamPredicts")
    public java.util.List<DescribeStreamPredictsResponseBodyStreamPredicts> streamPredicts;

    public static DescribeStreamPredictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamPredictsResponseBody self = new DescribeStreamPredictsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamPredictsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeStreamPredictsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeStreamPredictsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamPredictsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeStreamPredictsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeStreamPredictsResponseBody setStreamPredicts(java.util.List<DescribeStreamPredictsResponseBodyStreamPredicts> streamPredicts) {
        this.streamPredicts = streamPredicts;
        return this;
    }
    public java.util.List<DescribeStreamPredictsResponseBodyStreamPredicts> getStreamPredicts() {
        return this.streamPredicts;
    }

    public static class DescribeStreamPredictsResponseBodyStreamPredicts extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Notify")
        public String notify;

        @NameInMap("PredictId")
        public String predictId;

        @NameInMap("ModelUserData")
        public String modelUserData;

        @NameInMap("Output")
        public String output;

        @NameInMap("PredictTemplateId")
        public String predictTemplateId;

        @NameInMap("StreamId")
        public String streamId;

        @NameInMap("AutoStart")
        public String autoStart;

        @NameInMap("ProbabilityThresholds")
        public String probabilityThresholds;

        @NameInMap("DetectIntervals")
        public String detectIntervals;

        @NameInMap("StreamType")
        public String streamType;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("ModelIds")
        public String modelIds;

        @NameInMap("FaceGroupId")
        public String faceGroupId;

        public static DescribeStreamPredictsResponseBodyStreamPredicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeStreamPredictsResponseBodyStreamPredicts self = new DescribeStreamPredictsResponseBodyStreamPredicts();
            return TeaModel.build(map, self);
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setNotify(String notify) {
            this.notify = notify;
            return this;
        }
        public String getNotify() {
            return this.notify;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setPredictId(String predictId) {
            this.predictId = predictId;
            return this;
        }
        public String getPredictId() {
            return this.predictId;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setModelUserData(String modelUserData) {
            this.modelUserData = modelUserData;
            return this;
        }
        public String getModelUserData() {
            return this.modelUserData;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setPredictTemplateId(String predictTemplateId) {
            this.predictTemplateId = predictTemplateId;
            return this;
        }
        public String getPredictTemplateId() {
            return this.predictTemplateId;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setAutoStart(String autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public String getAutoStart() {
            return this.autoStart;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setProbabilityThresholds(String probabilityThresholds) {
            this.probabilityThresholds = probabilityThresholds;
            return this;
        }
        public String getProbabilityThresholds() {
            return this.probabilityThresholds;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setDetectIntervals(String detectIntervals) {
            this.detectIntervals = detectIntervals;
            return this;
        }
        public String getDetectIntervals() {
            return this.detectIntervals;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setModelIds(String modelIds) {
            this.modelIds = modelIds;
            return this;
        }
        public String getModelIds() {
            return this.modelIds;
        }

        public DescribeStreamPredictsResponseBodyStreamPredicts setFaceGroupId(String faceGroupId) {
            this.faceGroupId = faceGroupId;
            return this;
        }
        public String getFaceGroupId() {
            return this.faceGroupId;
        }

    }

}
