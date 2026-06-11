// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSessionClustersRequest extends TeaModel {
    /**
     * <p>The session type.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The maximum number of records to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the start of the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The queue name.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("queueName")
    public String queueName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>emr-spark-demo-job</p>
     */
    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    public static ListSessionClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionClustersRequest self = new ListSessionClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionClustersRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
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
