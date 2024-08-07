// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class LoadSampleDataSetRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2ze0z517o1mgp66a</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static LoadSampleDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadSampleDataSetRequest self = new LoadSampleDataSetRequest();
        return TeaModel.build(map, self);
    }

    public LoadSampleDataSetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
