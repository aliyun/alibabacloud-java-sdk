// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateConnectorResponseBody extends TeaModel {
    /**
     * <p>Connector。</p>
     */
    @NameInMap("Connector")
    public CreateConnectorResponseBodyConnector connector;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A1367BB2-A5D8-5E79-9403-2446757AC03C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectorResponseBody self = new CreateConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConnectorResponseBody setConnector(CreateConnectorResponseBodyConnector connector) {
        this.connector = connector;
        return this;
    }
    public CreateConnectorResponseBodyConnector getConnector() {
        return this.connector;
    }

    public CreateConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateConnectorResponseBodyConnectorUpgradeTime extends TeaModel {
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

        public static CreateConnectorResponseBodyConnectorUpgradeTime build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectorResponseBodyConnectorUpgradeTime self = new CreateConnectorResponseBodyConnectorUpgradeTime();
            return TeaModel.build(map, self);
        }

        public CreateConnectorResponseBodyConnectorUpgradeTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public CreateConnectorResponseBodyConnectorUpgradeTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class CreateConnectorResponseBodyConnector extends TeaModel {
        /**
         * <p>ConnectorID。</p>
         * 
         * <strong>example:</strong>
         * <p>connector-94db94e06b98****</p>
         */
        @NameInMap("ConnectorId")
        public String connectorId;

        /**
         * <p>The connector creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The connector name.</p>
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
         * <p>The connector connection status. Valid values:</p>
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
         * <p>The connector instance status. Valid values:</p>
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
         * <p>The connector upgrade time.</p>
         */
        @NameInMap("UpgradeTime")
        public CreateConnectorResponseBodyConnectorUpgradeTime upgradeTime;

        public static CreateConnectorResponseBodyConnector build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectorResponseBodyConnector self = new CreateConnectorResponseBodyConnector();
            return TeaModel.build(map, self);
        }

        public CreateConnectorResponseBodyConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public CreateConnectorResponseBodyConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateConnectorResponseBodyConnector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateConnectorResponseBodyConnector setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateConnectorResponseBodyConnector setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateConnectorResponseBodyConnector setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public CreateConnectorResponseBodyConnector setUpgradeTime(CreateConnectorResponseBodyConnectorUpgradeTime upgradeTime) {
            this.upgradeTime = upgradeTime;
            return this;
        }
        public CreateConnectorResponseBodyConnectorUpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

    }

}
