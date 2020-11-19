// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitRollbackTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("ParentJobId")
    @Validation(required = true)
    public String parentJobId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    @NameInMap("ExpandType")
    @Validation(required = true)
    public String expandType;

    public static SubmitRollbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRollbackTaskRequest self = new SubmitRollbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRollbackTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitRollbackTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitRollbackTaskRequest setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
        return this;
    }
    public String getParentJobId() {
        return this.parentJobId;
    }

    public SubmitRollbackTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitRollbackTaskRequest setExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }
    public String getExpandType() {
        return this.expandType;
    }

}
