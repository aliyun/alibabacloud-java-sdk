// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The performance metric that you want to query. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>node_master_status,node_master_connection_status,node_segment_connection_status,node_segment_disk_status</p>
     */
    @NameInMap("Key")
    public String key;

    public static DescribeHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusRequest self = new DescribeHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeHealthStatusRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
