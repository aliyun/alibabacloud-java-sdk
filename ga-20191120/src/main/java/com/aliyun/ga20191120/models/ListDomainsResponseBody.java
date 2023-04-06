// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of accelerated domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<ListDomainsResponseBodyDomains> domains;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The name of the GA instance.</p>
         */
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
        /**
         * <p>The list of GA instances.</p>
         */
        @NameInMap("Accelerators")
        public java.util.List<ListDomainsResponseBodyDomainsAccelerators> accelerators;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ICP filing status of the accelerated domain name.</p>
         * <br>
         * <p>*   **illegal:** The domain name is illegal.</p>
         * <p>*   **inactive:** The domain name has not completed ICP filing.</p>
         * <p>*   **active:** The domain name has a valid ICP filing.</p>
         * <p>*   **unknown:** The ICP filing status is unknown.</p>
         */
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
