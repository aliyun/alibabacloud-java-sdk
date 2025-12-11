// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateSourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceResponseBody self = new CreateSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSourceResponseBody setData(CreateSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>src-crdddallhtgt***</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        public static CreateSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSourceResponseBodyData self = new CreateSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSourceResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

}
