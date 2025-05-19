// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QuerySystemEventDemoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static QuerySystemEventDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEventDemoRequest self = new QuerySystemEventDemoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemEventDemoRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public QuerySystemEventDemoRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public QuerySystemEventDemoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
