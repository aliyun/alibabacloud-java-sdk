// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainOverviewResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDomainOverviewResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDomainOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainOverviewResponseBody self = new GetDomainOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainOverviewResponseBody setData(GetDomainOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDomainOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetDomainOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDomainOverviewResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Applied")
        public Boolean applied;

        @NameInMap("Certificate")
        public java.util.Map<String, String> certificate;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Path")
        public String path;

        @NameInMap("WithCertificate")
        public Boolean withCertificate;

        public static GetDomainOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainOverviewResponseBodyData self = new GetDomainOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDomainOverviewResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetDomainOverviewResponseBodyData setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public GetDomainOverviewResponseBodyData setCertificate(java.util.Map<String, String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public java.util.Map<String, String> getCertificate() {
            return this.certificate;
        }

        public GetDomainOverviewResponseBodyData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public GetDomainOverviewResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetDomainOverviewResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDomainOverviewResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public GetDomainOverviewResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetDomainOverviewResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDomainOverviewResponseBodyData setWithCertificate(Boolean withCertificate) {
            this.withCertificate = withCertificate;
            return this;
        }
        public Boolean getWithCertificate() {
            return this.withCertificate;
        }

    }

}
