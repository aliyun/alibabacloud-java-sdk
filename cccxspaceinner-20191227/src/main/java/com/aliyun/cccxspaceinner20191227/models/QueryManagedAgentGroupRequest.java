// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryManagedAgentGroupRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryManagedAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryManagedAgentGroupRequest self = new QueryManagedAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryManagedAgentGroupRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public QueryManagedAgentGroupRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryManagedAgentGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
