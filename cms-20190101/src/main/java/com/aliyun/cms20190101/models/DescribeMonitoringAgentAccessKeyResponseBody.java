// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentAccessKeyResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID that is required to install the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>E7A27f9****</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0F655E9-D793-51E6-BD78-CABBCCFC1047</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The AccessKey secret that is required to install the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>sBjNOUhLylrxMX-Xv1****</p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitoringAgentAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentAccessKeyResponseBody self = new DescribeMonitoringAgentAccessKeyResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeMonitoringAgentAccessKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public DescribeMonitoringAgentAccessKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
