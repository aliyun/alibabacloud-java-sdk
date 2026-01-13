// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribePrivateRAGServiceRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> Interface to query the details of all AnalyticDB PostgreSQL Instances in the target region, including Instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribePrivateRAGServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateRAGServiceRequest self = new DescribePrivateRAGServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrivateRAGServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
