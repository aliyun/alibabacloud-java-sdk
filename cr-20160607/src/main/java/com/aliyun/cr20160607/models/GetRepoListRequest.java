// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoListRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static GetRepoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoListRequest self = new GetRepoListRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRepoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRepoListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
