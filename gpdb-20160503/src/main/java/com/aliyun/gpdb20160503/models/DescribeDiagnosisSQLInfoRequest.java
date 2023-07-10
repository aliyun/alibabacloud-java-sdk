// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The ID of the query. It is a unique identifier of the query.</p>
     * <br>
     * <p>>  You can call the [DescribeDiagnosisRecords](~~450511~~) operation to query the query ID.</p>
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
