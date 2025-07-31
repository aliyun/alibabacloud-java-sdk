// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResult")
    public CreateComputeSourceResponseBodyCreateResult createResult;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateComputeSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeSourceResponseBody self = new CreateComputeSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateComputeSourceResponseBody setCreateResult(CreateComputeSourceResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateComputeSourceResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateComputeSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateComputeSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateComputeSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComputeSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateComputeSourceResponseBodyCreateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12356</p>
         */
        @NameInMap("Id")
        public Long id;

        public static CreateComputeSourceResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeSourceResponseBodyCreateResult self = new CreateComputeSourceResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateComputeSourceResponseBodyCreateResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
