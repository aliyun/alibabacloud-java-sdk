// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListSslCertsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Items")
    public java.util.List<ListSslCertsResponseBodyItems> items;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>req-123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSslCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSslCertsResponseBody self = new ListSslCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSslCertsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSslCertsResponseBody setItems(java.util.List<ListSslCertsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSslCertsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSslCertsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSslCertsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSslCertsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSslCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSslCertsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSslCertsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSslCertsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <strong>example:</strong>
         * <p>22584627-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <strong>example:</strong>
         * <p>example-cert</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChainCompleted")
        public Boolean chainCompleted;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>1893456000000</p>
         */
        @NameInMap("NotAfterTimestamp")
        public Long notAfterTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1704067200000</p>
         */
        @NameInMap("NotBeforeTimestamp")
        public Long notBeforeTimestamp;

        public static ListSslCertsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSslCertsResponseBodyItems self = new ListSslCertsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSslCertsResponseBodyItems setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListSslCertsResponseBodyItems setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public ListSslCertsResponseBodyItems setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListSslCertsResponseBodyItems setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListSslCertsResponseBodyItems setChainCompleted(Boolean chainCompleted) {
            this.chainCompleted = chainCompleted;
            return this;
        }
        public Boolean getChainCompleted() {
            return this.chainCompleted;
        }

        public ListSslCertsResponseBodyItems setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListSslCertsResponseBodyItems setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListSslCertsResponseBodyItems setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListSslCertsResponseBodyItems setNotAfterTimestamp(Long notAfterTimestamp) {
            this.notAfterTimestamp = notAfterTimestamp;
            return this;
        }
        public Long getNotAfterTimestamp() {
            return this.notAfterTimestamp;
        }

        public ListSslCertsResponseBodyItems setNotBeforeTimestamp(Long notBeforeTimestamp) {
            this.notBeforeTimestamp = notBeforeTimestamp;
            return this;
        }
        public Long getNotBeforeTimestamp() {
            return this.notBeforeTimestamp;
        }

    }

}
