// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListLayersRequest extends TeaModel {
    // 最大返回条目数
    @NameInMap("limit")
    public Integer limit;

    // 下一个层名称
    @NameInMap("nextToken")
    public String nextToken;

    // 层名称前缀
    @NameInMap("prefix")
    public String prefix;

    // 起始层名称
    @NameInMap("startKey")
    public String startKey;

    public static ListLayersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLayersRequest self = new ListLayersRequest();
        return TeaModel.build(map, self);
    }

    public ListLayersRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListLayersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLayersRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListLayersRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
