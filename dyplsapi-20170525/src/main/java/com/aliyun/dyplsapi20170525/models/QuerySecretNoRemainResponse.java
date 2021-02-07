// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SecretRemainDTO")
    @Validation(required = true)
    public QuerySecretNoRemainResponseSecretRemainDTO secretRemainDTO;

    public static QuerySecretNoRemainResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoRemainResponse self = new QuerySecretNoRemainResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoRemainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecretNoRemainResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecretNoRemainResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecretNoRemainResponse setSecretRemainDTO(QuerySecretNoRemainResponseSecretRemainDTO secretRemainDTO) {
        this.secretRemainDTO = secretRemainDTO;
        return this;
    }
    public QuerySecretNoRemainResponseSecretRemainDTO getSecretRemainDTO() {
        return this.secretRemainDTO;
    }

    public static class QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO extends TeaModel {
        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("Amount")
        @Validation(required = true)
        public Long amount;

        public static QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO self = new QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

    }

    public static class QuerySecretNoRemainResponseSecretRemainDTORemainDTOList extends TeaModel {
        @NameInMap("remainDTO")
        @Validation(required = true)
        public java.util.List<QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO> remainDTO;

        public static QuerySecretNoRemainResponseSecretRemainDTORemainDTOList build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoRemainResponseSecretRemainDTORemainDTOList self = new QuerySecretNoRemainResponseSecretRemainDTORemainDTOList();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoRemainResponseSecretRemainDTORemainDTOList setRemainDTO(java.util.List<QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO> remainDTO) {
            this.remainDTO = remainDTO;
            return this;
        }
        public java.util.List<QuerySecretNoRemainResponseSecretRemainDTORemainDTOListRemainDTO> getRemainDTO() {
            return this.remainDTO;
        }

    }

    public static class QuerySecretNoRemainResponseSecretRemainDTO extends TeaModel {
        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("Amount")
        @Validation(required = true)
        public Long amount;

        @NameInMap("RemainDTOList")
        @Validation(required = true)
        public QuerySecretNoRemainResponseSecretRemainDTORemainDTOList remainDTOList;

        public static QuerySecretNoRemainResponseSecretRemainDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoRemainResponseSecretRemainDTO self = new QuerySecretNoRemainResponseSecretRemainDTO();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoRemainResponseSecretRemainDTO setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QuerySecretNoRemainResponseSecretRemainDTO setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QuerySecretNoRemainResponseSecretRemainDTO setRemainDTOList(QuerySecretNoRemainResponseSecretRemainDTORemainDTOList remainDTOList) {
            this.remainDTOList = remainDTOList;
            return this;
        }
        public QuerySecretNoRemainResponseSecretRemainDTORemainDTOList getRemainDTOList() {
            return this.remainDTOList;
        }

    }

}
