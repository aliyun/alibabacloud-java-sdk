// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTrademarkResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li>If OK is returned, the request was successful.</li>
     * <li>For other error codes, see the error code list in this topic or <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The trademark ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000*******</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The description of the status code.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSmsTrademarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTrademarkResponseBody self = new CreateSmsTrademarkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsTrademarkResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateSmsTrademarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSmsTrademarkResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSmsTrademarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSmsTrademarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmsTrademarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
