// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppMetricsRequest extends TeaModel {
    /**
     * <p>The ID of the Spark application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202204221525hzca7d8140000003</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ggnu61d77****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkAppMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppMetricsRequest self = new GetSparkAppMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetSparkAppMetricsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
