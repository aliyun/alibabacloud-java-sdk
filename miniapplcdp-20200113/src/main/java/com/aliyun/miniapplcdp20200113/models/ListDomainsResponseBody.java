// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDomainsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setData(ListDomainsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDomainsResponseBodyData getData() {
        return this.data;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDomainsResponseBodyDataItems extends TeaModel {
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

        public static ListDomainsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDataItems self = new ListDomainsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDomainsResponseBodyDataItems setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public ListDomainsResponseBodyDataItems setChecked(Boolean checked) {
            this.checked = checked;
            return this;
        }
        public Boolean getChecked() {
            return this.checked;
        }

        public ListDomainsResponseBodyDataItems setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public ListDomainsResponseBodyDataItems setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListDomainsResponseBodyDataItems setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDomainsResponseBodyDataItems setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public ListDomainsResponseBodyDataItems setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ListDomainsResponseBodyDataItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListDomainsResponseBodyDataItems setWithCertificate(Boolean withCertificate) {
            this.withCertificate = withCertificate;
            return this;
        }
        public Boolean getWithCertificate() {
            return this.withCertificate;
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
