// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobExecutorsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>driver</p>
     */
    @NameInMap("executorType")
    public String executorType;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Dead</p>
     */
    @NameInMap("status")
    public String status;

    public static ListJobExecutorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutorsRequest self = new ListJobExecutorsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobExecutorsRequest setExecutorType(String executorType) {
        this.executorType = executorType;
        return this;
    }
    public String getExecutorType() {
        return this.executorType;
    }

    public ListJobExecutorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJobExecutorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJobExecutorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListJobExecutorsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
