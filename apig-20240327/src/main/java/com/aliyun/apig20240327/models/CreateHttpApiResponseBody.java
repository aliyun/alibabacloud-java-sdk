// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiResponseBody extends TeaModel {
    /**
     * <p>API for testing</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>A protocol.</p>
     */
    @NameInMap("data")
    public CreateHttpApiResponseBodyData data;

    /**
     * <p>The protocol list for API access.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The API description.</p>
     * 
     * <strong>example:</strong>
     * <p>A1994B10-C6A8-58FA-8347-6A08B0D4EFDE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiResponseBody self = new CreateHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateHttpApiResponseBody setData(CreateHttpApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateHttpApiResponseBodyData getData() {
        return this.data;
    }

    public CreateHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateHttpApiResponseBodyData extends TeaModel {
        /**
         * <p>HTTP API ID。</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("httpApiId")
        public String httpApiId;

        /**
         * <p>The API base path, which must start with a forward slash (/).</p>
         * 
         * <strong>example:</strong>
         * <p>test-api</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateHttpApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateHttpApiResponseBodyData self = new CreateHttpApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateHttpApiResponseBodyData setHttpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }
        public String getHttpApiId() {
            return this.httpApiId;
        }

        public CreateHttpApiResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
