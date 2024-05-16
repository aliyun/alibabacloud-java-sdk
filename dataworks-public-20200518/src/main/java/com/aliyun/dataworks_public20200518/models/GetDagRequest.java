// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDagRequest extends TeaModel {
    /**
     * <p>The ID of the DAG. You can set this parameter to the value of the DagId parameter returned by the CreateDagComplement, CreateTest, or CreateManualDag operation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The environment type. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
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
