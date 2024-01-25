// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateDeliveryInstanceRequest extends TeaModel {
    @NameInMap("deliverableConfigUID")
    public String deliverableConfigUID;

    @NameInMap("deliverableUID")
    public String deliverableUID;

    @NameInMap("desc")
    public String desc;

    public static UpdateDeliveryInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryInstanceRequest self = new UpdateDeliveryInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryInstanceRequest setDeliverableConfigUID(String deliverableConfigUID) {
        this.deliverableConfigUID = deliverableConfigUID;
        return this;
    }
    public String getDeliverableConfigUID() {
        return this.deliverableConfigUID;
    }

    public UpdateDeliveryInstanceRequest setDeliverableUID(String deliverableUID) {
        this.deliverableUID = deliverableUID;
        return this;
    }
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    public UpdateDeliveryInstanceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
