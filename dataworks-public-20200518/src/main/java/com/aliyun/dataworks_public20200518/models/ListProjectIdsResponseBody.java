// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectIdsResponseBody extends TeaModel {
    @NameInMap("ProjectIds")
    public java.util.List<Long> projectIds;

    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectIdsResponseBody self = new ListProjectIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectIdsResponseBody setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    public ListProjectIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
