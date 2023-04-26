// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErRouteMapsRequest extends TeaModel {
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("EnablePage")
    public Boolean enablePage;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("ErRouteMapId")
    public String erRouteMapId;

    @NameInMap("ErRouteMapNum")
    public Integer erRouteMapNum;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ReceptionInstanceId")
    public String receptionInstanceId;

    @NameInMap("ReceptionInstanceName")
    public String receptionInstanceName;

    @NameInMap("ReceptionInstanceType")
    public String receptionInstanceType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteMapAction")
    public String routeMapAction;

    @NameInMap("TransmissionInstanceId")
    public String transmissionInstanceId;

    @NameInMap("TransmissionInstanceName")
    public String transmissionInstanceName;

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
