// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesResponseBody extends TeaModel {
    /**
     * <p>The certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenerCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenerCertificatesResponseBody self = new ListListenerCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenerCertificatesResponseBody setCertificates(java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public ListListenerCertificatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenerCertificatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenerCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenerCertificatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenerCertificatesResponseBodyCertificates extends TeaModel {
        /**
         * <p>The certificate ID. Only server certificates are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>12315790343_166f8204689_1714763408_70998****</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The type of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>Indicates whether the certificate is the default certificate of the listener. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>Indicates whether the certificate is associated with the listener. Valid values:</p>
         * <ul>
         * <li><strong>Associating</strong></li>
         * <li><strong>Associated</strong></li>
         * <li><strong>Diassociating</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Associating</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListListenerCertificatesResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListListenerCertificatesResponseBodyCertificates self = new ListListenerCertificatesResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public ListListenerCertificatesResponseBodyCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListListenerCertificatesResponseBodyCertificates setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListListenerCertificatesResponseBodyCertificates setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListListenerCertificatesResponseBodyCertificates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
