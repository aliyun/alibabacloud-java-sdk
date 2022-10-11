// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListDeliveryPackageRequest extends TeaModel {
    @NameInMap("deliverableUID")
    public String deliverableUID;

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

}
