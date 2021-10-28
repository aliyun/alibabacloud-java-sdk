// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListUserActiveRunsRequest extends TeaModel {
    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListUserActiveRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserActiveRunsRequest self = new ListUserActiveRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserActiveRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
