// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("GroupedVulItems")
    @Validation(required = true)
    public java.util.List<DescribeGroupedVulResponseGroupedVulItems> groupedVulItems;

    public static DescribeGroupedVulResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulResponse self = new DescribeGroupedVulResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedVulResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGroupedVulResponse setGroupedVulItems(java.util.List<DescribeGroupedVulResponseGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeGroupedVulResponseGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public static class DescribeGroupedVulResponseGroupedVulItems extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AliasName")
        @Validation(required = true)
        public String aliasName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("GmtLast")
        @Validation(required = true)
        public String gmtLast;

        @NameInMap("AsapCount")
        @Validation(required = true)
        public Integer asapCount;

        @NameInMap("LaterCount")
        @Validation(required = true)
        public Integer laterCount;

        @NameInMap("NntfCount")
        @Validation(required = true)
        public Integer nntfCount;

        @NameInMap("HandledCount")
        @Validation(required = true)
        public Integer handledCount;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        public static DescribeGroupedVulResponseGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedVulResponseGroupedVulItems self = new DescribeGroupedVulResponseGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedVulResponseGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupedVulResponseGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeGroupedVulResponseGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGroupedVulResponseGroupedVulItems setGmtLast(String gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public String getGmtLast() {
            return this.gmtLast;
        }

        public DescribeGroupedVulResponseGroupedVulItems setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeGroupedVulResponseGroupedVulItems setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeGroupedVulResponseGroupedVulItems setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeGroupedVulResponseGroupedVulItems setHandledCount(Integer handledCount) {
            this.handledCount = handledCount;
            return this;
        }
        public Integer getHandledCount() {
            return this.handledCount;
        }

        public DescribeGroupedVulResponseGroupedVulItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
