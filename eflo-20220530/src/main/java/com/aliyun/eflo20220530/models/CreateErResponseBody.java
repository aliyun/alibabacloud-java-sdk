// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the failed permission verification.</p>
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
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public CreateErResponseBodyContent content;

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
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateErResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateErResponseBody self = new CreateErResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateErResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateErResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateErResponseBody setContent(CreateErResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateErResponseBodyContent getContent() {
        return this.content;
    }

    public CreateErResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateErResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateErResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun HUB ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-aueyxxsy</p>
         */
        @NameInMap("ErId")
        public String erId;

        public static CreateErResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateErResponseBodyContent self = new CreateErResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateErResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

    }

}
