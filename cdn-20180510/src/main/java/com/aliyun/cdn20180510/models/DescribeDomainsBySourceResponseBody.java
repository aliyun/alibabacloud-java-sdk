// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsBySourceResponseBody extends TeaModel {
    // The domain names corresponding to each origin server. The data is indicated by the DomainsData parameter. Data type: array.
    @NameInMap("DomainsList")
    public DescribeDomainsBySourceResponseBodyDomainsList domainsList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The origin servers.
    @NameInMap("Sources")
    public String sources;

    public static DescribeDomainsBySourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsBySourceResponseBody self = new DescribeDomainsBySourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsBySourceResponseBody setDomainsList(DescribeDomainsBySourceResponseBodyDomainsList domainsList) {
        this.domainsList = domainsList;
        return this;
    }
    public DescribeDomainsBySourceResponseBodyDomainsList getDomainsList() {
        return this.domainsList;
    }

    public DescribeDomainsBySourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsBySourceResponseBody setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public static class DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo extends TeaModel {
        // The workload type of the accelerated domain name. Valid values:
        // 
        // *   **web**: images and small files.
        // *   **download**: large files.
        // *   **video**: on-demand video and audio streaming.
        @NameInMap("CdnType")
        public String cdnType;

        // The time when the domain name was added to Alibaba Cloud CDN.
        @NameInMap("CreateTime")
        public String createTime;

        // The CNAME assigned to the domain name.
        @NameInMap("DomainCname")
        public String domainCname;

        // The domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The status of the accelerated domain name. Valid values:
        // 
        // *   **applying**: The domain name is under review.
        // *   **configure_failed**: The domain name failed the review.
        // *   **configuring**: The domain name is being configured.
        // *   **online**: The domain name is working as expected.
        // *   **stopping**: The domain name is being stopped.
        // *   **offline**: The domain name is disabled.
        // *   **disabling**: The domain name is being disabled.
        @NameInMap("Status")
        public String status;

        // The time when the configuration was updated.
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo self = new DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
        }

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfosDomainInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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
        // The detailed information about the domain name. The data is indicated by the domainInfo parameter. Data type: array.
        @NameInMap("DomainInfos")
        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomainInfos domainInfos;

        // The domain names that correspond to each origin server. The domain name is indicated by the domainNames parameter.
        @NameInMap("Domains")
        public DescribeDomainsBySourceResponseBodyDomainsListDomainsDataDomains domains;

        // An origin server.
        @NameInMap("Source")
        public String source;

        public static DescribeDomainsBySourceResponseBodyDomainsListDomainsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsBySourceResponseBodyDomainsListDomainsData self = new DescribeDomainsBySourceResponseBodyDomainsListDomainsData();
            return TeaModel.build(map, self);
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

        public DescribeDomainsBySourceResponseBodyDomainsListDomainsData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
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
