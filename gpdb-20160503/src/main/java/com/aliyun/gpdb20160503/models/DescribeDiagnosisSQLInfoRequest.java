// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adbtest</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The query ID. It is a unique identifier of the query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/450511.html">DescribeDiagnosisRecords</a> operation to obtain query IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>71403480878****</p>
     */
    @NameInMap("QueryID")
    public String queryID;

    public static DescribeDiagnosisSQLInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSQLInfoRequest self = new DescribeDiagnosisSQLInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSQLInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDiagnosisSQLInfoRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDiagnosisSQLInfoRequest setQueryID(String queryID) {
        this.queryID = queryID;
        return this;
    }
    public String getQueryID() {
        return this.queryID;
    }

}
