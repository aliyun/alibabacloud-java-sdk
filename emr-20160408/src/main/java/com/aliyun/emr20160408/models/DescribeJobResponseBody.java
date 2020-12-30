// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("FailAct")
    public String failAct;

    @NameInMap("Type")
    public String type;

    @NameInMap("RunParameter")
    public String runParameter;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("Id")
    public String id;

    @NameInMap("MaxRetry")
    public Integer maxRetry;

    @NameInMap("Name")
    public String name;

    public static DescribeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResponseBody self = new DescribeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobResponseBody setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public DescribeJobResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeJobResponseBody setRunParameter(String runParameter) {
        this.runParameter = runParameter;
        return this;
    }
    public String getRunParameter() {
        return this.runParameter;
    }

    public DescribeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobResponseBody setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public DescribeJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeJobResponseBody setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }
    public Integer getMaxRetry() {
        return this.maxRetry;
    }

    public DescribeJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
