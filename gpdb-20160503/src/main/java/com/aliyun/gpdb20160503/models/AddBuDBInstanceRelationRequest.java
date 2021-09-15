// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AddBuDBInstanceRelationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("BusinessUnit")
    public String businessUnit;

    public static AddBuDBInstanceRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBuDBInstanceRelationRequest self = new AddBuDBInstanceRelationRequest();
        return TeaModel.build(map, self);
    }

    public AddBuDBInstanceRelationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddBuDBInstanceRelationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AddBuDBInstanceRelationRequest setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }
    public String getBusinessUnit() {
        return this.businessUnit;
    }

}
