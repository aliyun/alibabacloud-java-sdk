// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskShrinkRequest extends TeaModel {
    @NameInMap("Device")
    public String deviceShrink;

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

    public static ListTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskShrinkRequest self = new ListTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskShrinkRequest setDeviceShrink(String deviceShrink) {
        this.deviceShrink = deviceShrink;
        return this;
    }
    public String getDeviceShrink() {
        return this.deviceShrink;
    }

    public ListTaskShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListTaskShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListTaskShrinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListTaskShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
