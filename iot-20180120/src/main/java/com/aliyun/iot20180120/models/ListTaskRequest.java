// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskRequest extends TeaModel {
    @NameInMap("Device")
    public String device;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Status")
    public String status;

    public static ListTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskRequest self = new ListTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskRequest setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public ListTaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListTaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListTaskRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
