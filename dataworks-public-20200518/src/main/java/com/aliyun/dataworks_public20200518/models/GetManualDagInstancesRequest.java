// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesRequest extends TeaModel {
    @NameInMap("DagId")
    public String dagId;

    @NameInMap("ProjectEnv")
    public String projectEnv;

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
