// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeLakeCacheSizeRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp10b6646l07akdt</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeLakeCacheSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakeCacheSizeRequest self = new DescribeLakeCacheSizeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLakeCacheSizeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
