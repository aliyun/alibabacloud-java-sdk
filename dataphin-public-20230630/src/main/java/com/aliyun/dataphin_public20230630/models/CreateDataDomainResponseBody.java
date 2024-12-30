// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResult")
    public CreateDataDomainResponseBodyCreateResult createResult;

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

    @NameInMap("Success")
    public Boolean success;

    public static CreateDataDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDomainResponseBody self = new CreateDataDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDataDomainResponseBody setCreateResult(CreateDataDomainResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateDataDomainResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateDataDomainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDataDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDataDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataDomainResponseBodyCreateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        public static CreateDataDomainResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataDomainResponseBodyCreateResult self = new CreateDataDomainResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateDataDomainResponseBodyCreateResult setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

    }

}
