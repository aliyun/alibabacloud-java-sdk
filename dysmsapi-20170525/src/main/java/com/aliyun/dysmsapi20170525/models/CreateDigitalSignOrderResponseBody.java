// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSignOrderResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if the RAM user is not authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * <ul>
     * <li><p>If the request is successful, <code>OK</code> is returned.</p>
     * </li>
     * <li><p>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * <ul>
     * <li><p><code>signName</code>: The name of the signature.</p>
     * </li>
     * <li><p><code>signOrderId</code>: The ID of the signature order.</p>
     * </li>
     * <li><p><code>signCode</code>: The code of the signature.</p>
     * </li>
     * <li><p><code>signId</code>: The ID of the signature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;signId\&quot;: \&quot;2006746****\&quot;, \&quot;signCode\&quot;: \&quot;SIGN_100000184736042_174416475****_hpMd1\&quot;, \&quot;signOrderId\&quot;: 2246979****, \&quot;signName\&quot;: u\&quot;\u8d5b\u745e\u5a05\u808c\u80a4\u7ba1\u7406\&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D0133B9-6C0D-0BAE-8161-1EEF9E2D4069</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDigitalSignOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSignOrderResponseBody self = new CreateDigitalSignOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSignOrderResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateDigitalSignOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDigitalSignOrderResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public CreateDigitalSignOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDigitalSignOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDigitalSignOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
