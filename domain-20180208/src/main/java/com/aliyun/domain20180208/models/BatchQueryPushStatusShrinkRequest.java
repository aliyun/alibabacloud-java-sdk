// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryPushStatusShrinkRequest extends TeaModel {
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
    public String outBizIdsShrink;

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

    public static BatchQueryPushStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryPushStatusShrinkRequest self = new BatchQueryPushStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryPushStatusShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryPushStatusShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryPushStatusShrinkRequest setOutBizIdsShrink(String outBizIdsShrink) {
        this.outBizIdsShrink = outBizIdsShrink;
        return this;
    }
    public String getOutBizIdsShrink() {
        return this.outBizIdsShrink;
    }

    public BatchQueryPushStatusShrinkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchQueryPushStatusShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
