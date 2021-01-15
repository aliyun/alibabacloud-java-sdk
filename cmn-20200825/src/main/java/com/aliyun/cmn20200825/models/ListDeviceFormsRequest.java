// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceFormsRequest extends TeaModel {
    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    public static ListDeviceFormsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceFormsRequest self = new ListDeviceFormsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceFormsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceFormsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
