// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListNodeGroupsResponseBody extends TeaModel {
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

    @NameInMap("NodeGroups")
    public java.util.List<NodeGroup> nodeGroups;

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

    public static ListNodeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupsResponseBody self = new ListNodeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodeGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodeGroupsResponseBody setNodeGroups(java.util.List<NodeGroup> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<NodeGroup> getNodeGroups() {
        return this.nodeGroups;
    }

    public ListNodeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
