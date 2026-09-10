// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddMetaDataComponentRequest extends TeaModel {
    /**
     * <p>The data source category. Valid values: DATASET, WORKFLOW, ENGINE.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("categoryType")
    public String categoryType;

    /**
     * <p>The role of the data source in the migration pipeline. Valid values:</p>
     * <ul>
     * <li>0: source.</li>
     * <li>1: destination.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("componentType")
    public Integer componentType;

    /**
     * <p>The datasource config.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;endpoint&quot;:&quot;...&quot;,&quot;token&quot;:&quot;******&quot;}</p>
     */
    @NameInMap("dsConfig")
    public String dsConfig;

    /**
     * <p>The description of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>Data source description</p>
     */
    @NameInMap("dsDesc")
    public String dsDesc;

    /**
     * <p>The external ID of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>290</p>
     */
    @NameInMap("dsId")
    public String dsId;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>test_ds318_hangzhou_0428</p>
     */
    @NameInMap("dsName")
    public String dsName;

    /**
     * <p>The connectivity status of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dsStatus")
    public Integer dsStatus;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("dsType")
    public String dsType;

    /**
     * <p>The version of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>3.2.0</p>
     */
    @NameInMap("dsVersion")
    public String dsVersion;

    public static AddMetaDataComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMetaDataComponentRequest self = new AddMetaDataComponentRequest();
        return TeaModel.build(map, self);
    }

    public AddMetaDataComponentRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public AddMetaDataComponentRequest setComponentType(Integer componentType) {
        this.componentType = componentType;
        return this;
    }
    public Integer getComponentType() {
        return this.componentType;
    }

    public AddMetaDataComponentRequest setDsConfig(String dsConfig) {
        this.dsConfig = dsConfig;
        return this;
    }
    public String getDsConfig() {
        return this.dsConfig;
    }

    public AddMetaDataComponentRequest setDsDesc(String dsDesc) {
        this.dsDesc = dsDesc;
        return this;
    }
    public String getDsDesc() {
        return this.dsDesc;
    }

    public AddMetaDataComponentRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public AddMetaDataComponentRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public AddMetaDataComponentRequest setDsStatus(Integer dsStatus) {
        this.dsStatus = dsStatus;
        return this;
    }
    public Integer getDsStatus() {
        return this.dsStatus;
    }

    public AddMetaDataComponentRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public AddMetaDataComponentRequest setDsVersion(String dsVersion) {
        this.dsVersion = dsVersion;
        return this;
    }
    public String getDsVersion() {
        return this.dsVersion;
    }

}
