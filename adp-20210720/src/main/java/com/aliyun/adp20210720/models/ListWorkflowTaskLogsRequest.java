// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListWorkflowTaskLogsRequest extends TeaModel {
    @NameInMap("filterValues")
    public java.util.List<String> filterValues;

    @NameInMap("orderType")
    public String orderType;

    @NameInMap("pageNum")
    public Long pageNum;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("workflowType")
    public String workflowType;

    @NameInMap("xuid")
    public String xuid;

    public static ListWorkflowTaskLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTaskLogsRequest self = new ListWorkflowTaskLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTaskLogsRequest setFilterValues(java.util.List<String> filterValues) {
        this.filterValues = filterValues;
        return this;
    }
    public java.util.List<String> getFilterValues() {
        return this.filterValues;
    }

    public ListWorkflowTaskLogsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListWorkflowTaskLogsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListWorkflowTaskLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowTaskLogsRequest setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    public String getWorkflowType() {
        return this.workflowType;
    }

    public ListWorkflowTaskLogsRequest setXuid(String xuid) {
        this.xuid = xuid;
        return this;
    }
    public String getXuid() {
        return this.xuid;
    }

}
