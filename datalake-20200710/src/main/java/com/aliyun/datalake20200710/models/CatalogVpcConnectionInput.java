// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogVpcConnectionInput extends TeaModel {
    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <strong>example:</strong>
     * <p>vpc-hp356stwkxg3fn2xe****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Zones")
    public java.util.List<CatalogVpcConnectionInputZones> zones;

    public static CatalogVpcConnectionInput build(java.util.Map<String, ?> map) throws Exception {
        CatalogVpcConnectionInput self = new CatalogVpcConnectionInput();
        return TeaModel.build(map, self);
    }

    public CatalogVpcConnectionInput setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CatalogVpcConnectionInput setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CatalogVpcConnectionInput setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CatalogVpcConnectionInput setZones(java.util.List<CatalogVpcConnectionInputZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<CatalogVpcConnectionInputZones> getZones() {
        return this.zones;
    }

    public static class CatalogVpcConnectionInputZones extends TeaModel {
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

        public static CatalogVpcConnectionInputZones build(java.util.Map<String, ?> map) throws Exception {
            CatalogVpcConnectionInputZones self = new CatalogVpcConnectionInputZones();
            return TeaModel.build(map, self);
        }

        public CatalogVpcConnectionInputZones setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public CatalogVpcConnectionInputZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CatalogVpcConnectionInputZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
