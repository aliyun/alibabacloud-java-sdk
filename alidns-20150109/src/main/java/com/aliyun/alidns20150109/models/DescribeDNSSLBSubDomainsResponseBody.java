// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("SlbSubDomains")
    public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains slbSubDomains;

    public static DescribeDNSSLBSubDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsResponseBody self = new DescribeDNSSLBSubDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDNSSLBSubDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public DescribeDNSSLBSubDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDNSSLBSubDomainsResponseBody setSlbSubDomains(DescribeDNSSLBSubDomainsResponseBodySlbSubDomains slbSubDomains) {
        this.slbSubDomains = slbSubDomains;
        return this;
    }
    public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains getSlbSubDomains() {
        return this.slbSubDomains;
    }

    public static class DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm extends TeaModel {
        @NameInMap("Line")
        public String line;

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
        @NameInMap("Type")
        public String type;

        @NameInMap("RecordCount")
        public Long recordCount;

        @NameInMap("Open")
        public Boolean open;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("LineAlgorithms")
        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms lineAlgorithms;

        public static DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain self = new DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomain setLineAlgorithms(DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms lineAlgorithms) {
            this.lineAlgorithms = lineAlgorithms;
            return this;
        }
        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomainsSlbSubDomainLineAlgorithms getLineAlgorithms() {
            return this.lineAlgorithms;
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
