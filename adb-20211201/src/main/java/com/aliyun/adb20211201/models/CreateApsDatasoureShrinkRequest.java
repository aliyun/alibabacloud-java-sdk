// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsDatasoureShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-xxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DatabricksInfo")
    public String databricksInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("DatasourceDescription")
    public String datasourceDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-******</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KAFKA</p>
     */
    @NameInMap("DatasourceType")
    public String datasourceType;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("HiveInfo")
    public String hiveInfoShrink;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("KafkaInfo")
    public String kafkaInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>ALI_CLOUD_INSTANCE</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBMysqlInfo")
    public String polarDBMysqlInfoShrink;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBXInfo")
    public String polarDBXInfoShrink;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RdsMysqlInfo")
    public String rdsMysqlInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
