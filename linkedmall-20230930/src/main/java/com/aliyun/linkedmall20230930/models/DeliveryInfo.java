// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DeliveryInfo extends TeaModel {
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("id")
    public String id;

    @NameInMap("postFee")
    public Long postFee;

    @NameInMap("serviceType")
    public Long serviceType;

    public static DeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
        DeliveryInfo self = new DeliveryInfo();
        return TeaModel.build(map, self);
    }

    public DeliveryInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DeliveryInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeliveryInfo setPostFee(Long postFee) {
        this.postFee = postFee;
        return this;
    }
    public Long getPostFee() {
        return this.postFee;
    }

    public DeliveryInfo setServiceType(Long serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Long getServiceType() {
        return this.serviceType;
    }

}
