// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRepoTagScanListRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Severity")
    public String severity;

    public static GetRepoTagScanListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanListRequest self = new GetRepoTagScanListRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRepoTagScanListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRepoTagScanListRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

}
