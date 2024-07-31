// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the directed acyclic graph (DAG) for the manually triggered workflow. You can call the <a href="https://help.aliyun.com/document_detail/189728.html">CreateManualDag</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000001231241</p>
     */
    @NameInMap("DagId")
    public String dagId;

    /**
     * <p>The environment of Operation Center. Valid values: PROD and DEV.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPOD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The name of the workspace to which the manually triggered workflow belongs. You can log on to the DataWorks console and go to the Workspace Settings panel to query the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workspace</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static GetManualDagInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetManualDagInstancesRequest self = new GetManualDagInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetManualDagInstancesRequest setDagId(String dagId) {
        this.dagId = dagId;
        return this;
    }
    public String getDagId() {
        return this.dagId;
    }

    public GetManualDagInstancesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetManualDagInstancesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
