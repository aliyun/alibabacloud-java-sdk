// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   If OK is returned, the request is successful.</p>
     * <p>*   For more information about other error codes, see [API response codes](~~85198~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("GateVerifySchemeDTO")
    public CreateVerifySchemeResponseBodyGateVerifySchemeDTO gateVerifySchemeDTO;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The service code.</p>
         */
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
