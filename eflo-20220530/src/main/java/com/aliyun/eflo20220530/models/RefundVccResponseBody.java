// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class RefundVccResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * <blockquote>
     * <p> This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response content</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public Object content;

    /**
     * <p>Response message, which is \&quot;success\&quot; if the request succeeds</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefundVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundVccResponseBody self = new RefundVccResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundVccResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RefundVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RefundVccResponseBody setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public RefundVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefundVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
