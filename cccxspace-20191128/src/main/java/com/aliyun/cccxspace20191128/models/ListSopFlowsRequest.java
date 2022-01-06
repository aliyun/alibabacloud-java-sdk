// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListSopFlowsRequest extends TeaModel {
    // 当前页
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 对应的xflow的ID
    @NameInMap("FlowId")
    public Long flowId;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // SOP名称查询
    @NameInMap("Keyword")
    public String keyword;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSopFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSopFlowsRequest self = new ListSopFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListSopFlowsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSopFlowsRequest setFlowId(Long flowId) {
        this.flowId = flowId;
        return this;
    }
    public Long getFlowId() {
        return this.flowId;
    }

    public ListSopFlowsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSopFlowsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSopFlowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
