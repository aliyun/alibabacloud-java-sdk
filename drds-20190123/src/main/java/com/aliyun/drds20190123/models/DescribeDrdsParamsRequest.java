// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsParamsRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>drds_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeDrdsParams</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The type of nodes whose parameters you want to query. Valid values:</p>
     * <ul>
     * <li><strong>INSTANCE: the instance level.</strong></li>
     * <li><strong>DB</strong>: the database level.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ParamLevel")
    public String paramLevel;

    /**
     * <p>The ID of the region where the PolarDB-X 1.0 instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsParamsRequest self = new DescribeDrdsParamsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsParamsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDrdsParamsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsParamsRequest setParamLevel(String paramLevel) {
        this.paramLevel = paramLevel;
        return this;
    }
    public String getParamLevel() {
        return this.paramLevel;
    }

    public DescribeDrdsParamsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
