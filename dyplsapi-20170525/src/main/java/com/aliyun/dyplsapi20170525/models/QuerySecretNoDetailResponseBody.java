// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoDetailResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li>OK indicates that the request was successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the status code.</p>
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
     * <p>066E6E47-04CB-4774-A976-4F73CB76D4A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number properties.</p>
     */
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
        /**
         * <p>The number verification status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unverified.</li>
         * <li><strong>1</strong>: Verified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CertifyStatus")
        public Integer certifyStatus;

        /**
         * <p>The city.</p>
         * 
         * <strong>example:</strong>
         * <p>Xi\&quot;an</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The province.</p>
         * 
         * <strong>example:</strong>
         * <p>Shaanxi</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The purchase time of the number, in the format of YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-03 15:19:27</p>
         */
        @NameInMap("PurchaseTime")
        public String purchaseTime;

        /**
         * <p>The number status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unbound.</li>
         * <li><strong>1</strong>: Bound.</li>
         * <li><strong>2</strong>: Locked.</li>
         * <li><strong>3</strong>: Frozen.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecretStatus")
        public Long secretStatus;

        /**
         * <p>The carrier. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: China Mobile</li>
         * <li><strong>2</strong>: China Unicom</li>
         * <li><strong>3</strong>: China Telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
