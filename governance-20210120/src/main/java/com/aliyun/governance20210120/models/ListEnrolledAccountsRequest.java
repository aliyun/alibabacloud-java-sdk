// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEnrolledAccountsRequest extends TeaModel {
    // 每页的最大数据条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 查询返回结果下一页的令牌。首次调用API不需要NextToken
    @NameInMap("NextToken")
    public String nextToken;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static ListEnrolledAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnrolledAccountsRequest self = new ListEnrolledAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnrolledAccountsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEnrolledAccountsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEnrolledAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
