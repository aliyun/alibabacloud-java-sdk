// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelAsyncSqlByJobIdRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static CancelAsyncSqlByJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncSqlByJobIdRequest self = new CancelAsyncSqlByJobIdRequest();
        return TeaModel.build(map, self);
    }

    public CancelAsyncSqlByJobIdRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CancelAsyncSqlByJobIdRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CancelAsyncSqlByJobIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelAsyncSqlByJobIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
