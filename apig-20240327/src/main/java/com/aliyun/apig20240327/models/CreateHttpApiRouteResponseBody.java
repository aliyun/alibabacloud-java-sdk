// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRouteResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public CreateHttpApiRouteResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateHttpApiRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiRouteResponseBody self = new CreateHttpApiRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHttpApiRouteResponseBody setData(CreateHttpApiRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateHttpApiRouteResponseBodyData getData() {
        return this.data;
    }

    public CreateHttpApiRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHttpApiRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateHttpApiRouteResponseBodyData extends TeaModel {
        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgrlej***</p>
         */
        @NameInMap("routeId")
        public String routeId;

        public static CreateHttpApiRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiRouteResponseBodyData self = new CreateHttpApiRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiRouteResponseBodyData setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
