// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1E75E69-3049-5FDB-A376-D745837CD2B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>FC10001287****</p>
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
