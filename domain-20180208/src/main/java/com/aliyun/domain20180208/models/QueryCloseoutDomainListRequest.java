// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryCloseoutDomainListRequest extends TeaModel {
    @NameInMap("CurrentId")
    public Long currentId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryCloseoutDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloseoutDomainListRequest self = new QueryCloseoutDomainListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloseoutDomainListRequest setCurrentId(Long currentId) {
        this.currentId = currentId;
        return this;
    }
    public Long getCurrentId() {
        return this.currentId;
    }

    public QueryCloseoutDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
