// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSwitchTaskRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("ExpandType")
    public String expandType;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ParentJobId")
    public String parentJobId;

    public static SubmitSwitchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSwitchTaskRequest self = new SubmitSwitchTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSwitchTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSwitchTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitSwitchTaskRequest setExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }
    public String getExpandType() {
        return this.expandType;
    }

    public SubmitSwitchTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSwitchTaskRequest setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
        return this;
    }
    public String getParentJobId() {
        return this.parentJobId;
    }

}
