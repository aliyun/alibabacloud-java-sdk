// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class DescribeAgreementStatusResponseBody extends TeaModel {
    @NameInMap("AgreementCode")
    public String agreementCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("UserId")
    public String userId;

    public static DescribeAgreementStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgreementStatusResponseBody self = new DescribeAgreementStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgreementStatusResponseBody setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

    public DescribeAgreementStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgreementStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeAgreementStatusResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
