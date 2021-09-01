// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnsignWithholdAgreementResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WithholdSignResponse")
    public UnsignWithholdAgreementResponseBodyWithholdSignResponse withholdSignResponse;

    public static UnsignWithholdAgreementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnsignWithholdAgreementResponseBody self = new UnsignWithholdAgreementResponseBody();
        return TeaModel.build(map, self);
    }

    public UnsignWithholdAgreementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnsignWithholdAgreementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnsignWithholdAgreementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnsignWithholdAgreementResponseBody setWithholdSignResponse(UnsignWithholdAgreementResponseBodyWithholdSignResponse withholdSignResponse) {
        this.withholdSignResponse = withholdSignResponse;
        return this;
    }
    public UnsignWithholdAgreementResponseBodyWithholdSignResponse getWithholdSignResponse() {
        return this.withholdSignResponse;
    }

    public static class UnsignWithholdAgreementResponseBodyWithholdSignResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        public String outRequestNo;

        public static UnsignWithholdAgreementResponseBodyWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
            UnsignWithholdAgreementResponseBodyWithholdSignResponse self = new UnsignWithholdAgreementResponseBodyWithholdSignResponse();
            return TeaModel.build(map, self);
        }

        public UnsignWithholdAgreementResponseBodyWithholdSignResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

    }

}
