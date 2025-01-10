// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRouteMapRequest extends TeaModel {
    /**
     * <p>Policy description</p>
     * 
     * <strong>example:</strong>
     * <p>terraform-example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Destination CIDR Block</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Lingjun HUB ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-aueyxxsy</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>The ID of the destination instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-xlhsvdvt</p>
     */
    @NameInMap("ReceptionInstanceId")
    public String receptionInstanceId;

    /**
     * <p>The tenant to which the route receiving instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166277</p>
     */
    @NameInMap("ReceptionInstanceOwner")
    public String receptionInstanceOwner;

    /**
     * <p>The type of the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>VPD</strong>: Lingjun network segment.</li>
     * <li><strong>VCC</strong>: Lingjun Connection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPD</p>
     */
    @NameInMap("ReceptionInstanceType")
    public String receptionInstanceType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Policy behavior; optional values:</p>
     * <ul>
     * <li><strong>permit</strong>: Allow</li>
     * <li><strong>deny</strong>: Rejected</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>permit</p>
     */
    @NameInMap("RouteMapAction")
    public String routeMapAction;

    /**
     * <p>The ID of the policy.</p>
     * <p>A smaller sequence number indicates a lower priority. When a route is matched, a policy with a higher priority is preferentially matched.</p>
     * <p><strong>Valid values: 1001 to 2000</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("RouteMapNum")
    public Integer routeMapNum;

    /**
     * <p>The ID of the source instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-xlsjsdvt</p>
     */
    @NameInMap("TransmissionInstanceId")
    public String transmissionInstanceId;

    /**
     * <p>The tenant to which the route publish instance belongs</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166277</p>
     */
    @NameInMap("TransmissionInstanceOwner")
    public String transmissionInstanceOwner;

    /**
     * <p>The type of the source instance. Valid values:</p>
     * <ul>
     * <li><strong>VPD</strong>: Lingjun network segment.</li>
     * <li><strong>VCC</strong>: Lingjun Connection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPD</p>
     */
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
