// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizEntityResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("CreateResult")
    public CreateBizEntityResponseBodyCreateResult createResult;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateBizEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBizEntityResponseBody self = new CreateBizEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBizEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBizEntityResponseBody setCreateResult(CreateBizEntityResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateBizEntityResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateBizEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBizEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBizEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBizEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBizEntityResponseBodyCreateResult extends TeaModel {
        /**
         * <p>The ID of the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("BizEntityId")
        public Long bizEntityId;

        public static CreateBizEntityResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateBizEntityResponseBodyCreateResult self = new CreateBizEntityResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateBizEntityResponseBodyCreateResult setBizEntityId(Long bizEntityId) {
            this.bizEntityId = bizEntityId;
            return this;
        }
        public Long getBizEntityId() {
            return this.bizEntityId;
        }

    }

}
