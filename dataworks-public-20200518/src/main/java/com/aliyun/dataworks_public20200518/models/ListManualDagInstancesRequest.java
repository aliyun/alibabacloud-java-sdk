// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the directed acyclic graph (DAG) for the manually triggered workflow. You can call the [RunManualDagNodes](~~212830~~) operation to obtain the ID.</p>
     */
    @NameInMap("DagId")
    public String dagId;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. A value of PROD indicates the production environment. A value of DEV indicates the development environment.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The name of the workspace to which the manually triggered workflow belongs. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to view the name.</p>
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
