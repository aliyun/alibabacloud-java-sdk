// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseTagListRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryEnterpriseTagListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseTagListRequest self = new QueryEnterpriseTagListRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseTagListRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public QueryEnterpriseTagListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryEnterpriseTagListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
