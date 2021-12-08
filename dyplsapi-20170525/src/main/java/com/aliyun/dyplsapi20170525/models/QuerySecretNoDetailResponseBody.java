// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretNoInfoDTO")
    public QuerySecretNoDetailResponseBodySecretNoInfoDTO secretNoInfoDTO;

    public static QuerySecretNoDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoDetailResponseBody self = new QuerySecretNoDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecretNoDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecretNoDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecretNoDetailResponseBody setSecretNoInfoDTO(QuerySecretNoDetailResponseBodySecretNoInfoDTO secretNoInfoDTO) {
        this.secretNoInfoDTO = secretNoInfoDTO;
        return this;
    }
    public QuerySecretNoDetailResponseBodySecretNoInfoDTO getSecretNoInfoDTO() {
        return this.secretNoInfoDTO;
    }

    public static class QuerySecretNoDetailResponseBodySecretNoInfoDTO extends TeaModel {
        @NameInMap("CertifyStatus")
        public Integer certifyStatus;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        @NameInMap("PurchaseTime")
        public String purchaseTime;

        @NameInMap("SecretStatus")
        public Long secretStatus;

        @NameInMap("Vendor")
        public Long vendor;

        public static QuerySecretNoDetailResponseBodySecretNoInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretNoDetailResponseBodySecretNoInfoDTO self = new QuerySecretNoDetailResponseBodySecretNoInfoDTO();
            return TeaModel.build(map, self);
        }

        public QuerySecretNoDetailResponseBodySecretNoInfoDTO setCertifyStatus(Integer certifyStatus) {
            this.certifyStatus = certifyStatus;
            return this;
        }
        public Integer getCertifyStatus() {
            return this.certifyStatus;
        }

        public QuerySecretNoDetailResponseBodySecretNoInfoDTO setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QuerySecretNoDetailResponseBodySecretNoInfoDTO setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QuerySecretNoDetailResponseBodySecretNoInfoDTO setPurchaseTime(String purchaseTime) {
            this.purchaseTime = purchaseTime;
            return this;
        }
        public String getPurchaseTime() {
            return this.purchaseTime;
        }

        public QuerySecretNoDetailResponseBodySecretNoInfoDTO setSecretStatus(Long secretStatus) {
            this.secretStatus = secretStatus;
            return this;
        }
        public Long getSecretStatus() {
            return this.secretStatus;
        }

        public QuerySecretNoDetailResponseBodySecretNoInfoDTO setVendor(Long vendor) {
            this.vendor = vendor;
            return this;
        }
        public Long getVendor() {
            return this.vendor;
        }

    }

}
