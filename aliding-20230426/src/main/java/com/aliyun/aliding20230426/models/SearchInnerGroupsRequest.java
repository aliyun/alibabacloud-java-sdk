// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchInnerGroupsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("SearchKey")
    public String searchKey;

    public static SearchInnerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchInnerGroupsRequest self = new SearchInnerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public SearchInnerGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchInnerGroupsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
