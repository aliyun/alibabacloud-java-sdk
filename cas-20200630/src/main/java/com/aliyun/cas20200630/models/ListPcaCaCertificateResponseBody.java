// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListPcaCaCertificateResponseBody extends TeaModel {
    /**
     * <p>The list of CA certificates.</p>
     */
    @NameInMap("List")
    public java.util.List<ListPcaCaCertificateResponseBodyList> list;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. Leave this parameter empty to start the query from the first page. If this parameter is not returned, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the result set.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPcaCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPcaCaCertificateResponseBody self = new ListPcaCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPcaCaCertificateResponseBody setList(java.util.List<ListPcaCaCertificateResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListPcaCaCertificateResponseBodyList> getList() {
        return this.list;
    }

    public ListPcaCaCertificateResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPcaCaCertificateResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPcaCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPcaCaCertificateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPcaCaCertificateResponseBodyList extends TeaModel {
        /**
         * <p>The certificate identifier. Use this identifier to query certificate details.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef78be5-******-b5ef0f0eba3d</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The common name of the certificate. This value matches the CommonName field in the certificate Subject.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Co., Ltd.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The identifier of the issuer certificate. Use this identifier to query the issuer certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef78be5-******-b5ef0f0eba3d</p>
         */
        @NameInMap("IssuerIdentifier")
        public String issuerIdentifier;

        /**
         * <p>The ID of the private CA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cas_deposit-cn-******</p>
         */
        @NameInMap("PrivateCaInstanceId")
        public String privateCaInstanceId;

        /**
         * <p>The region ID of the private CA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PrivateCaRegionId")
        public String privateCaRegionId;

        /**
         * <p>The certificate status.</p>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>166********</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListPcaCaCertificateResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListPcaCaCertificateResponseBodyList self = new ListPcaCaCertificateResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListPcaCaCertificateResponseBodyList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListPcaCaCertificateResponseBodyList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListPcaCaCertificateResponseBodyList setIssuerIdentifier(String issuerIdentifier) {
            this.issuerIdentifier = issuerIdentifier;
            return this;
        }
        public String getIssuerIdentifier() {
            return this.issuerIdentifier;
        }

        public ListPcaCaCertificateResponseBodyList setPrivateCaInstanceId(String privateCaInstanceId) {
            this.privateCaInstanceId = privateCaInstanceId;
            return this;
        }
        public String getPrivateCaInstanceId() {
            return this.privateCaInstanceId;
        }

        public ListPcaCaCertificateResponseBodyList setPrivateCaRegionId(String privateCaRegionId) {
            this.privateCaRegionId = privateCaRegionId;
            return this;
        }
        public String getPrivateCaRegionId() {
            return this.privateCaRegionId;
        }

        public ListPcaCaCertificateResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPcaCaCertificateResponseBodyList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
