// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeTaskStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Failed")
    public Integer failed;

    @NameInMap("InProgress")
    public Integer inProgress;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Successful")
    public Integer successful;

    public static DescribeTaskStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskStatisticsResponseBody self = new DescribeTaskStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTaskStatisticsResponseBody setFailed(Integer failed) {
        this.failed = failed;
        return this;
    }
    public Integer getFailed() {
        return this.failed;
    }

    public DescribeTaskStatisticsResponseBody setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
        return this;
    }
    public Integer getInProgress() {
        return this.inProgress;
    }

    public DescribeTaskStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTaskStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTaskStatisticsResponseBody setSuccessful(Integer successful) {
        this.successful = successful;
        return this;
    }
    public Integer getSuccessful() {
        return this.successful;
    }

}
