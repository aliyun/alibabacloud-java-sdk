// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsMysqlRequest extends TeaModel {
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RoDbInstanceId")
    public String roDbInstanceId;

    public static RemoveDrdsMysqlRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsMysqlRequest self = new RemoveDrdsMysqlRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsMysqlRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public RemoveDrdsMysqlRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public RemoveDrdsMysqlRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public RemoveDrdsMysqlRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RemoveDrdsMysqlRequest setRoDbInstanceId(String roDbInstanceId) {
        this.roDbInstanceId = roDbInstanceId;
        return this;
    }
    public String getRoDbInstanceId() {
        return this.roDbInstanceId;
    }

}
