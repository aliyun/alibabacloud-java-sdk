// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    public static DescribeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRequest self = new DescribeAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
