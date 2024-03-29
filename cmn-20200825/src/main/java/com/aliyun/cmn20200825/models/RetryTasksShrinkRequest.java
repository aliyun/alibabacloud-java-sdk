// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RetryTasksShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RetryTasks")
    public String retryTasksShrink;

    public static RetryTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryTasksShrinkRequest self = new RetryTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetryTasksShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetryTasksShrinkRequest setRetryTasksShrink(String retryTasksShrink) {
        this.retryTasksShrink = retryTasksShrink;
        return this;
    }
    public String getRetryTasksShrink() {
        return this.retryTasksShrink;
    }

}
