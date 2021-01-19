// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoBuildListRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetRepoBuildListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildListRequest self = new GetRepoBuildListRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRepoBuildListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
