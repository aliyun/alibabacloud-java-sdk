// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class TerminatePublishOrderRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("PublishOrderId")
    public Long publishOrderId;

    public static TerminatePublishOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminatePublishOrderRequest self = new TerminatePublishOrderRequest();
        return TeaModel.build(map, self);
    }

    public TerminatePublishOrderRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public TerminatePublishOrderRequest setPublishOrderId(Long publishOrderId) {
        this.publishOrderId = publishOrderId;
        return this;
    }
    public Long getPublishOrderId() {
        return this.publishOrderId;
    }

}
