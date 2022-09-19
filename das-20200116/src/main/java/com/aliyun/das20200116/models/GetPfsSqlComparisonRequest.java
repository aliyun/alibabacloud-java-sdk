// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlComparisonRequest extends TeaModel {
    @NameInMap("Asc")
    public Boolean asc;

    @NameInMap("EndOne")
    public Long endOne;

    @NameInMap("EndTwo")
    public Long endTwo;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartOne")
    public Long startOne;

    @NameInMap("StartTwo")
    public Long startTwo;

    public static GetPfsSqlComparisonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlComparisonRequest self = new GetPfsSqlComparisonRequest();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlComparisonRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetPfsSqlComparisonRequest setEndOne(Long endOne) {
        this.endOne = endOne;
        return this;
    }
    public Long getEndOne() {
        return this.endOne;
    }

    public GetPfsSqlComparisonRequest setEndTwo(Long endTwo) {
        this.endTwo = endTwo;
        return this;
    }
    public Long getEndTwo() {
        return this.endTwo;
    }

    public GetPfsSqlComparisonRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPfsSqlComparisonRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetPfsSqlComparisonRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPfsSqlComparisonRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetPfsSqlComparisonRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetPfsSqlComparisonRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPfsSqlComparisonRequest setStartOne(Long startOne) {
        this.startOne = startOne;
        return this;
    }
    public Long getStartOne() {
        return this.startOne;
    }

    public GetPfsSqlComparisonRequest setStartTwo(Long startTwo) {
        this.startTwo = startTwo;
        return this;
    }
    public Long getStartTwo() {
        return this.startTwo;
    }

}
