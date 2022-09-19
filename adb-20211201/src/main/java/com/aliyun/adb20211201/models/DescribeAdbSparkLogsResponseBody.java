// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbSparkLogsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SparkLogs")
    public String sparkLogs;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAdbSparkLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbSparkLogsResponseBody self = new DescribeAdbSparkLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbSparkLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbSparkLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbSparkLogsResponseBody setSparkLogs(String sparkLogs) {
        this.sparkLogs = sparkLogs;
        return this;
    }
    public String getSparkLogs() {
        return this.sparkLogs;
    }

    public DescribeAdbSparkLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
