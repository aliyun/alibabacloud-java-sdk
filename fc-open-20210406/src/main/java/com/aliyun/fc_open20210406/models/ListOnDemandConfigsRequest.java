// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListOnDemandConfigsRequest extends TeaModel {
    // 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100。返回结果可以小于指定的数量，但不会多于指定的数量。
    @NameInMap("limit")
    public Integer limit;

    // 用来返回更多结果。第一次查询不需要提供这个参数，后续查询的Token从返回结果中获取。
    @NameInMap("nextToken")
    public String nextToken;

    // 限定返回的资源名称，名称必须以Prefix作为前缀，例如Prefix是a，则返回的资源名均是以a开始的。
    @NameInMap("prefix")
    public String prefix;

    // 设定结果从startKey之后（包括startKey）按字母排序的第一个开始返回。
    @NameInMap("startKey")
    public String startKey;

    public static ListOnDemandConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnDemandConfigsRequest self = new ListOnDemandConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListOnDemandConfigsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListOnDemandConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOnDemandConfigsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListOnDemandConfigsRequest setStartKey(String startKey) {
        this.startKey = startKey;
        return this;
    }
    public String getStartKey() {
        return this.startKey;
    }

}
