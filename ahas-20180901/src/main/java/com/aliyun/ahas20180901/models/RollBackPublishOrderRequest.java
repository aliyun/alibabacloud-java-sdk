// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class RollBackPublishOrderRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("PublishOrderId")
    public String publishOrderId;

    @NameInMap("RollbackValue")
    public String rollbackValue;

    public static RollBackPublishOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RollBackPublishOrderRequest self = new RollBackPublishOrderRequest();
        return TeaModel.build(map, self);
    }

    public RollBackPublishOrderRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public RollBackPublishOrderRequest setPublishOrderId(String publishOrderId) {
        this.publishOrderId = publishOrderId;
        return this;
    }
    public String getPublishOrderId() {
        return this.publishOrderId;
    }

    public RollBackPublishOrderRequest setRollbackValue(String rollbackValue) {
        this.rollbackValue = rollbackValue;
        return this;
    }
    public String getRollbackValue() {
        return this.rollbackValue;
    }

}
