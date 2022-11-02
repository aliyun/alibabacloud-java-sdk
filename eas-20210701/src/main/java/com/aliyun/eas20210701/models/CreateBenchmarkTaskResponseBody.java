// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateBenchmarkTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Region")
    public String region;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskName")
    public String taskName;

    public static CreateBenchmarkTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBenchmarkTaskResponseBody self = new CreateBenchmarkTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBenchmarkTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBenchmarkTaskResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateBenchmarkTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBenchmarkTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
