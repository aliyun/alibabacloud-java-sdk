// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GateVerifySchemeDTO")
    public CreateVerifySchemeResponseBodyGateVerifySchemeDTO gateVerifySchemeDTO;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateVerifySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySchemeResponseBody self = new CreateVerifySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVerifySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVerifySchemeResponseBody setGateVerifySchemeDTO(CreateVerifySchemeResponseBodyGateVerifySchemeDTO gateVerifySchemeDTO) {
        this.gateVerifySchemeDTO = gateVerifySchemeDTO;
        return this;
    }
    public CreateVerifySchemeResponseBodyGateVerifySchemeDTO getGateVerifySchemeDTO() {
        return this.gateVerifySchemeDTO;
    }

    public CreateVerifySchemeResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateVerifySchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVerifySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVerifySchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateVerifySchemeResponseBodyGateVerifySchemeDTO extends TeaModel {
        @NameInMap("SchemeCode")
        public String schemeCode;

        public static CreateVerifySchemeResponseBodyGateVerifySchemeDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateVerifySchemeResponseBodyGateVerifySchemeDTO self = new CreateVerifySchemeResponseBodyGateVerifySchemeDTO();
            return TeaModel.build(map, self);
        }

        public CreateVerifySchemeResponseBodyGateVerifySchemeDTO setSchemeCode(String schemeCode) {
            this.schemeCode = schemeCode;
            return this;
        }
        public String getSchemeCode() {
            return this.schemeCode;
        }

    }

}
