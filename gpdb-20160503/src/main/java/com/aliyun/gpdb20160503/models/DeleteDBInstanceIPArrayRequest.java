// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceIPArrayRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the IP whitelist group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testarray</p>
     */
    @NameInMap("IPArrayName")
    public String IPArrayName;

    public static DeleteDBInstanceIPArrayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceIPArrayRequest self = new DeleteDBInstanceIPArrayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceIPArrayRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBInstanceIPArrayRequest setIPArrayName(String IPArrayName) {
        this.IPArrayName = IPArrayName;
        return this;
    }
    public String getIPArrayName() {
        return this.IPArrayName;
    }

}
