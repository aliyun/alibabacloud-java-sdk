// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRouteMapResponseBody extends TeaModel {
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
    public CreateErRouteMapResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
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

    public static CreateErRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateErRouteMapResponseBody self = new CreateErRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateErRouteMapResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateErRouteMapResponseBody setContent(CreateErRouteMapResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateErRouteMapResponseBodyContent getContent() {
        return this.content;
    }

    public CreateErRouteMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateErRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateErRouteMapResponseBodyContent extends TeaModel {
        /**
         * <p>routing policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-uwglhzom</p>
         */
        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        public static CreateErRouteMapResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateErRouteMapResponseBodyContent self = new CreateErRouteMapResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateErRouteMapResponseBodyContent setErRouteMapId(String erRouteMapId) {
            this.erRouteMapId = erRouteMapId;
            return this;
        }
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

    }

}
