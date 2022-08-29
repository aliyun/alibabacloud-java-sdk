// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListOnlineServiceJobClassifyTypesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListOnlineServiceJobClassifyTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineServiceJobClassifyTypesRequest self = new ListOnlineServiceJobClassifyTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListOnlineServiceJobClassifyTypesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
