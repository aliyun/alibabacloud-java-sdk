// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryInstanceRequest extends TeaModel {
    @NameInMap("clusterUID")
    public String clusterUID;

    @NameInMap("deliverableConfigUID")
    public String deliverableConfigUID;

    @NameInMap("deliverableUID")
    public String deliverableUID;

    @NameInMap("envUID")
    public String envUID;

    public static CreateDeliveryInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryInstanceRequest self = new CreateDeliveryInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryInstanceRequest setClusterUID(String clusterUID) {
        this.clusterUID = clusterUID;
        return this;
    }
    public String getClusterUID() {
        return this.clusterUID;
    }

    public CreateDeliveryInstanceRequest setDeliverableConfigUID(String deliverableConfigUID) {
        this.deliverableConfigUID = deliverableConfigUID;
        return this;
    }
    public String getDeliverableConfigUID() {
        return this.deliverableConfigUID;
    }

    public CreateDeliveryInstanceRequest setDeliverableUID(String deliverableUID) {
        this.deliverableUID = deliverableUID;
        return this;
    }
    public String getDeliverableUID() {
        return this.deliverableUID;
    }

    public CreateDeliveryInstanceRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

}
