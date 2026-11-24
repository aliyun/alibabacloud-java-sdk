// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsDatasoureRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-*******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The data source description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DatasourceDescription")
    public String datasourceDescription;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-******</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The Kafka data source information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;KafkaTopic&quot;:&quot;test-topic&quot;}</p>
     */
    @NameInMap("KafkaInfo")
    public ModifyApsDatasoureRequestKafkaInfo kafkaInfo;

    /**
     * <p>The Lakehouse ID.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VpcId&quot;:&quot;vpc-******&quot;}</p>
     */
    @NameInMap("LakehouseId")
    public ModifyApsDatasoureRequestLakehouseId lakehouseId;

    /**
     * <p>The deprecated data source information.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBMysqlInfo")
    public ModifyApsDatasoureRequestPolarDBMysqlInfo polarDBMysqlInfo;

    /**
     * <p>The deprecated data source information.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RdsMysqlInfo")
    public ModifyApsDatasoureRequestRdsMysqlInfo rdsMysqlInfo;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Simple Log Service (SLS) information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Project&quot;:&quot;example-project&quot;,&quot;Store&quot;:&quot;example-logstore&quot;,&quot;Across&quot;:false}</p>
     */
    @NameInMap("SlsInfo")
    public ModifyApsDatasoureRequestSlsInfo slsInfo;

    public static ModifyApsDatasoureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsDatasoureRequest self = new ModifyApsDatasoureRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApsDatasoureRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyApsDatasoureRequest setDatasourceDescription(String datasourceDescription) {
        this.datasourceDescription = datasourceDescription;
        return this;
    }
    public String getDatasourceDescription() {
        return this.datasourceDescription;
    }

    public ModifyApsDatasoureRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public ModifyApsDatasoureRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public ModifyApsDatasoureRequest setKafkaInfo(ModifyApsDatasoureRequestKafkaInfo kafkaInfo) {
        this.kafkaInfo = kafkaInfo;
        return this;
    }
    public ModifyApsDatasoureRequestKafkaInfo getKafkaInfo() {
        return this.kafkaInfo;
    }

    public ModifyApsDatasoureRequest setLakehouseId(ModifyApsDatasoureRequestLakehouseId lakehouseId) {
        this.lakehouseId = lakehouseId;
        return this;
    }
    public ModifyApsDatasoureRequestLakehouseId getLakehouseId() {
        return this.lakehouseId;
    }

    public ModifyApsDatasoureRequest setPolarDBMysqlInfo(ModifyApsDatasoureRequestPolarDBMysqlInfo polarDBMysqlInfo) {
        this.polarDBMysqlInfo = polarDBMysqlInfo;
        return this;
    }
    public ModifyApsDatasoureRequestPolarDBMysqlInfo getPolarDBMysqlInfo() {
        return this.polarDBMysqlInfo;
    }

    public ModifyApsDatasoureRequest setRdsMysqlInfo(ModifyApsDatasoureRequestRdsMysqlInfo rdsMysqlInfo) {
        this.rdsMysqlInfo = rdsMysqlInfo;
        return this;
    }
    public ModifyApsDatasoureRequestRdsMysqlInfo getRdsMysqlInfo() {
        return this.rdsMysqlInfo;
    }

    public ModifyApsDatasoureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApsDatasoureRequest setSlsInfo(ModifyApsDatasoureRequestSlsInfo slsInfo) {
        this.slsInfo = slsInfo;
        return this;
    }
    public ModifyApsDatasoureRequestSlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static class ModifyApsDatasoureRequestKafkaInfo extends TeaModel {
        /**
         * <p>The Kafka instance ID.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("KafkaClusterId")
        public String kafkaClusterId;

        /**
         * <p>The Kafka topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-topic</p>
         */
        @NameInMap("KafkaTopic")
        public String kafkaTopic;

        public static ModifyApsDatasoureRequestKafkaInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyApsDatasoureRequestKafkaInfo self = new ModifyApsDatasoureRequestKafkaInfo();
            return TeaModel.build(map, self);
        }

        public ModifyApsDatasoureRequestKafkaInfo setKafkaClusterId(String kafkaClusterId) {
            this.kafkaClusterId = kafkaClusterId;
            return this;
        }
        public String getKafkaClusterId() {
            return this.kafkaClusterId;
        }

        public ModifyApsDatasoureRequestKafkaInfo setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

    }

    public static class ModifyApsDatasoureRequestLakehouseId extends TeaModel {
        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-******</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch name.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-******</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        public static ModifyApsDatasoureRequestLakehouseId build(java.util.Map<String, ?> map) throws Exception {
            ModifyApsDatasoureRequestLakehouseId self = new ModifyApsDatasoureRequestLakehouseId();
            return TeaModel.build(map, self);
        }

        public ModifyApsDatasoureRequestLakehouseId setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public ModifyApsDatasoureRequestLakehouseId setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ModifyApsDatasoureRequestLakehouseId setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class ModifyApsDatasoureRequestPolarDBMysqlInfo extends TeaModel {
        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("UserName")
        public String userName;

        public static ModifyApsDatasoureRequestPolarDBMysqlInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyApsDatasoureRequestPolarDBMysqlInfo self = new ModifyApsDatasoureRequestPolarDBMysqlInfo();
            return TeaModel.build(map, self);
        }

        public ModifyApsDatasoureRequestPolarDBMysqlInfo setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public ModifyApsDatasoureRequestPolarDBMysqlInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyApsDatasoureRequestPolarDBMysqlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyApsDatasoureRequestPolarDBMysqlInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ModifyApsDatasoureRequestRdsMysqlInfo extends TeaModel {
        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("UserName")
        public String userName;

        public static ModifyApsDatasoureRequestRdsMysqlInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyApsDatasoureRequestRdsMysqlInfo self = new ModifyApsDatasoureRequestRdsMysqlInfo();
            return TeaModel.build(map, self);
        }

        public ModifyApsDatasoureRequestRdsMysqlInfo setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public ModifyApsDatasoureRequestRdsMysqlInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyApsDatasoureRequestRdsMysqlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifyApsDatasoureRequestRdsMysqlInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ModifyApsDatasoureRequestSlsInfo extends TeaModel {
        /**
         * <p>Specifies whether the resource is cross-account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The current network instance is a cross-account resource.</li>
         * <li><strong>false</strong>: The current network instance is a resource within the current account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>The cross-account role.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("AcrossRole")
        public String acrossRole;

        /**
         * <p>The cross-account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("AcrossUid")
        public String acrossUid;

        /**
         * <p>The source region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        public static ModifyApsDatasoureRequestSlsInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyApsDatasoureRequestSlsInfo self = new ModifyApsDatasoureRequestSlsInfo();
            return TeaModel.build(map, self);
        }

        public ModifyApsDatasoureRequestSlsInfo setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public ModifyApsDatasoureRequestSlsInfo setAcrossRole(String acrossRole) {
            this.acrossRole = acrossRole;
            return this;
        }
        public String getAcrossRole() {
            return this.acrossRole;
        }

        public ModifyApsDatasoureRequestSlsInfo setAcrossUid(String acrossUid) {
            this.acrossUid = acrossUid;
            return this;
        }
        public String getAcrossUid() {
            return this.acrossUid;
        }

        public ModifyApsDatasoureRequestSlsInfo setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

    }

}
