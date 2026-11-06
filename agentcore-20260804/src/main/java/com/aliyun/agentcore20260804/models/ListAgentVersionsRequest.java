// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentVersionsRequest extends TeaModel {
    /**
     * <p>单页最大记录数，取值范围 1 至 100，默认 20。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>查询下一页时传入上一次 ListAgentVersions 响应返回的 nextToken；首次查询不传。</p>
     * 
     * <strong>example:</strong>
     * <p>YWdlbnQtdmVyc2lvbnM6MjA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAgentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentVersionsRequest self = new ListAgentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
