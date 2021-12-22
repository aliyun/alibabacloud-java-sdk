// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorGatewaysResponseBody extends TeaModel {
    @NameInMap("IoTCloudConnectorGateways")
    public java.util.List<ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways> ioTCloudConnectorGateways;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIoTCloudConnectorGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorGatewaysResponseBody self = new ListIoTCloudConnectorGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorGatewaysResponseBody setIoTCloudConnectorGateways(java.util.List<ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways> ioTCloudConnectorGateways) {
        this.ioTCloudConnectorGateways = ioTCloudConnectorGateways;
        return this;
    }
    public java.util.List<ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways> getIoTCloudConnectorGateways() {
        return this.ioTCloudConnectorGateways;
    }

    public ListIoTCloudConnectorGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIoTCloudConnectorGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIoTCloudConnectorGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways extends TeaModel {
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

        @NameInMap("IoTCloudConnectorGatewayId")
        public String ioTCloudConnectorGatewayId;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Name")
        public String name;

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

        public static ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways self = new ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setApn(String apn) {
            this.apn = apn;
            return this;
        }
        public String getApn() {
            return this.apn;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setFeatureList(java.util.List<String> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setForwardingUnitCount(Integer forwardingUnitCount) {
            this.forwardingUnitCount = forwardingUnitCount;
            return this;
        }
        public Integer getForwardingUnitCount() {
            return this.forwardingUnitCount;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setForwardingUnitIds(java.util.List<String> forwardingUnitIds) {
            this.forwardingUnitIds = forwardingUnitIds;
            return this;
        }
        public java.util.List<String> getForwardingUnitIds() {
            return this.forwardingUnitIds;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
            this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
            return this;
        }
        public String getIoTCloudConnectorGatewayId() {
            return this.ioTCloudConnectorGatewayId;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setResourceUid(Long resourceUid) {
            this.resourceUid = resourceUid;
            return this;
        }
        public Long getResourceUid() {
            return this.resourceUid;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setScheduleFactor(java.util.Map<String, ?> scheduleFactor) {
            this.scheduleFactor = scheduleFactor;
            return this;
        }
        public java.util.Map<String, ?> getScheduleFactor() {
            return this.scheduleFactor;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListIoTCloudConnectorGatewaysResponseBodyIoTCloudConnectorGateways setZoneList(java.util.List<String> zoneList) {
            this.zoneList = zoneList;
            return this;
        }
        public java.util.List<String> getZoneList() {
            return this.zoneList;
        }

    }

}
