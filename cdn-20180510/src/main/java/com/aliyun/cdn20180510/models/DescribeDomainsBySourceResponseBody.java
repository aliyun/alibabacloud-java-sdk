// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsBySourceResponseBody extends TeaModel {
    @NameInMap("Sources")
    public String sources;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainsList")
    public DescribeDomainsBySourceResponseBodyDomainsList domainsList;

    public static DescribeDomainsBySourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsBySourceResponseBody self = new DescribeDomainsBySourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsBySourceResponseBody setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public DescribeDomainsBySourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsBySourceResponseBody setDomainsList(DescribeDomainsBySourceResponseBodyDomainsList domainsList) {
        this.domainsList = domainsList;
        return this;
    }
    public DescribeDomainsBySourceResponseBodyDomainsList getDomainsList() {
        return this.domainsList;
    }

    public static class DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("DomainCname")
        public String domainCname;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo self = new DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setDomainCname(String domainCname) {
            this.domainCname = domainCname;
            return this;
        }
        public String getDomainCname() {
            return this.domainCname;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos extends TeaModel {
        @NameInMap("domainInfo")
        public java.util.List<DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo> domainInfo;

        public static DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos self = new DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos setDomainInfo(java.util.List<DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public java.util.List<DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

    }

    public static class DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains extends TeaModel {
        @NameInMap("domainNames")
        public java.util.List<String> domainNames;

        public static DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains self = new DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains setDomainNames(java.util.List<String> domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public java.util.List<String> getDomainNames() {
            return this.domainNames;
        }

    }

    public static class DescribeDomainsBySourceResponseBodyDomainsListDomainsData extends TeaModel {
        @NameInMap("Source")
        public String source;

        @NameInMap("DomainInfos")
        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos domainInfos;

        @NameInMap("Domains")
        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains domains;

        public static DescribeDomainsBySourceResponseBodyDomainsListDomainsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsListDomainsData self = new DescribeDomainsBySourceResponseBodyDomainsListDomainsData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsData setDomainInfos(DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }
        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos getDomainInfos() {
            return this.domainInfos;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsData setDomains(DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains domains) {
            this.domains = domains;
            return this;
        }
        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains getDomains() {
            return this.domains;
        }

    }

    public static class DescribeDomainsBySourceResponseBodyDomainsList extends TeaModel {
        @NameInMap("DomainsData")
        public java.util.List<DescribeDomainsBySourceResponseBodyDomainsListDomainsData> domainsData;

        public static DescribeDomainsBySourceResponseBodyDomainsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsList self = new DescribeDomainsBySourceResponseBodyDomainsList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsBySourceResponseBodyDomainsList setDomainsData(java.util.List<DescribeDomainsBySourceResponseBodyDomainsListDomainsData> domainsData) {
            this.domainsData = domainsData;
            return this;
        }
        public java.util.List<DescribeDomainsBySourceResponseBodyDomainsListDomainsData> getDomainsData() {
            return this.domainsData;
        }

    }

}
