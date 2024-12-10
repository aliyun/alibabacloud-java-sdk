// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class PushDeviceNotificationShrinkRequest extends TeaModel {
    @NameInMap("TenantInfo")
    public String tenantInfoShrink;

    @NameInMap("body")
    public String bodyShrink;

    public static PushDeviceNotificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceNotificationShrinkRequest self = new PushDeviceNotificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushDeviceNotificationShrinkRequest setTenantInfoShrink(String tenantInfoShrink) {
        this.tenantInfoShrink = tenantInfoShrink;
        return this;
    }
    public String getTenantInfoShrink() {
        return this.tenantInfoShrink;
    }

    public PushDeviceNotificationShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
