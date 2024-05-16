// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    public static QueryPublicModelEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPublicModelEngineRequest self = new QueryPublicModelEngineRequest();
        return TeaModel.build(map, self);
    }

    public QueryPublicModelEngineRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryPublicModelEngineRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
