// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListThreadsShrinkRequest extends TeaModel {
    /**
     * <p>The filter conditions for the query. If you do not specify this parameter, all threads in the instance are queried.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The maximum number of results to return. The maximum value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The paging token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The session status.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>thread-123123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static ListThreadsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListThreadsShrinkRequest self = new ListThreadsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListThreadsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListThreadsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListThreadsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListThreadsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListThreadsShrinkRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

}
