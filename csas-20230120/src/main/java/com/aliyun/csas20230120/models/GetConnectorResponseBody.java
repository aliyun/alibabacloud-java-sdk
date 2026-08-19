// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetConnectorResponseBody extends TeaModel {
    /**
     * <p>Connector。</p>
     */
    @NameInMap("Connector")
    public GetConnectorResponseBodyConnector connector;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectorResponseBody self = new GetConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectorResponseBody setConnector(GetConnectorResponseBodyConnector connector) {
        this.connector = connector;
        return this;
    }
    public GetConnectorResponseBodyConnector getConnector() {
        return this.connector;
    }

    public GetConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConnectorResponseBodyConnectorUpgradeTime extends TeaModel {
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

        public static GetConnectorResponseBodyConnectorUpgradeTime build(java.util.Map<String, ?> map) throws Exception {
            GetConnectorResponseBodyConnectorUpgradeTime self = new GetConnectorResponseBodyConnectorUpgradeTime();
            return TeaModel.build(map, self);
        }

        public GetConnectorResponseBodyConnectorUpgradeTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetConnectorResponseBodyConnectorUpgradeTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetConnectorResponseBodyConnector extends TeaModel {
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
         * <li><strong>Disabled</strong>: Disabled.</li>
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
        public GetConnectorResponseBodyConnectorUpgradeTime upgradeTime;

        /**
         * <p>The virtual IP address range.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("VipCidr")
        public String vipCidr;

        public static GetConnectorResponseBodyConnector build(java.util.Map<String, ?> map) throws Exception {
            GetConnectorResponseBodyConnector self = new GetConnectorResponseBodyConnector();
            return TeaModel.build(map, self);
        }

        public GetConnectorResponseBodyConnector setConnectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        public String getConnectorId() {
            return this.connectorId;
        }

        public GetConnectorResponseBodyConnector setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetConnectorResponseBodyConnector setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetConnectorResponseBodyConnector setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetConnectorResponseBodyConnector setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetConnectorResponseBodyConnector setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public GetConnectorResponseBodyConnector setUpgradeTime(GetConnectorResponseBodyConnectorUpgradeTime upgradeTime) {
            this.upgradeTime = upgradeTime;
            return this;
        }
        public GetConnectorResponseBodyConnectorUpgradeTime getUpgradeTime() {
            return this.upgradeTime;
        }

        public GetConnectorResponseBodyConnector setVipCidr(String vipCidr) {
            this.vipCidr = vipCidr;
            return this;
        }
        public String getVipCidr() {
            return this.vipCidr;
        }

    }

}
