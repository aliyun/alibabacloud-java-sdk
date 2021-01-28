// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainDetailResponseBody extends TeaModel {
    @NameInMap("DomainDetail")
    public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail domainDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnIpaDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainDetailResponseBody self = new DescribeDcdnIpaDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainDetailResponseBody setDomainDetail(DescribeDcdnIpaDomainDetailResponseBodyDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public DescribeDcdnIpaDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Content")
        public String content;

        public static DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource self = new DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource> source;

        public static DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources self = new DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources setSource(java.util.List<DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeDcdnIpaDomainDetailResponseBodyDomainDetail extends TeaModel {
        @NameInMap("SSLPub")
        public String SSLPub;

        @NameInMap("Sources")
        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources sources;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Description")
        public String description;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("DomainStatus")
        public String domainStatus;

        public static DescribeDcdnIpaDomainDetailResponseBodyDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaDomainDetailResponseBodyDomainDetail self = new DescribeDcdnIpaDomainDetailResponseBodyDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setSources(DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetailSources getSources() {
            return this.sources;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDcdnIpaDomainDetailResponseBodyDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

    }

}
