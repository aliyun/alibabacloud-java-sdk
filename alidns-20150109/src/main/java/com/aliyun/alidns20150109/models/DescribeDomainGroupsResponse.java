// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("DomainGroups")
    @Validation(required = true)
    public DescribeDomainGroupsResponseDomainGroups domainGroups;

    public static DescribeDomainGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainGroupsResponse self = new DescribeDomainGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainGroupsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainGroupsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainGroupsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainGroupsResponse setDomainGroups(DescribeDomainGroupsResponseDomainGroups domainGroups) {
        this.domainGroups = domainGroups;
        return this;
    }
    public DescribeDomainGroupsResponseDomainGroups getDomainGroups() {
        return this.domainGroups;
    }

    public static class DescribeDomainGroupsResponseDomainGroupsDomainGroup extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("DomainCount")
        @Validation(required = true)
        public Long domainCount;

        public static DescribeDomainGroupsResponseDomainGroupsDomainGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainGroupsResponseDomainGroupsDomainGroup self = new DescribeDomainGroupsResponseDomainGroupsDomainGroup();
            return TeaModel.build(map, self);
        }

        public DescribeDomainGroupsResponseDomainGroupsDomainGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDomainGroupsResponseDomainGroupsDomainGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDomainGroupsResponseDomainGroupsDomainGroup setDomainCount(Long domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Long getDomainCount() {
            return this.domainCount;
        }

    }

    public static class DescribeDomainGroupsResponseDomainGroups extends TeaModel {
        @NameInMap("DomainGroup")
        @Validation(required = true)
        public java.util.List<DescribeDomainGroupsResponseDomainGroupsDomainGroup> domainGroup;

        public static DescribeDomainGroupsResponseDomainGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainGroupsResponseDomainGroups self = new DescribeDomainGroupsResponseDomainGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDomainGroupsResponseDomainGroups setDomainGroup(java.util.List<DescribeDomainGroupsResponseDomainGroupsDomainGroup> domainGroup) {
            this.domainGroup = domainGroup;
            return this;
        }
        public java.util.List<DescribeDomainGroupsResponseDomainGroupsDomainGroup> getDomainGroup() {
            return this.domainGroup;
        }

    }

}
