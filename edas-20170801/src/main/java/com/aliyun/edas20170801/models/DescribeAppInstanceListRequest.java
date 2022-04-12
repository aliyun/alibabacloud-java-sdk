// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceListRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WithNodeInfo")
    public Boolean withNodeInfo;

    public static DescribeAppInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstanceListRequest self = new DescribeAppInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstanceListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppInstanceListRequest setWithNodeInfo(Boolean withNodeInfo) {
        this.withNodeInfo = withNodeInfo;
        return this;
    }
    public Boolean getWithNodeInfo() {
        return this.withNodeInfo;
    }

}
