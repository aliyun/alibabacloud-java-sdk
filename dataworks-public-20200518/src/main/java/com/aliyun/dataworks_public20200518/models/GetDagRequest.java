// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDagRequest extends TeaModel {
    @NameInMap("DagId")
    @Validation(required = true)
    public Long dagId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    public static GetDagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDagRequest self = new GetDagRequest();
        return TeaModel.build(map, self);
    }

    public GetDagRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public GetDagRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
