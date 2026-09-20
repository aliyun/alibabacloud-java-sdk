// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesRequest extends TeaModel {
    /**
     * <p>Instance ID of the DAG instance that triggers the manual workflow. You can call the <a href="https://help.aliyun.com/document_detail/189728.html">CreateManualDag</a> operation to obtain instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000001231241</p>
     */
    @NameInMap("DagId")
    public String dagId;

    /**
     * <p>The environment identifier of the Operation Center. Valid values: PROD (production environment) and DEV (development environment).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPOD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The name of the workspace to which the manual workflow belongs. You can obtain the name on the workspace configuration page in the DataWorks console.</p>
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
