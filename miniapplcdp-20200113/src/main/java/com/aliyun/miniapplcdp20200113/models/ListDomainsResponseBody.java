// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListDomainsResponseBodyData data;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainsResponseBody setData(ListDomainsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDomainsResponseBodyData getData() {
        return this.data;
    }

    public static class ListDomainsResponseBodyDataItems extends TeaModel {
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

        public static ListDomainsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDataItems self = new ListDomainsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDataItems setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public ListDomainsResponseBodyDataItems setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDomainsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDomainsResponseBodyDataItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListDomainsResponseBodyDataItems setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListDomainsResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListDomainsResponseBodyDataItems setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

    public static class ListDomainsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListDomainsResponseBodyDataItems> items;

        public static ListDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyData self = new ListDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyData setItems(java.util.List<ListDomainsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDomainsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
