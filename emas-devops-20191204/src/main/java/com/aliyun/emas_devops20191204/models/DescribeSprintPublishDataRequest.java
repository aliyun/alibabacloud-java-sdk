// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribeSprintPublishDataRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("SprintBid")
    @Validation(required = true)
    public String sprintBid;

    public static DescribeSprintPublishDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSprintPublishDataRequest self = new DescribeSprintPublishDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSprintPublishDataRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeSprintPublishDataRequest setSprintBid(String sprintBid) {
        this.sprintBid = sprintBid;
        return this;
    }
    public String getSprintBid() {
        return this.sprintBid;
    }

}
