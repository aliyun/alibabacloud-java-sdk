// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionProjectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("projectIds")
    public java.util.List<Long> projectIds;

    public static ListEnabledExtensionProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnabledExtensionProjectsResponseBody self = new ListEnabledExtensionProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnabledExtensionProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnabledExtensionProjectsResponseBody setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

}
