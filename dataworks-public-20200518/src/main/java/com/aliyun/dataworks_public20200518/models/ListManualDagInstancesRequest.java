// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesRequest extends TeaModel {
    @NameInMap("DagId")
    public String dagId;

    @NameInMap("ProjectEnv")
    public String projectEnv;

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
