// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePublishPlanDataRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    public static DescribePublishPlanDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishPlanDataRequest self = new DescribePublishPlanDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribePublishPlanDataRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribePublishPlanDataRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

}
