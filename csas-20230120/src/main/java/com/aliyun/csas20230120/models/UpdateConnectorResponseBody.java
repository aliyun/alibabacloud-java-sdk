// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateConnectorResponseBody extends TeaModel {
    /**
     * <p>Connector。</p>
     */
    @NameInMap("Connector")
    public UpdateConnectorResponseBodyConnector connector;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorResponseBody self = new UpdateConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorResponseBody setConnector(UpdateConnectorResponseBodyConnector connector) {
        this.connector = connector;
        return this;
    }
    public UpdateConnectorResponseBodyConnector getConnector() {
        return this.connector;
    }

    public UpdateConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateConnectorResponseBodyConnectorUpgradeTime extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>23:00</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00</p>
         */
        @NameInMap("Start")
        public String start;

        public static UpdateConnectorResponseBodyConnectorUpgradeTime build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectorResponseBodyConnectorUpgradeTime self = new UpdateConnectorResponseBodyConnectorUpgradeTime();
            return TeaModel.build(map, self);
        }

        public UpdateConnectorResponseBodyConnectorUpgradeTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public UpdateConnectorResponseBodyConnectorUpgradeTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class UpdateConnectorResponseBodyConnector extends TeaModel {
        /**
         * <p>Specifies whether to enable Global Accelerator. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AccelerateStatus")
        public String accelerateStatus;

        /**
         * <p>ConnectorID。</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The creation time of the Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>connector_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The connection status of the Connector. Valid values:</p>
         * <ul>
         * <li><strong>Online</strong>: Online.</li>
         * <li><strong>Offline</strong>: Offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The instance status of the Connector. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SwitchStatus")
        public String switchStatus;

        /**
         * <p>The upgrade time of the Connector.</p>
         */
        @NameInMap("UpgradeTime")
        public UpdateConnectorResponseBodyConnectorUpgradeTime upgradeTime;

        /**
         * <p>The virtual IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("VipCidr")
        public String vipCidr;

        public static UpdateConnectorResponseBodyConnector build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectorResponseBodyConnector self = new UpdateConnectorResponseBodyConnector();
            return TeaModel.build(map, self);
        }

        public UpdateConnectorResponseBodyConnector setAccelerateStatus(String accelerateStatus) {
            this.accelerateStatus = accelerateStatus;
            return this;
        }
        public String getAccelerateStatus() {
            return this.accelerateStatus;
        }

        public UpdateConnectorResponseBodyConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public UpdateConnectorResponseBodyConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateConnectorResponseBodyConnector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateConnectorResponseBodyConnector setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateConnectorResponseBodyConnector setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateConnectorResponseBodyConnector setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public UpdateConnectorResponseBodyConnector setUpgradeTime(UpdateConnectorResponseBodyConnectorUpgradeTime upgradeTime) {
            this.upgradeTime = upgradeTime;
            return this;
        }
        public UpdateConnectorResponseBodyConnectorUpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

        public UpdateConnectorResponseBodyConnector setVipCidr(String vipCidr) {
            this.vipCidr = vipCidr;
            return this;
        }
        public String getVipCidr() {
            return this.vipCidr;
        }

    }

}
