// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkAppRequest extends TeaModel {
    /**
     * <p>The ID of the Spark application that you want to terminate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s202204132018hzprec1ac****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static KillSparkAppRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSparkAppRequest self = new KillSparkAppRequest();
        return TeaModel.build(map, self);
    }

    public KillSparkAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public KillSparkAppRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
