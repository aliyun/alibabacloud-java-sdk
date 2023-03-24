// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListConnectorsResponseBody extends TeaModel {
    @NameInMap("Connectors")
    public java.util.List<ListConnectorsResponseBodyConnectors> connectors;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorsResponseBody self = new ListConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectorsResponseBody setConnectors(java.util.List<ListConnectorsResponseBodyConnectors> connectors) {
        this.connectors = connectors;
        return this;
    }
    public java.util.List<ListConnectorsResponseBodyConnectors> getConnectors() {
        return this.connectors;
    }

    public ListConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectorsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListConnectorsResponseBodyConnectorsApplications extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplicationName")
        public String applicationName;

        public static ListConnectorsResponseBodyConnectorsApplications build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsApplications self = new ListConnectorsResponseBodyConnectorsApplications();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListConnectorsResponseBodyConnectorsApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

    }

    public static class ListConnectorsResponseBodyConnectorsUpgradeTime extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("Start")
        public String start;

        public static ListConnectorsResponseBodyConnectorsUpgradeTime build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectorsUpgradeTime self = new ListConnectorsResponseBodyConnectorsUpgradeTime();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectorsUpgradeTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ListConnectorsResponseBodyConnectorsUpgradeTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class ListConnectorsResponseBodyConnectors extends TeaModel {
        @NameInMap("Applications")
        public java.util.List<ListConnectorsResponseBodyConnectorsApplications> applications;

        /**
         * <p>ConnectorID。</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SwitchStatus")
        public String switchStatus;

        @NameInMap("UpgradeTime")
        public ListConnectorsResponseBodyConnectorsUpgradeTime upgradeTime;

        public static ListConnectorsResponseBodyConnectors build(java.util.Map<String, ?> map) throws Exception {
            ListConnectorsResponseBodyConnectors self = new ListConnectorsResponseBodyConnectors();
            return TeaModel.build(map, self);
        }

        public ListConnectorsResponseBodyConnectors setApplications(java.util.List<ListConnectorsResponseBodyConnectorsApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListConnectorsResponseBodyConnectorsApplications> getApplications() {
            return this.applications;
        }

        public ListConnectorsResponseBodyConnectors setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public ListConnectorsResponseBodyConnectors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConnectorsResponseBodyConnectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectorsResponseBodyConnectors setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConnectorsResponseBodyConnectors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConnectorsResponseBodyConnectors setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public ListConnectorsResponseBodyConnectors setUpgradeTime(ListConnectorsResponseBodyConnectorsUpgradeTime upgradeTime) {
            this.upgradeTime = upgradeTime;
            return this;
        }
        public ListConnectorsResponseBodyConnectorsUpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

    }

}
