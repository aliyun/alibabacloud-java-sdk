// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListDeliveryPackageRequest extends TeaModel {
    @NameInMap("deliverableUID")
    public String deliverableUID;

    @NameInMap("platform")
    public String platform;

    public static ListDeliveryPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryPackageRequest self = new ListDeliveryPackageRequest();
        return TeaModel.build(map, self);
    }

    public ListDeliveryPackageRequest setDeliverableUID(String deliverableUID) {
        this.deliverableUID = deliverableUID;
        return this;
    }
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    public ListDeliveryPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
