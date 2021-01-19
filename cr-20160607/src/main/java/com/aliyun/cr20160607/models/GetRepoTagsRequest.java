// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoTagsRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetRepoTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagsRequest self = new GetRepoTagsRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRepoTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
