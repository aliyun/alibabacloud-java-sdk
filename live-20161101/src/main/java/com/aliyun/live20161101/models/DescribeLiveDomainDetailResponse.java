// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainDetail")
    @Validation(required = true)
    public DescribeLiveDomainDetailResponseDomainDetail domainDetail;

    public static DescribeLiveDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainDetailResponse self = new DescribeLiveDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainDetailResponse setDomainDetail(DescribeLiveDomainDetailResponseDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeLiveDomainDetailResponseDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public static class DescribeLiveDomainDetailResponseDomainDetail extends TeaModel {
        @NameInMap("GmtCreated")
        @Validation(required = true)
        public String gmtCreated;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("DomainStatus")
        @Validation(required = true)
        public String domainStatus;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("LiveDomainType")
        @Validation(required = true)
        public String liveDomainType;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SSLProtocol")
        @Validation(required = true)
        public String SSLProtocol;

        @NameInMap("SSLPub")
        @Validation(required = true)
        public String SSLPub;

        @NameInMap("Scope")
        @Validation(required = true)
        public String scope;

        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        public static DescribeLiveDomainDetailResponseDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainDetailResponseDomainDetail self = new DescribeLiveDomainDetailResponseDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainDetailResponseDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setLiveDomainType(String liveDomainType) {
            this.liveDomainType = liveDomainType;
            return this;
        }
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeLiveDomainDetailResponseDomainDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

    }

}
