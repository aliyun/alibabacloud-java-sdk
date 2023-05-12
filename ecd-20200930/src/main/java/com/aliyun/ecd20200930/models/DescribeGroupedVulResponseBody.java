// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems;

    /**
     * <p>The priority to fix the vulnerability or the risk level of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   asap: high</p>
     * <p>*   later: medium</p>
     * <p>*   nntf: low</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeGroupedVul.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The processing status of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   y: handled</p>
     * <p>*   n: unhandled</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGroupedVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulResponseBody self = new DescribeGroupedVulResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulResponseBody setGroupedVulItems(java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeGroupedVulResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedVulResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGroupedVulResponseBodyGroupedVulItems extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("GmtLast")
        public String gmtLast;

        /**
         * <p>The maximum number of entries returned per page.</p>
         */
        @NameInMap("HandledCount")
        public Integer handledCount;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   cve: Linux software vulnerability</p>
         * <p>*   sys: Windows system vulnerability</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>Details about vulnerabilities.</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeGroupedVulResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedVulResponseBodyGroupedVulItems self = new DescribeGroupedVulResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setGmtLast(String gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public String getGmtLast() {
            return this.gmtLast;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setHandledCount(Integer handledCount) {
            this.handledCount = handledCount;
            return this;
        }
        public Integer getHandledCount() {
            return this.handledCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
