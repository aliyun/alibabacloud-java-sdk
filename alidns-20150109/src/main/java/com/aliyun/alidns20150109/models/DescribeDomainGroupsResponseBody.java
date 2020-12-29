// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainGroupsResponseBody extends TeaModel {
    @NameInMap("DomainGroups")
    public java.util.List<DescribeDomainGroupsResponseBodyDomainGroups> domainGroups;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeDomainGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainGroupsResponseBody self = new DescribeDomainGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainGroupsResponseBody setDomainGroups(java.util.List<DescribeDomainGroupsResponseBodyDomainGroups> domainGroups) {
        this.domainGroups = domainGroups;
        return this;
    }
    public java.util.List<DescribeDomainGroupsResponseBodyDomainGroups> getDomainGroups() {
        return this.domainGroups;
    }

    public DescribeDomainGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public DescribeDomainGroupsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDomainGroupsResponseBodyDomainGroups extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("DomainCount")
        public Long domainCount;

        public static DescribeDomainGroupsResponseBodyDomainGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainGroupsResponseBodyDomainGroups self = new DescribeDomainGroupsResponseBodyDomainGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDomainGroupsResponseBodyDomainGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDomainGroupsResponseBodyDomainGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDomainGroupsResponseBodyDomainGroups setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

    }

}
