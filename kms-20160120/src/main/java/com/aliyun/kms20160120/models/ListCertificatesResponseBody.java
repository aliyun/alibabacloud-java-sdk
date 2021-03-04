// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListCertificatesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CertificateSummaryList")
    public ListCertificatesResponseBodyCertificateSummaryList certificateSummaryList;

    @NameInMap("TotalSize")
    public Integer totalSize;

    public static ListCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesResponseBody self = new ListCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertificatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertificatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCertificatesResponseBody setCertificateSummaryList(ListCertificatesResponseBodyCertificateSummaryList certificateSummaryList) {
        this.certificateSummaryList = certificateSummaryList;
        return this;
    }
    public ListCertificatesResponseBodyCertificateSummaryList getCertificateSummaryList() {
        return this.certificateSummaryList;
    }

    public ListCertificatesResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListCertificatesResponseBodyCertificateSummaryListCertificateSummary extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("KeySpec")
        public String keySpec;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("NotBefore")
        public String notBefore;

        @NameInMap("NotAfter")
        public String notAfter;

        @NameInMap("CertificateId")
        public String certificateId;

        public static ListCertificatesResponseBodyCertificateSummaryListCertificateSummary build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyCertificateSummaryListCertificateSummary self = new ListCertificatesResponseBodyCertificateSummaryListCertificateSummary();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setKeySpec(String keySpec) {
            this.keySpec = keySpec;
            return this;
        }
        public String getKeySpec() {
            return this.keySpec;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListCertificatesResponseBodyCertificateSummaryListCertificateSummary setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class ListCertificatesResponseBodyCertificateSummaryList extends TeaModel {
        @NameInMap("CertificateSummary")
        public java.util.List<ListCertificatesResponseBodyCertificateSummaryListCertificateSummary> certificateSummary;

        public static ListCertificatesResponseBodyCertificateSummaryList build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyCertificateSummaryList self = new ListCertificatesResponseBodyCertificateSummaryList();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyCertificateSummaryList setCertificateSummary(java.util.List<ListCertificatesResponseBodyCertificateSummaryListCertificateSummary> certificateSummary) {
            this.certificateSummary = certificateSummary;
            return this;
        }
        public java.util.List<ListCertificatesResponseBodyCertificateSummaryListCertificateSummary> getCertificateSummary() {
            return this.certificateSummary;
        }

    }

}
