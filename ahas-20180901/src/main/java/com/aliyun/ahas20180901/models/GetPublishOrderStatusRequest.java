// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetPublishOrderStatusRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("PublishOrderId")
    public String publishOrderId;

    public static GetPublishOrderStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublishOrderStatusRequest self = new GetPublishOrderStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPublishOrderStatusRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetPublishOrderStatusRequest setPublishOrderId(String publishOrderId) {
        this.publishOrderId = publishOrderId;
        return this;
    }
    public String getPublishOrderId() {
        return this.publishOrderId;
    }

}
