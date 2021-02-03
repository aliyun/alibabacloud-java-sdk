// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("SlbSubDomains")
    @Validation(required = true)
    public DescribeDNSSLBSubDomainsResponseSlbSubDomains slbSubDomains;

    public static DescribeDNSSLBSubDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsResponse self = new DescribeDNSSLBSubDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDNSSLBSubDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDNSSLBSubDomainsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDNSSLBSubDomainsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDNSSLBSubDomainsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDNSSLBSubDomainsResponse setSlbSubDomains(DescribeDNSSLBSubDomainsResponseSlbSubDomains slbSubDomains) {
        this.slbSubDomains = slbSubDomains;
        return this;
    }
    public DescribeDNSSLBSubDomainsResponseSlbSubDomains getSlbSubDomains() {
        return this.slbSubDomains;
    }

    public static class DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("Open")
        @Validation(required = true)
        public Boolean open;

        public static DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm self = new DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

    }

    public static class DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms extends TeaModel {
        @NameInMap("LineAlgorithm")
        @Validation(required = true)
        public java.util.List<DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm> lineAlgorithm;

        public static DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms self = new DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms setLineAlgorithm(java.util.List<DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm> lineAlgorithm) {
            this.lineAlgorithm = lineAlgorithm;
            return this;
        }
        public java.util.List<DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithmsLineAlgorithm> getLineAlgorithm() {
            return this.lineAlgorithm;
        }

    }

    public static class DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain extends TeaModel {
        @NameInMap("SubDomain")
        @Validation(required = true)
        public String subDomain;

        @NameInMap("RecordCount")
        @Validation(required = true)
        public Long recordCount;

        @NameInMap("Open")
        @Validation(required = true)
        public Boolean open;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("LineAlgorithms")
        @Validation(required = true)
        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms lineAlgorithms;

        public static DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain self = new DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain setLineAlgorithms(DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms lineAlgorithms) {
            this.lineAlgorithms = lineAlgorithms;
            return this;
        }
        public DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomainLineAlgorithms getLineAlgorithms() {
            return this.lineAlgorithms;
        }

    }

    public static class DescribeDNSSLBSubDomainsResponseSlbSubDomains extends TeaModel {
        @NameInMap("SlbSubDomain")
        @Validation(required = true)
        public java.util.List<DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain> slbSubDomain;

        public static DescribeDNSSLBSubDomainsResponseSlbSubDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseSlbSubDomains self = new DescribeDNSSLBSubDomainsResponseSlbSubDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseSlbSubDomains setSlbSubDomain(java.util.List<DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain> slbSubDomain) {
            this.slbSubDomain = slbSubDomain;
            return this;
        }
        public java.util.List<DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain> getSlbSubDomain() {
            return this.slbSubDomain;
        }

    }

}
