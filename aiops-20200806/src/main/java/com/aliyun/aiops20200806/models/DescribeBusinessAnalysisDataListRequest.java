// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeBusinessAnalysisDataListRequest extends TeaModel {
    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeBusinessAnalysisDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBusinessAnalysisDataListRequest self = new DescribeBusinessAnalysisDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBusinessAnalysisDataListRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public DescribeBusinessAnalysisDataListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeBusinessAnalysisDataListRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeBusinessAnalysisDataListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
