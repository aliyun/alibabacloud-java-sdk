// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsDatasoureShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-xxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information about the Databricks data source.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DatabricksInfo")
    public String databricksInfoShrink;

    /**
     * <p>The description of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("DatasourceDescription")
    public String datasourceDescription;

    /**
     * <p>The name of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-******</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The type of the data source.</p>
     * <p>This parameter is required.</p>
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
    public String hiveInfoShrink;

    /**
     * <p>The information about the source Apache Kafka instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("KafkaInfo")
    public String kafkaInfoShrink;

    /**
     * <p>The mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ALI_CLOUD_INSTANCE</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The information about the source PolarDB for MySQL cluster.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBMysqlInfo")
    public String polarDBMysqlInfoShrink;

    /**
     * <p>The information about the source PolarDB-X instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBXInfo")
    public String polarDBXInfoShrink;

    /**
     * <p>The information about the source ApsaraDB RDS for MySQL instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RdsMysqlInfo")
    public String rdsMysqlInfoShrink;

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
     * <p>The information about the source Simple Log Service (SLS) instance or cluster.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SlsInfo")
    public String slsInfoShrink;

    public static CreateApsDatasoureShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsDatasoureShrinkRequest self = new CreateApsDatasoureShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsDatasoureShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsDatasoureShrinkRequest setDatabricksInfoShrink(String databricksInfoShrink) {
        this.databricksInfoShrink = databricksInfoShrink;
        return this;
    }
    public String getDatabricksInfoShrink() {
        return this.databricksInfoShrink;
    }

    public CreateApsDatasoureShrinkRequest setDatasourceDescription(String datasourceDescription) {
        this.datasourceDescription = datasourceDescription;
        return this;
    }
    public String getDatasourceDescription() {
        return this.datasourceDescription;
    }

    public CreateApsDatasoureShrinkRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public CreateApsDatasoureShrinkRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateApsDatasoureShrinkRequest setHiveInfoShrink(String hiveInfoShrink) {
        this.hiveInfoShrink = hiveInfoShrink;
        return this;
    }
    public String getHiveInfoShrink() {
        return this.hiveInfoShrink;
    }

    public CreateApsDatasoureShrinkRequest setKafkaInfoShrink(String kafkaInfoShrink) {
        this.kafkaInfoShrink = kafkaInfoShrink;
        return this;
    }
    public String getKafkaInfoShrink() {
        return this.kafkaInfoShrink;
    }

    public CreateApsDatasoureShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateApsDatasoureShrinkRequest setPolarDBMysqlInfoShrink(String polarDBMysqlInfoShrink) {
        this.polarDBMysqlInfoShrink = polarDBMysqlInfoShrink;
        return this;
    }
    public String getPolarDBMysqlInfoShrink() {
        return this.polarDBMysqlInfoShrink;
    }

    public CreateApsDatasoureShrinkRequest setPolarDBXInfoShrink(String polarDBXInfoShrink) {
        this.polarDBXInfoShrink = polarDBXInfoShrink;
        return this;
    }
    public String getPolarDBXInfoShrink() {
        return this.polarDBXInfoShrink;
    }

    public CreateApsDatasoureShrinkRequest setRdsMysqlInfoShrink(String rdsMysqlInfoShrink) {
        this.rdsMysqlInfoShrink = rdsMysqlInfoShrink;
        return this;
    }
    public String getRdsMysqlInfoShrink() {
        return this.rdsMysqlInfoShrink;
    }

    public CreateApsDatasoureShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsDatasoureShrinkRequest setSlsInfoShrink(String slsInfoShrink) {
        this.slsInfoShrink = slsInfoShrink;
        return this;
    }
    public String getSlsInfoShrink() {
        return this.slsInfoShrink;
    }

}
