// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionBatchResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestId")
    public String requestId;

    public static StopAppSessionBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionBatchResponseBody self = new StopAppSessionBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAppSessionBatchResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopAppSessionBatchResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public StopAppSessionBatchResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StopAppSessionBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
