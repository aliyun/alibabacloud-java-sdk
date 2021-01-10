// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeInvocationLogRequest extends TeaModel {
    @NameInMap("InvocationId")
    public String invocationId;

    @NameInMap("Pages")
    public String pages;

    public static DescribeInvocationLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationLogRequest self = new DescribeInvocationLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationLogRequest setInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }
    public String getInvocationId() {
        return this.invocationId;
    }

    public DescribeInvocationLogRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

}
