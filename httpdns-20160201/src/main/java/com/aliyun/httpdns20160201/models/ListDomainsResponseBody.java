// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    @NameInMap("DomainInfos")
    public ListDomainsResponseBodyDomainInfos domainInfos;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-7427E531****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setDomainInfos(ListDomainsResponseBodyDomainInfos domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }
    public ListDomainsResponseBodyDomainInfos getDomainInfos() {
        return this.domainInfos;
    }

    public ListDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDomainsResponseBodyDomainInfosDomainInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ResolveHttpAes")
        public Long resolveHttpAes;

        @NameInMap("ResolveHttpsAes")
        public Long resolveHttpsAes;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Resolved")
        public Long resolved;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Resolved6")
        public Long resolved6;

        @NameInMap("ResolvedDoh")
        public Long resolvedDoh;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResolvedHttps")
        public Long resolvedHttps;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ResolvedHttps6")
        public Long resolvedHttps6;

        @NameInMap("TimeModified")
        public Long timeModified;

        public static ListDomainsResponseBodyDomainInfosDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomainInfosDomainInfo self = new ListDomainsResponseBodyDomainInfosDomainInfo();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolveHttpAes(Long resolveHttpAes) {
            this.resolveHttpAes = resolveHttpAes;
            return this;
        }
        public Long getResolveHttpAes() {
            return this.resolveHttpAes;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolveHttpsAes(Long resolveHttpsAes) {
            this.resolveHttpsAes = resolveHttpsAes;
            return this;
        }
        public Long getResolveHttpsAes() {
            return this.resolveHttpsAes;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolved(Long resolved) {
            this.resolved = resolved;
            return this;
        }
        public Long getResolved() {
            return this.resolved;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolved6(Long resolved6) {
            this.resolved6 = resolved6;
            return this;
        }
        public Long getResolved6() {
            return this.resolved6;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolvedDoh(Long resolvedDoh) {
            this.resolvedDoh = resolvedDoh;
            return this;
        }
        public Long getResolvedDoh() {
            return this.resolvedDoh;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolvedHttps(Long resolvedHttps) {
            this.resolvedHttps = resolvedHttps;
            return this;
        }
        public Long getResolvedHttps() {
            return this.resolvedHttps;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setResolvedHttps6(Long resolvedHttps6) {
            this.resolvedHttps6 = resolvedHttps6;
            return this;
        }
        public Long getResolvedHttps6() {
            return this.resolvedHttps6;
        }

        public ListDomainsResponseBodyDomainInfosDomainInfo setTimeModified(Long timeModified) {
            this.timeModified = timeModified;
            return this;
        }
        public Long getTimeModified() {
            return this.timeModified;
        }

    }

    public static class ListDomainsResponseBodyDomainInfos extends TeaModel {
        @NameInMap("DomainInfo")
        public java.util.List<ListDomainsResponseBodyDomainInfosDomainInfo> domainInfo;

        public static ListDomainsResponseBodyDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomainInfos self = new ListDomainsResponseBodyDomainInfos();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomainInfos setDomainInfo(java.util.List<ListDomainsResponseBodyDomainInfosDomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }
        public java.util.List<ListDomainsResponseBodyDomainInfosDomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

    }

}
