// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SecretCallStatusDTO")
    @Validation(required = true)
    public QueryCallStatusResponseSecretCallStatusDTO secretCallStatusDTO;

    public static QueryCallStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallStatusResponse self = new QueryCallStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallStatusResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallStatusResponse setSecretCallStatusDTO(QueryCallStatusResponseSecretCallStatusDTO secretCallStatusDTO) {
        this.secretCallStatusDTO = secretCallStatusDTO;
        return this;
    }
    public QueryCallStatusResponseSecretCallStatusDTO getSecretCallStatusDTO() {
        return this.secretCallStatusDTO;
    }

    public static class QueryCallStatusResponseSecretCallStatusDTO extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("CalledNo")
        @Validation(required = true)
        public String calledNo;

        public static QueryCallStatusResponseSecretCallStatusDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryCallStatusResponseSecretCallStatusDTO self = new QueryCallStatusResponseSecretCallStatusDTO();
            return TeaModel.build(map, self);
        }

        public QueryCallStatusResponseSecretCallStatusDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryCallStatusResponseSecretCallStatusDTO setCalledNo(String calledNo) {
            this.calledNo = calledNo;
            return this;
        }
        public String getCalledNo() {
            return this.calledNo;
        }

    }

}
