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
    public java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomains> slbSubDomains;

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

    public DescribeDNSSLBSubDomainsResponseBody setSlbSubDomains(java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomains> slbSubDomains) {
        this.slbSubDomains = slbSubDomains;
        return this;
    }
    public java.util.List<DescribeDNSSLBSubDomainsResponseBodySlbSubDomains> getSlbSubDomains() {
        return this.slbSubDomains;
    }

    public static class DescribeDNSSLBSubDomainsResponseBodySlbSubDomains extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RecordCount")
        public Long recordCount;

        @NameInMap("Open")
        public Boolean open;

        @NameInMap("SubDomain")
        public String subDomain;

        public static DescribeDNSSLBSubDomainsResponseBodySlbSubDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseBodySlbSubDomains self = new DescribeDNSSLBSubDomainsResponseBodySlbSubDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public DescribeDNSSLBSubDomainsResponseBodySlbSubDomains setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

    }

}
