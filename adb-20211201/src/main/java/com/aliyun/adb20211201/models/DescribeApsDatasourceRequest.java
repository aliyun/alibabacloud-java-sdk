// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsDatasourceRequest extends TeaModel {
    /**
     * <p>The ADB instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-*******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeApsDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsDatasourceRequest self = new DescribeApsDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApsDatasourceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApsDatasourceRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    public DescribeApsDatasourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
