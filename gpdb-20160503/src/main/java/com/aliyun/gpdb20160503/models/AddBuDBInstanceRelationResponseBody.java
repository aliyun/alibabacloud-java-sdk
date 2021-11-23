// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AddBuDBInstanceRelationResponseBody extends TeaModel {
    @NameInMap("BusinessUnit")
    public String businessUnit;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    public static AddBuDBInstanceRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBuDBInstanceRelationResponseBody self = new AddBuDBInstanceRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBuDBInstanceRelationResponseBody setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }
    public String getBusinessUnit() {
        return this.businessUnit;
    }

    public AddBuDBInstanceRelationResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public AddBuDBInstanceRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
