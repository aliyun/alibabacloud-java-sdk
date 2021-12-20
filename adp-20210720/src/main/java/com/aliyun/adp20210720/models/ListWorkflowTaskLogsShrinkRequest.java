// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListWorkflowTaskLogsShrinkRequest extends TeaModel {
    @NameInMap("filterValues")
    public String filterValuesShrink;

    // log 的顺序，positive 代表最新的数据在最后，reverse 代表最新的数据在最前
    @NameInMap("orderType")
    public String orderType;

    @NameInMap("pageNum")
    public Long pageNum;

    // 每一页的行数，最大值 100
    @NameInMap("pageSize")
    public Long pageSize;

    // ENUM:["CreateCluster","DeleteCluster","Pack","Deploy"]
    @NameInMap("workflowType")
    public String workflowType;

    @NameInMap("xuid")
    public String xuid;

    public static ListWorkflowTaskLogsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTaskLogsShrinkRequest self = new ListWorkflowTaskLogsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTaskLogsShrinkRequest setFilterValuesShrink(String filterValuesShrink) {
        this.filterValuesShrink = filterValuesShrink;
        return this;
    }
    public String getFilterValuesShrink() {
        return this.filterValuesShrink;
    }

    public ListWorkflowTaskLogsShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListWorkflowTaskLogsShrinkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListWorkflowTaskLogsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowTaskLogsShrinkRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

    public ListWorkflowTaskLogsShrinkRequest setXuid(String xuid) {
        this.xuid = xuid;
        return this;
    }
    public String getXuid() {
        return this.xuid;
    }

}
