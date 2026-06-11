// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListExecutorLogsRequest extends TeaModel {
    /**
     * <p>The type of log. Only logs of this type are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>log4j</p>
     */
    @NameInMap("logType")
    public String logType;

    /**
     * <p>The maximum number of results to return per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This is the <code>nextToken</code> from a previously truncated response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListExecutorLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorLogsRequest self = new ListExecutorLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutorLogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListExecutorLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutorLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutorLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
