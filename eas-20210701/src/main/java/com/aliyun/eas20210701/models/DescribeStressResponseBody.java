// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeStressResponseBody extends TeaModel {
    @NameInMap("AvailableAgent")
    public Long availableAgent;

    @NameInMap("CallerUid")
    public String callerUid;

    @NameInMap("DesiredAgent")
    public Long desiredAgent;

    @NameInMap("Message")
    public String message;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("Reason")
    public String reason;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Status")
    public String status;

    @NameInMap("StressName")
    public String stressName;

    @NameInMap("Token")
    public String token;

    public static DescribeStressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStressResponseBody self = new DescribeStressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStressResponseBody setAvailableAgent(Long availableAgent) {
        this.availableAgent = availableAgent;
        return this;
    }
    public Long getAvailableAgent() {
        return this.availableAgent;
    }

    public DescribeStressResponseBody setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public DescribeStressResponseBody setDesiredAgent(Long desiredAgent) {
        this.desiredAgent = desiredAgent;
        return this;
    }
    public Long getDesiredAgent() {
        return this.desiredAgent;
    }

    public DescribeStressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStressResponseBody setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public DescribeStressResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DescribeStressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStressResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeStressResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeStressResponseBody setStressName(String stressName) {
        this.stressName = stressName;
        return this;
    }
    public String getStressName() {
        return this.stressName;
    }

    public DescribeStressResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
