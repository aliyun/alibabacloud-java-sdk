// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryPushStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFqBJBxE8I0PE0IUO6K69k7pmbXbaAXBUMUwC3LZW7xPBVA7dWZKlxBcjUwOV0imSM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;NL202501&quot;, &quot;NL202502&quot;]</p>
     */
    @NameInMap("OutBizIds")
    public java.util.List<String> outBizIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static BatchQueryPushStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryPushStatusRequest self = new BatchQueryPushStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryPushStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryPushStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryPushStatusRequest setOutBizIds(java.util.List<String> outBizIds) {
        this.outBizIds = outBizIds;
        return this;
    }
    public java.util.List<String> getOutBizIds() {
        return this.outBizIds;
    }

    public BatchQueryPushStatusRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchQueryPushStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
