// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateDomainResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDomainResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponseBody self = new CreateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponseBody setData(CreateDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDomainResponseBodyData getData() {
        return this.data;
    }

    public CreateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDomainResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Applied")
        public Boolean applied;

        @NameInMap("Checked")
        public Boolean checked;

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

        public static CreateDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainResponseBodyData self = new CreateDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDomainResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateDomainResponseBodyData setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public CreateDomainResponseBodyData setChecked(Boolean checked) {
            this.checked = checked;
            return this;
        }
        public Boolean getChecked() {
            return this.checked;
        }

        public CreateDomainResponseBodyData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public CreateDomainResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateDomainResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateDomainResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public CreateDomainResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public CreateDomainResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateDomainResponseBodyData setWithCertificate(Boolean withCertificate) {
            this.withCertificate = withCertificate;
            return this;
        }
        public Boolean getWithCertificate() {
            return this.withCertificate;
        }

    }

}
