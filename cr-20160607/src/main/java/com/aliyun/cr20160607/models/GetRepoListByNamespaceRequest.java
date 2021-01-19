// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoListByNamespaceRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetRepoListByNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoListByNamespaceRequest self = new GetRepoListByNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoListByNamespaceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRepoListByNamespaceRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRepoListByNamespaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
