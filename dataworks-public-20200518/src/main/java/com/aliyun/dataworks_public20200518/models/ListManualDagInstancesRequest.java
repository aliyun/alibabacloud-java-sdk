// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the directed acyclic graph (DAG) for the manually triggered workflow. You can call the <a href="https://help.aliyun.com/document_detail/212830.html">RunManualDagNodes</a> operation to obtain the ID.</p>
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
     * <p>The name of the workspace to which the manually triggered workflow belongs. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workspace</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static ListManualDagInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListManualDagInstancesRequest self = new ListManualDagInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListManualDagInstancesRequest setDagId(String dagId) {
        this.dagId = dagId;
        return this;
    }
    public String getDagId() {
        return this.dagId;
    }

    public ListManualDagInstancesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListManualDagInstancesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
