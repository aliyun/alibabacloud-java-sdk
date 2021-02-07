// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretRemainDTO")
    public QuerySecretNoRemainResponseBodySecretRemainDTO secretRemainDTO;

    @NameInMap("Code")
    public String code;

    public static QuerySecretNoRemainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoRemainResponseBody self = new QuerySecretNoRemainResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoRemainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecretNoRemainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecretNoRemainResponseBody setSecretRemainDTO(QuerySecretNoRemainResponseBodySecretRemainDTO secretRemainDTO) {
        this.secretRemainDTO = secretRemainDTO;
        return this;
    }
    public QuerySecretNoRemainResponseBodySecretRemainDTO getSecretRemainDTO() {
        return this.secretRemainDTO;
    }

    public QuerySecretNoRemainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("City")
        public String city;

        public static QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO self = new QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

    }

    public static class QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList extends TeaModel {
        @NameInMap("remainDTO")
        public java.util.List<QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO> remainDTO;

        public static QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList self = new QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList setRemainDTO(java.util.List<QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO> remainDTO) {
            this.remainDTO = remainDTO;
            return this;
        }
        public java.util.List<QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO> getRemainDTO() {
            return this.remainDTO;
        }

    }

    public static class QuerySecretNoRemainResponseBodySecretRemainDTO extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("City")
        public String city;

        @NameInMap("RemainDTOList")
        public QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList remainDTOList;

        public static QuerySecretNoRemainResponseBodySecretRemainDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoRemainResponseBodySecretRemainDTO self = new QuerySecretNoRemainResponseBodySecretRemainDTO();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoRemainResponseBodySecretRemainDTO setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QuerySecretNoRemainResponseBodySecretRemainDTO setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QuerySecretNoRemainResponseBodySecretRemainDTO setRemainDTOList(QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList remainDTOList) {
            this.remainDTOList = remainDTOList;
            return this;
        }
        public QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOList getRemainDTOList() {
            return this.remainDTOList;
        }

    }

}
