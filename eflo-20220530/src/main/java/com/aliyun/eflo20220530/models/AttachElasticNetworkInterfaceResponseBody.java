// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AttachElasticNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why the access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
     * <p>[]</p>
     */
    @NameInMap("Content")
    public Object content;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>039C3C3A-3C37-5672-80D5-D8CD48C676D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachElasticNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachElasticNetworkInterfaceResponseBody self = new AttachElasticNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachElasticNetworkInterfaceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AttachElasticNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AttachElasticNetworkInterfaceResponseBody setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public AttachElasticNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AttachElasticNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
