// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclEntriesRequest extends TeaModel {
    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 访问控制策略Id
    @NameInMap("AclId")
    public String aclId;

    public static ListAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclEntriesRequest self = new ListAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAclEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAclEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclEntriesRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
