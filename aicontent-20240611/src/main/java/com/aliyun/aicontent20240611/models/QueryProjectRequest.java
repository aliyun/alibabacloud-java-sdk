// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("projectId")
    public String projectId;

    public static QueryProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectRequest self = new QueryProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
