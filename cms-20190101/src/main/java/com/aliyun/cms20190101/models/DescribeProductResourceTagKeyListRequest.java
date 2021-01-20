// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProductResourceTagKeyListRequest extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeProductResourceTagKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResourceTagKeyListRequest self = new DescribeProductResourceTagKeyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductResourceTagKeyListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
