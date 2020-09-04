// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetPublishFileRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    public static GetPublishFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublishFileRequest self = new GetPublishFileRequest();
        return TeaModel.build(map, self);
    }

    public GetPublishFileRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetPublishFileRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

}
