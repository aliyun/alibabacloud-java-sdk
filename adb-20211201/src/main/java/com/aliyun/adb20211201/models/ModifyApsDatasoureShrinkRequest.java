// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsDatasoureShrinkRequest extends TeaModel {
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
     * <p>The description of the data source.</p>
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
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-******</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

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
    @NameInMap("KafkaInfo")
    public String kafkaInfoShrink;

    /**
     * <p>The lakehouse ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("LakehouseId")
    public String lakehouseIdShrink;

    /**
     * <p>The retired data source.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBMysqlInfo")
    public String polarDBMysqlInfoShrink;

    /**
     * <p>The retired data source.</p>
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
     * <p>The information about Simple Log Service (SLS).</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SlsInfo")
    public String slsInfoShrink;

    public static ModifyApsDatasoureShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsDatasoureShrinkRequest self = new ModifyApsDatasoureShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApsDatasoureShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyApsDatasoureShrinkRequest setDatasourceDescription(String datasourceDescription) {
        this.datasourceDescription = datasourceDescription;
        return this;
    }
    public String getDatasourceDescription() {
        return this.datasourceDescription;
    }

    public ModifyApsDatasoureShrinkRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public ModifyApsDatasoureShrinkRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public ModifyApsDatasoureShrinkRequest setKafkaInfoShrink(String kafkaInfoShrink) {
        this.kafkaInfoShrink = kafkaInfoShrink;
        return this;
    }
    public String getKafkaInfoShrink() {
        return this.kafkaInfoShrink;
    }

    public ModifyApsDatasoureShrinkRequest setLakehouseIdShrink(String lakehouseIdShrink) {
        this.lakehouseIdShrink = lakehouseIdShrink;
        return this;
    }
    public String getLakehouseIdShrink() {
        return this.lakehouseIdShrink;
    }

    public ModifyApsDatasoureShrinkRequest setPolarDBMysqlInfoShrink(String polarDBMysqlInfoShrink) {
        this.polarDBMysqlInfoShrink = polarDBMysqlInfoShrink;
        return this;
    }
    public String getPolarDBMysqlInfoShrink() {
        return this.polarDBMysqlInfoShrink;
    }

    public ModifyApsDatasoureShrinkRequest setRdsMysqlInfoShrink(String rdsMysqlInfoShrink) {
        this.rdsMysqlInfoShrink = rdsMysqlInfoShrink;
        return this;
    }
    public String getRdsMysqlInfoShrink() {
        return this.rdsMysqlInfoShrink;
    }

    public ModifyApsDatasoureShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApsDatasoureShrinkRequest setSlsInfoShrink(String slsInfoShrink) {
        this.slsInfoShrink = slsInfoShrink;
        return this;
    }
    public String getSlsInfoShrink() {
        return this.slsInfoShrink;
    }

}
