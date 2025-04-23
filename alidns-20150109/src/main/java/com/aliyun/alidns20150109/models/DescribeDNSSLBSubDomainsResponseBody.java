// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The subdomains for which weighted round-robin is enabled.</p>
     */
    @NameInMap("SlbSubDomains")
    public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains slbSubDomains;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDNSSLBSubDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsResponseBody self = new DescribeDNSSLBSubDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDNSSLBSubDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDNSSLBSubDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDNSSLBSubDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDNSSLBSubDomainsResponseBody setSlbSubDomains(DescribeDNSSLBSubDomainsResponseBodySlbSubDomains slbSubDomains) {
        this.slbSubDomains = slbSubDomains;
        return this;
    }
    public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains getSlbSubDomains() {
        return this.slbSubDomains;
    }

    public DescribeDNSSLBSubDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm extends TeaModel {
        /**
         * <p>The DNS resolution line. The line can be China Telecom, China Mobile, and China Unicom.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <p>Indicates whether weighted round-robin is enabled for the line. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): Weighted round-robin is enabled.</li>
         * <li><strong>false</strong>: Weighted round-robin is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Open")
        public Boolean open;

        public static DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm self = new DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

    }

    public static class DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms extends TeaModel {
        @NameInMap("LineAlgorithm")
        public java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm> lineAlgorithm;

        public static DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms self = new DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms setLineAlgorithm(java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm> lineAlgorithm) {
            this.lineAlgorithm = lineAlgorithm;
            return this;
        }
        public java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm> getLineAlgorithm() {
            return this.lineAlgorithm;
        }

    }

    public static class DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain extends TeaModel {
        /**
         * <p>The lines for which weighted round-robin is enabled.</p>
         */
        @NameInMap("LineAlgorithms")
        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms lineAlgorithms;

        /**
         * <p>Indicates whether weighted round-robin is enabled for the subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Open")
        public Boolean open;

        /**
         * <p>The number of DNS records added for the subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecordCount")
        public Long recordCount;

        /**
         * <p>The name of the subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        /**
         * <p>The type of the Domain Name System (DNS) record that supports weighted round-robin. Valid values: A, AAAA, and CNAME.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain self = new DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setLineAlgorithms(DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms lineAlgorithms) {
            this.lineAlgorithms = lineAlgorithms;
            return this;
        }
        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms getLineAlgorithms() {
            return this.lineAlgorithms;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDNSSLBSubDomainsResponseBodySlbSubDomains extends TeaModel {
        @NameInMap("SlbSubDomain")
        public java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain> slbSubDomain;

        public static DescribeDNSSLBSubDomainsResponseBodySlbSubDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseBodySlbSubDomains self = new DescribeDNSSLBSubDomainsResponseBodySlbSubDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains setSlbSubDomain(java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain> slbSubDomain) {
            this.slbSubDomain = slbSubDomain;
            return this;
        }
        public java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain> getSlbSubDomain() {
            return this.slbSubDomain;
        }

    }

}
