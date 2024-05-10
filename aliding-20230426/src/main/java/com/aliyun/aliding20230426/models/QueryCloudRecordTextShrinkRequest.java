// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordTextShrinkRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Long nextToken;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static QueryCloudRecordTextShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordTextShrinkRequest self = new QueryCloudRecordTextShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordTextShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public QueryCloudRecordTextShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public QueryCloudRecordTextShrinkRequest setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public QueryCloudRecordTextShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryCloudRecordTextShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public QueryCloudRecordTextShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
