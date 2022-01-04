// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRdsDBInstanceAttributeRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static GetRdsDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRdsDBInstanceAttributeRequest self = new GetRdsDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetRdsDBInstanceAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
