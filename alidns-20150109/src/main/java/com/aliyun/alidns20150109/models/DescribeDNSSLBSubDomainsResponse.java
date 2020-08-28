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

        public static DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain self = new DescribeDNSSLBSubDomainsResponseSlbSubDomainsSlbSubDomain();
            return TeaModel.build(map, self);
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

    }

}
