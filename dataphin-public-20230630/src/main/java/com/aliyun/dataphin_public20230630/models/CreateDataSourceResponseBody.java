// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResult")
    public CreateDataSourceResponseBodyCreateResult createResult;

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
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponseBody self = new CreateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDataSourceResponseBody setCreateResult(CreateDataSourceResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateDataSourceResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateDataSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataSourceResponseBodyCreateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DevDataSourceId")
        public Long devDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProdDataSourceId")
        public Long prodDataSourceId;

        public static CreateDataSourceResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceResponseBodyCreateResult self = new CreateDataSourceResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceResponseBodyCreateResult setDevDataSourceId(Long devDataSourceId) {
            this.devDataSourceId = devDataSourceId;
            return this;
        }
        public Long getDevDataSourceId() {
            return this.devDataSourceId;
        }

        public CreateDataSourceResponseBodyCreateResult setProdDataSourceId(Long prodDataSourceId) {
            this.prodDataSourceId = prodDataSourceId;
            return this;
        }
        public Long getProdDataSourceId() {
            return this.prodDataSourceId;
        }

    }

}
