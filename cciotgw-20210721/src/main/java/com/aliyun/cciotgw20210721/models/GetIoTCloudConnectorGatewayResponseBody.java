// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIoTCloudConnectorGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("Description")
    public String description;

    @NameInMap("State")
    public String state;

    @NameInMap("ScheduleFactor")
    public java.util.Map<String, ?> scheduleFactor;

    @NameInMap("Apn")
    public String apn;

    @NameInMap("ForwardingUnitCount")
    public Integer forwardingUnitCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("ForwardingUnitIds")
    public java.util.List<String> forwardingUnitIds;

    @NameInMap("FeatureList")
    public java.util.List<String> featureList;

    @NameInMap("ZoneList")
    public java.util.List<String> zoneList;

    public static GetIoTCloudConnectorGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIoTCloudConnectorGatewayResponseBody self = new GetIoTCloudConnectorGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIoTCloudConnectorGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIoTCloudConnectorGatewayResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public GetIoTCloudConnectorGatewayResponseBody setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

    public GetIoTCloudConnectorGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetIoTCloudConnectorGatewayResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetIoTCloudConnectorGatewayResponseBody setScheduleFactor(java.util.Map<String, ?> scheduleFactor) {
        this.scheduleFactor = scheduleFactor;
        return this;
    }
    public java.util.Map<String, ?> getScheduleFactor() {
        return this.scheduleFactor;
    }

    public GetIoTCloudConnectorGatewayResponseBody setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public GetIoTCloudConnectorGatewayResponseBody setForwardingUnitCount(Integer forwardingUnitCount) {
        this.forwardingUnitCount = forwardingUnitCount;
        return this;
    }
    public Integer getForwardingUnitCount() {
        return this.forwardingUnitCount;
    }

    public GetIoTCloudConnectorGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetIoTCloudConnectorGatewayResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public GetIoTCloudConnectorGatewayResponseBody setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public GetIoTCloudConnectorGatewayResponseBody setForwardingUnitIds(java.util.List<String> forwardingUnitIds) {
        this.forwardingUnitIds = forwardingUnitIds;
        return this;
    }
    public java.util.List<String> getForwardingUnitIds() {
        return this.forwardingUnitIds;
    }

    public GetIoTCloudConnectorGatewayResponseBody setFeatureList(java.util.List<String> featureList) {
        this.featureList = featureList;
        return this;
    }
    public java.util.List<String> getFeatureList() {
        return this.featureList;
    }

    public GetIoTCloudConnectorGatewayResponseBody setZoneList(java.util.List<String> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<String> getZoneList() {
        return this.zoneList;
    }

}
