// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclEntriesRequest extends TeaModel {
    /**
     * <p>The ACL ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The number of entries per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of **NextToken**.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAclEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclEntriesRequest self = new ListAclEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAclEntriesRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public ListAclEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
