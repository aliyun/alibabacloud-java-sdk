// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryDnsHostResponseBody extends TeaModel {
    @NameInMap("DnsHostList")
    public java.util.List<QueryDnsHostResponseBodyDnsHostList> dnsHostList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDnsHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDnsHostResponseBody self = new QueryDnsHostResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDnsHostResponseBody setDnsHostList(java.util.List<QueryDnsHostResponseBodyDnsHostList> dnsHostList) {
        this.dnsHostList = dnsHostList;
        return this;
    }
    public java.util.List<QueryDnsHostResponseBodyDnsHostList> getDnsHostList() {
        return this.dnsHostList;
    }

    public QueryDnsHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDnsHostResponseBodyDnsHostList extends TeaModel {
        @NameInMap("DnsName")
        public String dnsName;

        @NameInMap("IpList")
        public java.util.List<String> ipList;

        public static QueryDnsHostResponseBodyDnsHostList build(java.util.Map<String, ?> map) throws Exception {
            QueryDnsHostResponseBodyDnsHostList self = new QueryDnsHostResponseBodyDnsHostList();
            return TeaModel.build(map, self);
        }

        public QueryDnsHostResponseBodyDnsHostList setDnsName(String dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public String getDnsName() {
            return this.dnsName;
        }

        public QueryDnsHostResponseBodyDnsHostList setIpList(java.util.List<String> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<String> getIpList() {
            return this.ipList;
        }

    }

}
