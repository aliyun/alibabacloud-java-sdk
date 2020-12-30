// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("SecretCallStatusDTO")
    public QueryCallStatusResponseBodySecretCallStatusDTO secretCallStatusDTO;

    public static QueryCallStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallStatusResponseBody self = new QueryCallStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallStatusResponseBody setSecretCallStatusDTO(QueryCallStatusResponseBodySecretCallStatusDTO secretCallStatusDTO) {
        this.secretCallStatusDTO = secretCallStatusDTO;
        return this;
    }
    public QueryCallStatusResponseBodySecretCallStatusDTO getSecretCallStatusDTO() {
        return this.secretCallStatusDTO;
    }

    public static class QueryCallStatusResponseBodySecretCallStatusDTO extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("CalledNo")
        public String calledNo;

        public static QueryCallStatusResponseBodySecretCallStatusDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryCallStatusResponseBodySecretCallStatusDTO self = new QueryCallStatusResponseBodySecretCallStatusDTO();
            return TeaModel.build(map, self);
        }

        public QueryCallStatusResponseBodySecretCallStatusDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryCallStatusResponseBodySecretCallStatusDTO setCalledNo(String calledNo) {
            this.calledNo = calledNo;
            return this;
        }
        public String getCalledNo() {
            return this.calledNo;
        }

    }

}
