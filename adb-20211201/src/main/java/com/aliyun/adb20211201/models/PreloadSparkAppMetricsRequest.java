// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class PreloadSparkAppMetricsRequest extends TeaModel {
    /**
     * <p>The Spark application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202204221525hzca7d8140000003</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1mfe9qmsw1dzyg</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static PreloadSparkAppMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadSparkAppMetricsRequest self = new PreloadSparkAppMetricsRequest();
        return TeaModel.build(map, self);
    }

    public PreloadSparkAppMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PreloadSparkAppMetricsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
