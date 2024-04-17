// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApiTemplatesResponseBody extends TeaModel {
    @NameInMap("ApiTemplates")
    @Deprecated
    public java.util.List<ApiTemplate> apiTemplates;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApiTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiTemplatesResponseBody self = new ListApiTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiTemplatesResponseBody setApiTemplates(java.util.List<ApiTemplate> apiTemplates) {
        this.apiTemplates = apiTemplates;
        return this;
    }
    public java.util.List<ApiTemplate> getApiTemplates() {
        return this.apiTemplates;
    }

    public ListApiTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
