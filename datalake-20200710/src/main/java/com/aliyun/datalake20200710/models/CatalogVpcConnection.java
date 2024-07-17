// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogVpcConnection extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>catalog_test</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <strong>example:</strong>
     * <p>CONNECTED</p>
     */
    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    /**
     * <strong>example:</strong>
     * <p>120215474170****</p>
     */
    @NameInMap("Creator")
    public Long creator;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>2023-07-12 15:26:12</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2023-07-17 17:51:04</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("JdbcUri")
    public String jdbcUri;

    /**
     * <strong>example:</strong>
     * <p>120215474170****</p>
     */
    @NameInMap("Modifier")
    public Long modifier;

    /**
     * <strong>example:</strong>
     * <p>120215474170****</p>
     */
    @NameInMap("Owner")
    public Long owner;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("ThriftUri")
    public String thriftUri;

    /**
     * <strong>example:</strong>
     * <p>CONN-607A0053D874****</p>
     */
    @NameInMap("VpcConnectionId")
    public String vpcConnectionId;

    /**
     * <strong>example:</strong>
     * <p>vpc-2ze0c41hvmesel7pu****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Zones")
    public java.util.List<CatalogVpcConnectionZones> zones;

    public static CatalogVpcConnection build(java.util.Map<String, ?> map) throws Exception {
        CatalogVpcConnection self = new CatalogVpcConnection();
        return TeaModel.build(map, self);
    }

    public CatalogVpcConnection setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public CatalogVpcConnection setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CatalogVpcConnection setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public CatalogVpcConnection setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public CatalogVpcConnection setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CatalogVpcConnection setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CatalogVpcConnection setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CatalogVpcConnection setJdbcUri(String jdbcUri) {
        this.jdbcUri = jdbcUri;
        return this;
    }
    public String getJdbcUri() {
        return this.jdbcUri;
    }

    public CatalogVpcConnection setModifier(Long modifier) {
        this.modifier = modifier;
        return this;
    }
    public Long getModifier() {
        return this.modifier;
    }

    public CatalogVpcConnection setOwner(Long owner) {
        this.owner = owner;
        return this;
    }
    public Long getOwner() {
        return this.owner;
    }

    public CatalogVpcConnection setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CatalogVpcConnection setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CatalogVpcConnection setThriftUri(String thriftUri) {
        this.thriftUri = thriftUri;
        return this;
    }
    public String getThriftUri() {
        return this.thriftUri;
    }

    public CatalogVpcConnection setVpcConnectionId(String vpcConnectionId) {
        this.vpcConnectionId = vpcConnectionId;
        return this;
    }
    public String getVpcConnectionId() {
        return this.vpcConnectionId;
    }

    public CatalogVpcConnection setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CatalogVpcConnection setZones(java.util.List<CatalogVpcConnectionZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<CatalogVpcConnectionZones> getZones() {
        return this.zones;
    }

    public static class CatalogVpcConnectionZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <strong>example:</strong>
         * <p>vsw-hp3uf6045ljdhd5zr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CatalogVpcConnectionZones build(java.util.Map<String, ?> map) throws Exception {
            CatalogVpcConnectionZones self = new CatalogVpcConnectionZones();
            return TeaModel.build(map, self);
        }

        public CatalogVpcConnectionZones setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public CatalogVpcConnectionZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CatalogVpcConnectionZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
