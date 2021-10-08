// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Code")
    public String code;

    @NameInMap("RiskAssessment")
    public java.util.Map<String, ?> riskAssessment;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResponseBody self = new DescribeRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRiskResponseBody setRiskAssessment(java.util.Map<String, ?> riskAssessment) {
        this.riskAssessment = riskAssessment;
        return this;
    }
    public java.util.Map<String, ?> getRiskAssessment() {
        return this.riskAssessment;
    }

    public DescribeRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
