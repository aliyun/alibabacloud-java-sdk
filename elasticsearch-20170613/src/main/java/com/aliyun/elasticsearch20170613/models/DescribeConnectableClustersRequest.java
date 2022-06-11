// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeConnectableClustersRequest extends TeaModel {
    @NameInMap("alreadySetItems")
    public Boolean alreadySetItems;

    @NameInMap("body")
    public String body;

    public static DescribeConnectableClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectableClustersRequest self = new DescribeConnectableClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConnectableClustersRequest setAlreadySetItems(Boolean alreadySetItems) {
        this.alreadySetItems = alreadySetItems;
        return this;
    }
    public Boolean getAlreadySetItems() {
        return this.alreadySetItems;
    }

    public DescribeConnectableClustersRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
