// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListSopFlowsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FlowId")
    public Long flowId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

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
