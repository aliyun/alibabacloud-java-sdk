// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobClassifyTypesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListCsccJobClassifyTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobClassifyTypesRequest self = new ListCsccJobClassifyTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccJobClassifyTypesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
