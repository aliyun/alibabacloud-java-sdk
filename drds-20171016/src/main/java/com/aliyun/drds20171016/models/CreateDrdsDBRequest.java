// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateDrdsDBRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("Encode")
    public String encode;

    @NameInMap("Password")
    public String password;

    @NameInMap("RdsInstances")
    public String rdsInstances;

    public static CreateDrdsDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBRequest self = new CreateDrdsDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDrdsDBRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateDrdsDBRequest setEncode(String encode) {
        this.encode = encode;
        return this;
    }
    public String getEncode() {
        return this.encode;
    }

    public CreateDrdsDBRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDrdsDBRequest setRdsInstances(String rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public String getRdsInstances() {
        return this.rdsInstances;
    }

}
