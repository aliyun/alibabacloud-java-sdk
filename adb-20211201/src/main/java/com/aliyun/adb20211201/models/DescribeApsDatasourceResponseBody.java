// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsDatasourceResponseBody extends TeaModel {
    /**
     * <p>The queried APS data source.</p>
     */
    @NameInMap("ApsDatasource")
    public DescribeApsDatasourceResponseBodyApsDatasource apsDatasource;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>******-<strong>D8-5</strong><em>-A</em>**-****587</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApsDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsDatasourceResponseBody self = new DescribeApsDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsDatasourceResponseBody setApsDatasource(DescribeApsDatasourceResponseBodyApsDatasource apsDatasource) {
        this.apsDatasource = apsDatasource;
        return this;
    }
    public DescribeApsDatasourceResponseBodyApsDatasource getApsDatasource() {
        return this.apsDatasource;
    }

    public DescribeApsDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo extends TeaModel {
        /**
         * <p>The token that is used to access Databricks.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("accessToken")
        public String accessToken;

        /**
         * <p>The URL of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("workspaceURL")
        public String workspaceURL;

        public static DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo self = new DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo setWorkspaceURL(String workspaceURL) {
            this.workspaceURL = workspaceURL;
            return this;
        }
        public String getWorkspaceURL() {
            return this.workspaceURL;
        }

    }

    public static class DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo extends TeaModel {
        /**
         * <p>The ID of the E-MapReduce (EMR) cluster.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("EmrClusterId")
        public String emrClusterId;

        /**
         * <p>The URL of the Hive Metastore.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MetaStoreUri")
        public String metaStoreUri;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-******</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-******</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        public static DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo self = new DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo setEmrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo setMetaStoreUri(String metaStoreUri) {
            this.metaStoreUri = metaStoreUri;
            return this;
        }
        public String getMetaStoreUri() {
            return this.metaStoreUri;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo extends TeaModel {
        /**
         * <p>The ID of the Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("KafkaClusterId")
        public String kafkaClusterId;

        /**
         * <p>The topic of the Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;value\&quot;: \&quot;hongxian_test\&quot;}]</p>
         */
        @NameInMap("KafkaTopic")
        public String kafkaTopic;

        public static DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo self = new DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo setKafkaClusterId(String kafkaClusterId) {
            this.kafkaClusterId = kafkaClusterId;
            return this;
        }
        public String getKafkaClusterId() {
            return this.kafkaClusterId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

    }

    public static class DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo extends TeaModel {
        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AcrossRole")
        public String acrossRole;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AcrossUid")
        public String acrossUid;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo self = new DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setAcrossRole(String acrossRole) {
            this.acrossRole = acrossRole;
            return this;
        }
        public String getAcrossRole() {
            return this.acrossRole;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setAcrossUid(String acrossUid) {
            this.acrossUid = acrossUid;
            return this;
        }
        public String getAcrossUid() {
            return this.acrossUid;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo extends TeaModel {
        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo self = new DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo extends TeaModel {
        /**
         * <p>Indicates whether the data source is a cross-account resource. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>The name of the cross-account role.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The name of the SLS project.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The name of the SLS Logstore.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Store")
        public String store;

        public static DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo self = new DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo setAcrossRole(String acrossRole) {
            this.acrossRole = acrossRole;
            return this;
        }
        public String getAcrossRole() {
            return this.acrossRole;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo setAcrossUid(String acrossUid) {
            this.acrossUid = acrossUid;
            return this;
        }
        public String getAcrossUid() {
            return this.acrossUid;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo setStore(String store) {
            this.store = store;
            return this;
        }
        public String getStore() {
            return this.store;
        }

    }

    public static class DescribeApsDatasourceResponseBodyApsDatasource extends TeaModel {
        /**
         * <p>The time when the data source was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-12T15:03:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-******</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The information about Databricks.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DatabricksInfo")
        public DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo databricksInfo;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceDescription")
        public String datasourceDescription;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-2024***</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>KAFKA</p>
         */
        @NameInMap("DatasourceType")
        public String datasourceType;

        /**
         * <p>The information about the Hive data source.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("HiveInfo")
        public DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo hiveInfo;

        /**
         * <p>The information about the Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("KafkaInfo")
        public DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo kafkaInfo;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PolarDBMysqlInfo")
        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo polarDBMysqlInfo;

        /**
         * <p>The parameter is no longer supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RdsMysqlInfo")
        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo rdsMysqlInfo;

        /**
         * <p>The Simple Log Service (SLS) project.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("SlsInfo")
        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo slsInfo;

        public static DescribeApsDatasourceResponseBodyApsDatasource build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourceResponseBodyApsDatasource self = new DescribeApsDatasourceResponseBodyApsDatasource();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setDatabricksInfo(DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo databricksInfo) {
            this.databricksInfo = databricksInfo;
            return this;
        }
        public DescribeApsDatasourceResponseBodyApsDatasourceDatabricksInfo getDatabricksInfo() {
            return this.databricksInfo;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setDatasourceDescription(String datasourceDescription) {
            this.datasourceDescription = datasourceDescription;
            return this;
        }
        public String getDatasourceDescription() {
            return this.datasourceDescription;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setHiveInfo(DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo hiveInfo) {
            this.hiveInfo = hiveInfo;
            return this;
        }
        public DescribeApsDatasourceResponseBodyApsDatasourceHiveInfo getHiveInfo() {
            return this.hiveInfo;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setKafkaInfo(DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo kafkaInfo) {
            this.kafkaInfo = kafkaInfo;
            return this;
        }
        public DescribeApsDatasourceResponseBodyApsDatasourceKafkaInfo getKafkaInfo() {
            return this.kafkaInfo;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setPolarDBMysqlInfo(DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo polarDBMysqlInfo) {
            this.polarDBMysqlInfo = polarDBMysqlInfo;
            return this;
        }
        public DescribeApsDatasourceResponseBodyApsDatasourcePolarDBMysqlInfo getPolarDBMysqlInfo() {
            return this.polarDBMysqlInfo;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setRdsMysqlInfo(DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo rdsMysqlInfo) {
            this.rdsMysqlInfo = rdsMysqlInfo;
            return this;
        }
        public DescribeApsDatasourceResponseBodyApsDatasourceRdsMysqlInfo getRdsMysqlInfo() {
            return this.rdsMysqlInfo;
        }

        public DescribeApsDatasourceResponseBodyApsDatasource setSlsInfo(DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo slsInfo) {
            this.slsInfo = slsInfo;
            return this;
        }
        public DescribeApsDatasourceResponseBodyApsDatasourceSlsInfo getSlsInfo() {
            return this.slsInfo;
        }

    }

}
