// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateNacUserCertStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Client error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Additional information about the result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNacUserCertStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacUserCertStatusResponseBody self = new UpdateNacUserCertStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNacUserCertStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateNacUserCertStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNacUserCertStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
