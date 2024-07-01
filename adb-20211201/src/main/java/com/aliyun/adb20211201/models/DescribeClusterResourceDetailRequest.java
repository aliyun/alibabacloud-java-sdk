// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterResourceDetailRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1jj9xqft1po****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeClusterResourceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourceDetailRequest self = new DescribeClusterResourceDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourceDetailRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
