// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The query ID. It is a unique identifier of the query.</p>
     * <br>
     * <p>> You can call the [DescribeDiagnosisRecords](https://help.aliyun.com/document_detail/450511.html) operation to obtain query IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
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
