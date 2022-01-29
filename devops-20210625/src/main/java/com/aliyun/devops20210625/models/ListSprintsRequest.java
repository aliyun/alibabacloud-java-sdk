// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSprintsRequest extends TeaModel {
    // 每页最大返回数量，0-200，默认值20
    @NameInMap("maxResults")
    public Long maxResults;

    // 分页中的起始序列
    @NameInMap("nextToken")
    public String nextToken;

    // 项目id
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    // 类型
    @NameInMap("spaceType")
    public String spaceType;

    public static ListSprintsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSprintsRequest self = new ListSprintsRequest();
        return TeaModel.build(map, self);
    }

    public ListSprintsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSprintsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSprintsRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public ListSprintsRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
