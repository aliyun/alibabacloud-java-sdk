// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRouteMapRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("ReceptionInstanceId")
    public String receptionInstanceId;

    @NameInMap("ReceptionInstanceOwner")
    public String receptionInstanceOwner;

    @NameInMap("ReceptionInstanceType")
    public String receptionInstanceType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteMapAction")
    public String routeMapAction;

    @NameInMap("RouteMapNum")
    public Integer routeMapNum;

    @NameInMap("TransmissionInstanceId")
    public String transmissionInstanceId;

    @NameInMap("TransmissionInstanceOwner")
    public String transmissionInstanceOwner;

    @NameInMap("TransmissionInstanceType")
    public String transmissionInstanceType;

    public static CreateErRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateErRouteMapRequest self = new CreateErRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public CreateErRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateErRouteMapRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateErRouteMapRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public CreateErRouteMapRequest setReceptionInstanceId(String receptionInstanceId) {
        this.receptionInstanceId = receptionInstanceId;
        return this;
    }
    public String getReceptionInstanceId() {
        return this.receptionInstanceId;
    }

    public CreateErRouteMapRequest setReceptionInstanceOwner(String receptionInstanceOwner) {
        this.receptionInstanceOwner = receptionInstanceOwner;
        return this;
    }
    public String getReceptionInstanceOwner() {
        return this.receptionInstanceOwner;
    }

    public CreateErRouteMapRequest setReceptionInstanceType(String receptionInstanceType) {
        this.receptionInstanceType = receptionInstanceType;
        return this;
    }
    public String getReceptionInstanceType() {
        return this.receptionInstanceType;
    }

    public CreateErRouteMapRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateErRouteMapRequest setRouteMapAction(String routeMapAction) {
        this.routeMapAction = routeMapAction;
        return this;
    }
    public String getRouteMapAction() {
        return this.routeMapAction;
    }

    public CreateErRouteMapRequest setRouteMapNum(Integer routeMapNum) {
        this.routeMapNum = routeMapNum;
        return this;
    }
    public Integer getRouteMapNum() {
        return this.routeMapNum;
    }

    public CreateErRouteMapRequest setTransmissionInstanceId(String transmissionInstanceId) {
        this.transmissionInstanceId = transmissionInstanceId;
        return this;
    }
    public String getTransmissionInstanceId() {
        return this.transmissionInstanceId;
    }

    public CreateErRouteMapRequest setTransmissionInstanceOwner(String transmissionInstanceOwner) {
        this.transmissionInstanceOwner = transmissionInstanceOwner;
        return this;
    }
    public String getTransmissionInstanceOwner() {
        return this.transmissionInstanceOwner;
    }

    public CreateErRouteMapRequest setTransmissionInstanceType(String transmissionInstanceType) {
        this.transmissionInstanceType = transmissionInstanceType;
        return this;
    }
    public String getTransmissionInstanceType() {
        return this.transmissionInstanceType;
    }

}
