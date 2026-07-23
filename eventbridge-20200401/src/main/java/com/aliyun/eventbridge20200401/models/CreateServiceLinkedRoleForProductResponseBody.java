// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForProductResponseBody extends TeaModel {
    /**
     * <p>The status code of the request. \<code>Success\\</code> indicates that the request was successful. For more information about error codes, see the Error codes section.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: a 2xx status code.</p>
     * </li>
     * <li><p><strong>3xx</strong>: a 3xx status code.</p>
     * </li>
     * <li><p><strong>4xx</strong>: a 4xx status code.</p>
     * </li>
     * <li><p><strong>5xx</strong>: a 5xx status code.</p>
     * </li>
     * </ul>
     * <p>If this parameter is not specified, all HTTP status codes are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Integer httpCode;

    /**
     * <p>The returned message. If the request is successful, \<code>success\\</code> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C36345A1-75F3-5A1A-BFCF-33B8271971FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. If the request is successful, \<code>true\\</code> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceLinkedRoleForProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForProductResponseBody self = new CreateServiceLinkedRoleForProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceLinkedRoleForProductResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateServiceLinkedRoleForProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceLinkedRoleForProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceLinkedRoleForProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
