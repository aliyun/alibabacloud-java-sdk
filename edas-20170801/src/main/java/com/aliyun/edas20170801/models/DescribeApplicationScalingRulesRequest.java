// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeApplicationScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesRequest self = new DescribeApplicationScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
