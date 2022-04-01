// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsRequest extends TeaModel {
    // 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过100。返回结果可以小于指定的数量，但不会多于指定的数量。
    @NameInMap("limit")
    public Integer limit;

    // 用来标记当前开始读取的位置，置空表示从头开始。第一次查询不需要提供这个参数，后续查询的Token从前一次查询的返回结果中获取。
    @NameInMap("nextToken")
    public String nextToken;

    public static ListStatefulAsyncInvocationFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationFunctionsRequest self = new ListStatefulAsyncInvocationFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationFunctionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListStatefulAsyncInvocationFunctionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
