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

    }

    public static class DescribeDomainGroupsResponseDomainGroups extends TeaModel {
        @NameInMap("DomainGroup")
        @Validation(required = true)
        public java.util.List<DescribeDomainGroupsResponseDomainGroupsDomainGroup> domainGroup;

        public static DescribeDomainGroupsResponseDomainGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainGroupsResponseDomainGroups self = new DescribeDomainGroupsResponseDomainGroups();
            return TeaModel.build(map, self);
        }

    }

}
