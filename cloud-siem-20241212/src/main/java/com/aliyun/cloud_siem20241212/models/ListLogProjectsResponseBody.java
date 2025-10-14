// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListLogProjectsResponseBody extends TeaModel {
    @NameInMap("LogProjects")
    public java.util.List<String> logProjects;

    /**
     * <strong>example:</strong>
     * <p>50。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>57。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLogProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogProjectsResponseBody self = new ListLogProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogProjectsResponseBody setLogProjects(java.util.List<String> logProjects) {
        this.logProjects = logProjects;
        return this;
    }
    public java.util.List<String> getLogProjects() {
        return this.logProjects;
    }

    public ListLogProjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLogProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLogProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
