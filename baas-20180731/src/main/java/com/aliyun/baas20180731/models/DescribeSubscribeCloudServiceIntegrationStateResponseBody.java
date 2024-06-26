// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSubscribeCloudServiceIntegrationStateResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSubscribeCloudServiceIntegrationStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscribeCloudServiceIntegrationStateResponseBody self = new DescribeSubscribeCloudServiceIntegrationStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeSubscribeCloudServiceIntegrationStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
