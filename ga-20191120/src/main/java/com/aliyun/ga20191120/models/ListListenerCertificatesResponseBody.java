// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

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
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6092**-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The domain name associated with the additional certificate.</p>
         * <p>This parameter is not returned if the certificate is a default one.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the certificate is a default one.</p>
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
         * <p>The status of the certificate.</p>
         * <ul>
         * <li><strong>active</strong>: The certificate is associated with a listener and in effect.</li>
         * <li><strong>updating</strong>: The additional certificate is being replaced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

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

        public ListListenerCertificatesResponseBodyCertificates setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListListenerCertificatesResponseBodyCertificates setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListListenerCertificatesResponseBodyCertificates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
