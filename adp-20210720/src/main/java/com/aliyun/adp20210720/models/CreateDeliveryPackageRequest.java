// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryPackageRequest extends TeaModel {
    @NameInMap("deliverableUID")
    public String deliverableUID;

    @NameInMap("deliveryInstanceUID")
    public String deliveryInstanceUID;

    @NameInMap("originDeliverableUID")
    public String originDeliverableUID;

    @NameInMap("packageContentType")
    public String packageContentType;

    @NameInMap("packageType")
    public String packageType;

    @NameInMap("platform")
    public String platform;

    public static CreateDeliveryPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPackageRequest self = new CreateDeliveryPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPackageRequest setDeliverableUID(String deliverableUID) {
        this.deliverableUID = deliverableUID;
        return this;
    }
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    public CreateDeliveryPackageRequest setDeliveryInstanceUID(String deliveryInstanceUID) {
        this.deliveryInstanceUID = deliveryInstanceUID;
        return this;
    }
    public String getDeliveryInstanceUID() {
        return this.deliveryInstanceUID;
    }

    public CreateDeliveryPackageRequest setOriginDeliverableUID(String originDeliverableUID) {
        this.originDeliverableUID = originDeliverableUID;
        return this;
    }
    public String getOriginDeliverableUID() {
        return this.originDeliverableUID;
    }

    public CreateDeliveryPackageRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

    public CreateDeliveryPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateDeliveryPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
