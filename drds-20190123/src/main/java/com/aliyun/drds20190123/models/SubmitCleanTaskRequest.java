// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitCleanTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("ParentJobId")
    public String parentJobId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ExpandType")
    public String expandType;

    public static SubmitCleanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCleanTaskRequest self = new SubmitCleanTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCleanTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitCleanTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitCleanTaskRequest setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
        return this;
    }
    public String getParentJobId() {
        return this.parentJobId;
    }

    public SubmitCleanTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitCleanTaskRequest setExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }
    public String getExpandType() {
        return this.expandType;
    }

}
