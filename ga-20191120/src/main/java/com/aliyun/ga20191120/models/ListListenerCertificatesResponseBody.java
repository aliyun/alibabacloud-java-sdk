// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesResponseBody extends TeaModel {
    @NameInMap("Certificates")
    public java.util.List<ListListenerCertificatesResponseBodyCertificates> certificates;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("IsDefault")
        public Boolean isDefault;

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
