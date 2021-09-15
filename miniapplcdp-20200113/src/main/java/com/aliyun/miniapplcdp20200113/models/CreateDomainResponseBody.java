// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateDomainResponseBodyData data;

    public static CreateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponseBody self = new CreateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDomainResponseBody setData(CreateDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDomainResponseBodyData getData() {
        return this.data;
    }

    public static class CreateDomainResponseBodyData extends TeaModel {
        @NameInMap("Applied")
        public Boolean applied;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Path")
        public String path;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("DomainType")
        public String domainType;

        public static CreateDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainResponseBodyData self = new CreateDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDomainResponseBodyData setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public CreateDomainResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateDomainResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateDomainResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateDomainResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateDomainResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public CreateDomainResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

}
