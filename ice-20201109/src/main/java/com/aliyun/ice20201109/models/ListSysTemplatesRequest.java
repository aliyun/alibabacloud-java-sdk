// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSysTemplatesRequest extends TeaModel {
    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Type")
    public String type;

    public static ListSysTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSysTemplatesRequest self = new ListSysTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListSysTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSysTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSysTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
