// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class DescribeAgreementStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("AgreementCode")
    public String agreementCode;

    public static DescribeAgreementStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgreementStatusResponseBody self = new DescribeAgreementStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgreementStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeAgreementStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgreementStatusResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeAgreementStatusResponseBody setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
