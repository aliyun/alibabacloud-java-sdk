// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAppIcpRecordResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A value of <code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see the <a href="https://help.aliyun.com/document_detail/101346.html">error code list</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the app\&quot;s ICP filing record.</p>
     * 
     * <strong>example:</strong>
     * <p>10000*******</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned with the request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud generates this unique identifier for each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><p><strong><code>true</code></strong></p>
     * </li>
     * <li><p><strong><code>false</code></strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSmsAppIcpRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsAppIcpRecordResponseBody self = new CreateSmsAppIcpRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsAppIcpRecordResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateSmsAppIcpRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSmsAppIcpRecordResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSmsAppIcpRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSmsAppIcpRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmsAppIcpRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
