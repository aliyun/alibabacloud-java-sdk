// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsRequest extends TeaModel {
    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NamePrefix")
    public String namePrefix;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SinkArn")
    public String sinkArn;

    @NameInMap("SourceArn")
    public String sourceArn;

    public static ListEventStreamingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventStreamingsRequest self = new ListEventStreamingsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventStreamingsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListEventStreamingsRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public ListEventStreamingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventStreamingsRequest setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
        return this;
    }
    public String getSinkArn() {
        return this.sinkArn;
    }

    public ListEventStreamingsRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

}
