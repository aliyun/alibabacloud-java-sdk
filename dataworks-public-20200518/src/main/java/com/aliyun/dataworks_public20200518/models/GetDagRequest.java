// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDagRequest extends TeaModel {
    /**
     * <p>The DAG ID. You can set this parameter to the value of the DagId parameter returned by the CreateDagComplement, CreateTest, or CreateManualDag operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123141452344525</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
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
