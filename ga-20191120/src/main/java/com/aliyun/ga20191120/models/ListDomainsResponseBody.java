// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<ListDomainsResponseBodyDomains> domains;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setDomains(java.util.List<ListDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<ListDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public ListDomainsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDomainsResponseBodyDomainsAccelerators extends TeaModel {
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        @NameInMap("Name")
        public String name;

        public static ListDomainsResponseBodyDomainsAccelerators build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomainsAccelerators self = new ListDomainsResponseBodyDomainsAccelerators();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomainsAccelerators setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListDomainsResponseBodyDomainsAccelerators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("Accelerators")
        public java.util.List<ListDomainsResponseBodyDomainsAccelerators> accelerators;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("State")
        public String state;

        public static ListDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomains self = new ListDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomains setAccelerators(java.util.List<ListDomainsResponseBodyDomainsAccelerators> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public java.util.List<ListDomainsResponseBodyDomainsAccelerators> getAccelerators() {
            return this.accelerators;
        }

        public ListDomainsResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDomainsResponseBodyDomains setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
