// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryAvatarProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("projectId")
    public String projectId;

    public static QueryAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarProjectRequest self = new QueryAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvatarProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
