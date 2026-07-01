// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class RequiredPhoneCodeResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li>OK indicates that the request was successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This field is not returned and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
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
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation call is successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RequiredPhoneCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequiredPhoneCodeResponseBody self = new RequiredPhoneCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RequiredPhoneCodeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RequiredPhoneCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RequiredPhoneCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RequiredPhoneCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RequiredPhoneCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequiredPhoneCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
