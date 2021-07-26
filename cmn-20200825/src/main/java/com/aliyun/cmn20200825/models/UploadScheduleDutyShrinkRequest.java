// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UploadScheduleDutyShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // scheduleDuty
    @NameInMap("ScheduleDuty")
    public String scheduleDutyShrink;

    public static UploadScheduleDutyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadScheduleDutyShrinkRequest self = new UploadScheduleDutyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadScheduleDutyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadScheduleDutyShrinkRequest setScheduleDutyShrink(String scheduleDutyShrink) {
        this.scheduleDutyShrink = scheduleDutyShrink;
        return this;
    }
    public String getScheduleDutyShrink() {
        return this.scheduleDutyShrink;
    }

}
