// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteMapsRequest extends TeaModel {
    /**
     * <p>Destination CIDR Block</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to enable paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>Elastic Router ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>routing policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>er-rmap-uwglhzom</p>
     */
    @NameInMap("ErRouteMapId")
    public String erRouteMapId;

    /**
     * <p>Policy number (default for automatic creation is 3000; The value range of the policy number manually created by the user is 1001-2000)</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ErRouteMapNum")
    public Integer erRouteMapNum;

    /**
     * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Receive Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-x2lohgpv</p>
     */
    @NameInMap("ReceptionInstanceId")
    public String receptionInstanceId;

    /**
     * <p>Receive Instance Name</p>
     * 
     * <strong>example:</strong>
     * <p>vpd2</p>
     */
    @NameInMap("ReceptionInstanceName")
    public String receptionInstanceName;

    /**
     * <p>The type of the received instance. Optional values:</p>
     * <ul>
     * <li><strong>VPD</strong>: Lingjun network segment.</li>
     * <li><strong>VCC</strong>: Lingjun Connection.</li>
     * </ul>
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
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzaq3ypaqkdy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Policy behavior; optional values:</p>
     * <ul>
     * <li><strong>permit</strong>: Allow</li>
     * <li><strong>deny</strong>: Rejected</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("RouteMapAction")
    public String routeMapAction;

    /**
     * <p>Release Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-xsdlg2xb</p>
     */
    @NameInMap("TransmissionInstanceId")
    public String transmissionInstanceId;

    /**
     * <p>Release Instance Name</p>
     * 
     * <strong>example:</strong>
     * <p>vpd1</p>
     */
    @NameInMap("TransmissionInstanceName")
    public String transmissionInstanceName;

    /**
     * <p>The type of the published instance. Optional values:</p>
     * <ul>
     * <li><strong>VPD</strong>: Lingjun network segment.</li>
     * <li><strong>VCC</strong>: Lingjun Connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPD</p>
     */
    @NameInMap("TransmissionInstanceType")
    public String transmissionInstanceType;

    public static ListErRouteMapsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListErRouteMapsRequest self = new ListErRouteMapsRequest();
        return TeaModel.build(map, self);
    }

    public ListErRouteMapsRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public ListErRouteMapsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListErRouteMapsRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public ListErRouteMapsRequest setErRouteMapId(String erRouteMapId) {
        this.erRouteMapId = erRouteMapId;
        return this;
    }
    public String getErRouteMapId() {
        return this.erRouteMapId;
    }

    public ListErRouteMapsRequest setErRouteMapNum(Integer erRouteMapNum) {
        this.erRouteMapNum = erRouteMapNum;
        return this;
    }
    public Integer getErRouteMapNum() {
        return this.erRouteMapNum;
    }

    public ListErRouteMapsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListErRouteMapsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListErRouteMapsRequest setReceptionInstanceId(String receptionInstanceId) {
        this.receptionInstanceId = receptionInstanceId;
        return this;
    }
    public String getReceptionInstanceId() {
        return this.receptionInstanceId;
    }

    public ListErRouteMapsRequest setReceptionInstanceName(String receptionInstanceName) {
        this.receptionInstanceName = receptionInstanceName;
        return this;
    }
    public String getReceptionInstanceName() {
        return this.receptionInstanceName;
    }

    public ListErRouteMapsRequest setReceptionInstanceType(String receptionInstanceType) {
        this.receptionInstanceType = receptionInstanceType;
        return this;
    }
    public String getReceptionInstanceType() {
        return this.receptionInstanceType;
    }

    public ListErRouteMapsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListErRouteMapsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListErRouteMapsRequest setRouteMapAction(String routeMapAction) {
        this.routeMapAction = routeMapAction;
        return this;
    }
    public String getRouteMapAction() {
        return this.routeMapAction;
    }

    public ListErRouteMapsRequest setTransmissionInstanceId(String transmissionInstanceId) {
        this.transmissionInstanceId = transmissionInstanceId;
        return this;
    }
    public String getTransmissionInstanceId() {
        return this.transmissionInstanceId;
    }

    public ListErRouteMapsRequest setTransmissionInstanceName(String transmissionInstanceName) {
        this.transmissionInstanceName = transmissionInstanceName;
        return this;
    }
    public String getTransmissionInstanceName() {
        return this.transmissionInstanceName;
    }

    public ListErRouteMapsRequest setTransmissionInstanceType(String transmissionInstanceType) {
        this.transmissionInstanceType = transmissionInstanceType;
        return this;
    }
    public String getTransmissionInstanceType() {
        return this.transmissionInstanceType;
    }

}
