// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersRequest extends TeaModel {
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrgId")
    public String orgId;

    public static DescribeUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersRequest self = new DescribeUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsersRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeUsersRequest setExcludeEndUserIds(java.util.List<String> excludeEndUserIds) {
        this.excludeEndUserIds = excludeEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    public DescribeUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeUsersRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
