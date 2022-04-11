// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIoTCloudConnectorGatewayResponseBody extends TeaModel {
    @NameInMap("Apn")
    public String apn;

    @NameInMap("Description")
    public String description;

    @NameInMap("FeatureList")
    public java.util.List<String> featureList;

    @NameInMap("ForwardingUnitCount")
    public Integer forwardingUnitCount;

    @NameInMap("ForwardingUnitIds")
    public java.util.List<String> forwardingUnitIds;

    @NameInMap("HaMode")
    public String haMode;

    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("ScheduleFactor")
    public java.util.Map<String, ?> scheduleFactor;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("State")
    public String state;

    @NameInMap("ZoneList")
    public java.util.List<String> zoneList;

    public static GetIoTCloudConnectorGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIoTCloudConnectorGatewayResponseBody self = new GetIoTCloudConnectorGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIoTCloudConnectorGatewayResponseBody setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public GetIoTCloudConnectorGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetIoTCloudConnectorGatewayResponseBody setFeatureList(java.util.List<String> featureList) {
        this.featureList = featureList;
        return this;
    }
    public java.util.List<String> getFeatureList() {
        return this.featureList;
    }

    public GetIoTCloudConnectorGatewayResponseBody setForwardingUnitCount(Integer forwardingUnitCount) {
        this.forwardingUnitCount = forwardingUnitCount;
        return this;
    }
    public Integer getForwardingUnitCount() {
        return this.forwardingUnitCount;
    }

    public GetIoTCloudConnectorGatewayResponseBody setForwardingUnitIds(java.util.List<String> forwardingUnitIds) {
        this.forwardingUnitIds = forwardingUnitIds;
        return this;
    }
    public java.util.List<String> getForwardingUnitIds() {
        return this.forwardingUnitIds;
    }

    public GetIoTCloudConnectorGatewayResponseBody setHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }
    public String getHaMode() {
        return this.haMode;
    }

    public GetIoTCloudConnectorGatewayResponseBody setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public GetIoTCloudConnectorGatewayResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public GetIoTCloudConnectorGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetIoTCloudConnectorGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIoTCloudConnectorGatewayResponseBody setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

    public GetIoTCloudConnectorGatewayResponseBody setScheduleFactor(java.util.Map<String, ?> scheduleFactor) {
        this.scheduleFactor = scheduleFactor;
        return this;
    }
    public java.util.Map<String, ?> getScheduleFactor() {
        return this.scheduleFactor;
    }

    public GetIoTCloudConnectorGatewayResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public GetIoTCloudConnectorGatewayResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetIoTCloudConnectorGatewayResponseBody setZoneList(java.util.List<String> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<String> getZoneList() {
        return this.zoneList;
    }

}
