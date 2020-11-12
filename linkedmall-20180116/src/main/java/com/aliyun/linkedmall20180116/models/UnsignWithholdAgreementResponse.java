// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnsignWithholdAgreementResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WithholdSignResponse")
    @Validation(required = true)
    public UnsignWithholdAgreementResponseWithholdSignResponse withholdSignResponse;

    public static UnsignWithholdAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsignWithholdAgreementResponse self = new UnsignWithholdAgreementResponse();
        return TeaModel.build(map, self);
    }

    public UnsignWithholdAgreementResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnsignWithholdAgreementResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnsignWithholdAgreementResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnsignWithholdAgreementResponse setWithholdSignResponse(UnsignWithholdAgreementResponseWithholdSignResponse withholdSignResponse) {
        this.withholdSignResponse = withholdSignResponse;
        return this;
    }
    public UnsignWithholdAgreementResponseWithholdSignResponse getWithholdSignResponse() {
        return this.withholdSignResponse;
    }

    public static class UnsignWithholdAgreementResponseWithholdSignResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        @Validation(required = true)
        public String outRequestNo;

        public static UnsignWithholdAgreementResponseWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
            UnsignWithholdAgreementResponseWithholdSignResponse self = new UnsignWithholdAgreementResponseWithholdSignResponse();
            return TeaModel.build(map, self);
        }

        public UnsignWithholdAgreementResponseWithholdSignResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

    }

}
