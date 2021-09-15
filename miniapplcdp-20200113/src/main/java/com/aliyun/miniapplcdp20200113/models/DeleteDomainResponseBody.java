// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteDomainResponseBodyData data;

    public static DeleteDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResponseBody self = new DeleteDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDomainResponseBody setData(DeleteDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteDomainResponseBodyData getData() {
        return this.data;
    }

    public static class DeleteDomainResponseBodyData extends TeaModel {
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

        public static DeleteDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDomainResponseBodyData self = new DeleteDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteDomainResponseBodyData setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public DeleteDomainResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DeleteDomainResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DeleteDomainResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DeleteDomainResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DeleteDomainResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DeleteDomainResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

}
