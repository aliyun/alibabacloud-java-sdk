// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainGroupsResponseBody extends TeaModel {
    /**
     * <p>The domain name groups.</p>
     */
    @NameInMap("DomainGroups")
    public DescribeDomainGroupsResponseBodyDomainGroups domainGroups;

    /**
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **1 to 100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainGroupsResponseBody self = new DescribeDomainGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainGroupsResponseBody setDomainGroups(DescribeDomainGroupsResponseBodyDomainGroups domainGroups) {
        this.domainGroups = domainGroups;
        return this;
    }
    public DescribeDomainGroupsResponseBodyDomainGroups getDomainGroups() {
        return this.domainGroups;
    }

    public DescribeDomainGroupsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup extends TeaModel {
        /**
         * <p>The number of domain name groups.</p>
         */
        @NameInMap("DomainCount")
        public Long domainCount;

        /**
         * <p>The ID of the domain name group. Valid values:</p>
         * <br>
         * <p>*   defaultGroup: the default group</p>
         * <p>*   If an empty string is returned, it indicates the group that contains all domain names.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the domain name group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup self = new DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

        public DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDomainGroupsResponseBodyDomainGroups extends TeaModel {
        @NameInMap("DomainGroup")
        public java.util.List<DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup> domainGroup;

        public static DescribeDomainGroupsResponseBodyDomainGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainGroupsResponseBodyDomainGroups self = new DescribeDomainGroupsResponseBodyDomainGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDomainGroupsResponseBodyDomainGroups setDomainGroup(java.util.List<DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup> domainGroup) {
            this.domainGroup = domainGroup;
            return this;
        }
        public java.util.List<DescribeDomainGroupsResponseBodyDomainGroupsDomainGroup> getDomainGroup() {
            return this.domainGroup;
        }

    }

}
