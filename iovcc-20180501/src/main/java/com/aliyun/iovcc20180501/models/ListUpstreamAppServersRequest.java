// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListUpstreamAppServersRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageIndex")
    public String pageIndex;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListUpstreamAppServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamAppServersRequest self = new ListUpstreamAppServersRequest();
        return TeaModel.build(map, self);
    }

    public ListUpstreamAppServersRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListUpstreamAppServersRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public ListUpstreamAppServersRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
