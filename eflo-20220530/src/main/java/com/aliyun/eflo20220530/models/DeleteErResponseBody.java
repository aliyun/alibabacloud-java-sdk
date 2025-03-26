// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response body</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Content")
    public Object content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
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
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteErResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteErResponseBody self = new DeleteErResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteErResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteErResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteErResponseBody setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public DeleteErResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteErResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
