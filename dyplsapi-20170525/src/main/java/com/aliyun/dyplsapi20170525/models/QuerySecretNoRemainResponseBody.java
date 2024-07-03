// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9FC30594-3841-43AD-9008-03393BCB5CD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information returned after the operation was called.</p>
     */
    @NameInMap("SecretRemainDTO")
    public QuerySecretNoRemainResponseBodySecretRemainDTO secretRemainDTO;

    public static QuerySecretNoRemainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoRemainResponseBody self = new QuerySecretNoRemainResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoRemainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public static class QuerySecretNoRemainResponseBodySecretRemainDTORemainDTOListRemainDTO extends TeaModel {
        /**
         * <p>The quantity of remaining phone numbers available for online purchase for the city.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>The home location of the phone numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>Wuhan</p>
         */
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
        /**
         * <p>The quantity of remaining phone numbers available for online purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>The home location of the phone numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The information about remaining phone numbers available for online purchase.</p>
         */
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
