// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ApplyCertificateResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of free certificate application details.</p>
     */
    @NameInMap("Result")
    public java.util.List<ApplyCertificateResponseBodyResult> result;

    /**
     * <p>Site name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>Number of certificates applied for, which is the same as the number of input domains.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ApplyCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificateResponseBody self = new ApplyCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyCertificateResponseBody setResult(java.util.List<ApplyCertificateResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ApplyCertificateResponseBodyResult> getResult() {
        return this.result;
    }

    public ApplyCertificateResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ApplyCertificateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ApplyCertificateResponseBodyResult extends TeaModel {
        /**
         * <p>Certificate domain.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000478</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Status of the certificate application.</p>
         * 
         * <strong>example:</strong>
         * <p>Applying</p>
         */
        @NameInMap("Status")
        public String status;

        public static ApplyCertificateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ApplyCertificateResponseBodyResult self = new ApplyCertificateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ApplyCertificateResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ApplyCertificateResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ApplyCertificateResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
