// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentAccessKeyResponseBody extends TeaModel {
    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitoringAgentAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentAccessKeyResponseBody self = new DescribeMonitoringAgentAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
