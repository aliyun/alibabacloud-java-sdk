// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitCleanTaskRequest extends TeaModel {
    /**
     * <p>The name of the database that is scaled out.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The scale-out type. Valid values:</p>
     * <br>
     * <p>*   smooth_expand: smooth scale-out</p>
     * <p>*   hot_expand: hot-spot scale-out</p>
     */
    @NameInMap("ExpandType")
    public String expandType;

    /**
     * <p>The job ID of the scale-out task. The value of this parameter is the same as that of the ParentJobId parameter.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the scale-out task. This parameter is returned if you send a request for the smooth scale-out task.</p>
     */
    @NameInMap("ParentJobId")
    public String parentJobId;

    public static SubmitCleanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCleanTaskRequest self = new SubmitCleanTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCleanTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitCleanTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitCleanTaskRequest setExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }
    public String getExpandType() {
        return this.expandType;
    }

    public SubmitCleanTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitCleanTaskRequest setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
        return this;
    }
    public String getParentJobId() {
        return this.parentJobId;
    }

}
