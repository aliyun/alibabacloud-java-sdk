// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSessionClustersRequest extends TeaModel {
    /**
     * <p>一次获取的最大记录数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("queueName")
    public String queueName;

    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>作业名称。</p>
     */
    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    public static ListSessionClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionClustersRequest self = new ListSessionClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSessionClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSessionClustersRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public ListSessionClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSessionClustersRequest setSessionClusterId(String sessionClusterId) {
        this.sessionClusterId = sessionClusterId;
        return this;
    }
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

}
