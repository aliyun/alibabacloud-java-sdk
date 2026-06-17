// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingDataSourceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp10g78o9807yv9h3</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public Integer dataSourceId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteStreamingDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingDataSourceRequest self = new DeleteStreamingDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteStreamingDataSourceRequest setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteStreamingDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
