// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectIdsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProjectIds")
    @Validation(required = true)
    public java.util.List<Long> projectIds;

    public static ListProjectIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectIdsResponse self = new ListProjectIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectIdsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectIdsResponse setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

}
