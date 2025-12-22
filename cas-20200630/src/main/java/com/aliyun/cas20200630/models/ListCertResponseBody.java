// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCertResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<ListCertResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertResponseBody self = new ListCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCertResponseBody setList(java.util.List<ListCertResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListCertResponseBodyList> getList() {
        return this.list;
    }

    public ListCertResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCertResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCertResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListCertResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-05-13 12:59:45</p>
         */
        @NameInMap("AfterDate")
        public String afterDate;

        /**
         * <strong>example:</strong>
         * <p>1728921600000</p>
         */
        @NameInMap("AfterTime")
        public Long afterTime;

        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <strong>example:</strong>
         * <p>2026-05-19</p>
         */
        @NameInMap("BeforeDate")
        public String beforeDate;

        /**
         * <strong>example:</strong>
         * <p>1728921600000</p>
         */
        @NameInMap("BeforeTime")
        public Long beforeTime;

        /**
         * <strong>example:</strong>
         * <p>Server</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.kfsjn.xyz">www.kfsjn.xyz</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("CustomIdentifier")
        public String customIdentifier;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;APP_PFHMIGUHKDUW6S3N7ZL2\&quot;}</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>1806958</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1ef539a8-1e1f-6b88-8c11-21cf01a203e9</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("KeyExportable")
        public Boolean keyExportable;

        @NameInMap("Organization")
        public String organization;

        /**
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <strong>example:</strong>
         * <p>3a3ee3c3597d675e</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>SubjectDn</p>
         */
        @NameInMap("SubjectDn")
        public String subjectDn;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static ListCertResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListCertResponseBodyList self = new ListCertResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListCertResponseBodyList setAfterDate(String afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public String getAfterDate() {
            return this.afterDate;
        }

        public ListCertResponseBodyList setAfterTime(Long afterTime) {
            this.afterTime = afterTime;
            return this;
        }
        public Long getAfterTime() {
            return this.afterTime;
        }

        public ListCertResponseBodyList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListCertResponseBodyList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListCertResponseBodyList setBeforeDate(String beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public String getBeforeDate() {
            return this.beforeDate;
        }

        public ListCertResponseBodyList setBeforeTime(Long beforeTime) {
            this.beforeTime = beforeTime;
            return this;
        }
        public Long getBeforeTime() {
            return this.beforeTime;
        }

        public ListCertResponseBodyList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListCertResponseBodyList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCertResponseBodyList setCustomIdentifier(String customIdentifier) {
            this.customIdentifier = customIdentifier;
            return this;
        }
        public String getCustomIdentifier() {
            return this.customIdentifier;
        }

        public ListCertResponseBodyList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListCertResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCertResponseBodyList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListCertResponseBodyList setKeyExportable(Boolean keyExportable) {
            this.keyExportable = keyExportable;
            return this;
        }
        public Boolean getKeyExportable() {
            return this.keyExportable;
        }

        public ListCertResponseBodyList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public ListCertResponseBodyList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public ListCertResponseBodyList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListCertResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCertResponseBodyList setSubjectDn(String subjectDn) {
            this.subjectDn = subjectDn;
            return this;
        }
        public String getSubjectDn() {
            return this.subjectDn;
        }

        public ListCertResponseBodyList setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
