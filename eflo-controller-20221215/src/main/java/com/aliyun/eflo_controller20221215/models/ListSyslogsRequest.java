// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListSyslogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1659745800</p>
     */
    @NameInMap("FromTime")
    public String fromTime;

    /**
     * <strong>example:</strong>
     * <p>392e8b4a03ed171433cc39f5b464ec9d</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-nwy37atbj44</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1665369329</p>
     */
    @NameInMap("ToTime")
    public String toTime;

    public static ListSyslogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyslogsRequest self = new ListSyslogsRequest();
        return TeaModel.build(map, self);
    }

    public ListSyslogsRequest setFromTime(String fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public String getFromTime() {
        return this.fromTime;
    }

    public ListSyslogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSyslogsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListSyslogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListSyslogsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListSyslogsRequest setToTime(String toTime) {
        this.toTime = toTime;
        return this;
    }
    public String getToTime() {
        return this.toTime;
    }

}
