// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateLivyComputeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateLivyComputeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateLivyComputeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivyComputeResponseBody self = new CreateLivyComputeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivyComputeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLivyComputeResponseBody setData(CreateLivyComputeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLivyComputeResponseBodyData getData() {
        return this.data;
    }

    public CreateLivyComputeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLivyComputeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLivyComputeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lc-i8xogcdfa4fk3yn1</p>
         */
        @NameInMap("livyComputeId")
        public String livyComputeId;

        public static CreateLivyComputeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLivyComputeResponseBodyData self = new CreateLivyComputeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLivyComputeResponseBodyData setLivyComputeId(String livyComputeId) {
            this.livyComputeId = livyComputeId;
            return this;
        }
        public String getLivyComputeId() {
            return this.livyComputeId;
        }

    }

}
