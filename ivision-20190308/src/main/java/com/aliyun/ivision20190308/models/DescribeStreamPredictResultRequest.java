// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeStreamPredictResultRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("PredictId")
    public String predictId;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ProbabilityThreshold")
    public String probabilityThreshold;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeStreamPredictResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamPredictResultRequest self = new DescribeStreamPredictResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStreamPredictResultRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamPredictResultRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeStreamPredictResultRequest setPredictId(String predictId) {
        this.predictId = predictId;
        return this;
    }
    public String getPredictId() {
        return this.predictId;
    }

    public DescribeStreamPredictResultRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DescribeStreamPredictResultRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeStreamPredictResultRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeStreamPredictResultRequest setProbabilityThreshold(String probabilityThreshold) {
        this.probabilityThreshold = probabilityThreshold;
        return this;
    }
    public String getProbabilityThreshold() {
        return this.probabilityThreshold;
    }

    public DescribeStreamPredictResultRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeStreamPredictResultRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeStreamPredictResultRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
