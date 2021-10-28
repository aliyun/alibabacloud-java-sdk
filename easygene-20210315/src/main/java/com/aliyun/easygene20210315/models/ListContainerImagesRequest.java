// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListContainerImagesRequest extends TeaModel {
    // 区域
    @NameInMap("Location")
    public String location;

    // 分页数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    public static ListContainerImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContainerImagesRequest self = new ListContainerImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListContainerImagesRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ListContainerImagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContainerImagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
