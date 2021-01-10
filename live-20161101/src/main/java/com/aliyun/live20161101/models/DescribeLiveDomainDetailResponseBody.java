// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainDetailResponseBody extends TeaModel {
    @NameInMap("DomainDetail")
    public DescribeLiveDomainDetailResponseBodyDomainDetail domainDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainDetailResponseBody self = new DescribeLiveDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainDetailResponseBody setDomainDetail(DescribeLiveDomainDetailResponseBodyDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeLiveDomainDetailResponseBodyDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public DescribeLiveDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainDetailResponseBodyDomainDetail extends TeaModel {
        @NameInMap("SSLPub")
        public String SSLPub;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("LiveDomainType")
        public String liveDomainType;

        @NameInMap("Description")
        public String description;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("Region")
        public String region;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("DomainStatus")
        public String domainStatus;

        public static DescribeLiveDomainDetailResponseBodyDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainDetailResponseBodyDomainDetail self = new DescribeLiveDomainDetailResponseBodyDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setLiveDomainType(String liveDomainType) {
            this.liveDomainType = liveDomainType;
            return this;
        }
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeLiveDomainDetailResponseBodyDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

    }

}
