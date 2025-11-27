// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListBizTracesResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<BizTraceConfig> items;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>aa9d0e569b88098a0e3155c29b473201a</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListBizTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBizTracesResponseBody self = new ListBizTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBizTracesResponseBody setItems(java.util.List<BizTraceConfig> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BizTraceConfig> getItems() {
        return this.items;
    }

    public ListBizTracesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBizTracesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBizTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBizTracesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
