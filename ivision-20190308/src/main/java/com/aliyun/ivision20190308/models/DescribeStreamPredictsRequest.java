// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DescribeStreamPredictsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("PredictIds")
    public String predictIds;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeStreamPredictsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamPredictsRequest self = new DescribeStreamPredictsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStreamPredictsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamPredictsRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeStreamPredictsRequest setPredictIds(String predictIds) {
        this.predictIds = predictIds;
        return this;
    }
    public String getPredictIds() {
        return this.predictIds;
    }

    public DescribeStreamPredictsRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DescribeStreamPredictsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public DescribeStreamPredictsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeStreamPredictsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
