// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class DescribeAgreementStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10aa40008e081ad7b1fb50bffc3a70b1</p>
     */
    @NameInMap("AgreementCode")
    public String agreementCode;

    /**
     * <strong>example:</strong>
     * <p>6254E13A-A79F-5786-9C75-7590727342C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1219541161213057</p>
     */
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
