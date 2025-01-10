// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Content")
    public CreateVccRouteEntryResponseBodyContent content;

    /**
     * <p>The returned message.</p>
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

    public static CreateVccRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRouteEntryResponseBody self = new CreateVccRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVccRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVccRouteEntryResponseBody setContent(CreateVccRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVccRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVccRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVccRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVccRouteEntryResponseBodyContent extends TeaModel {
        /**
         * <p>The ID of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-rte-5cey1sap</p>
         */
        @NameInMap("VccRouteEntryId")
        public String vccRouteEntryId;

        public static CreateVccRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVccRouteEntryResponseBodyContent self = new CreateVccRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVccRouteEntryResponseBodyContent setVccRouteEntryId(String vccRouteEntryId) {
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }
        public String getVccRouteEntryId() {
            return this.vccRouteEntryId;
        }

    }

}
