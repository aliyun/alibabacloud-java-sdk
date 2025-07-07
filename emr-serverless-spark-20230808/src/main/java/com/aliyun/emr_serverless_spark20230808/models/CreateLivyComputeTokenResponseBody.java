// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateLivyComputeTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateLivyComputeTokenResponseBodyData data;

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

    public static CreateLivyComputeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivyComputeTokenResponseBody self = new CreateLivyComputeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivyComputeTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLivyComputeTokenResponseBody setData(CreateLivyComputeTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLivyComputeTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateLivyComputeTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLivyComputeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLivyComputeTokenResponseBodyData extends TeaModel {
        /**
         * <p>Token ID。</p>
         * 
         * <strong>example:</strong>
         * <p>lctk-xxxxxxxx</p>
         */
        @NameInMap("tokenId")
        public String tokenId;

        public static CreateLivyComputeTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLivyComputeTokenResponseBodyData self = new CreateLivyComputeTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLivyComputeTokenResponseBodyData setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
