// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("QueryId")
    public String queryId;

    public static DescribeSQLLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRequest self = new DescribeSQLLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
