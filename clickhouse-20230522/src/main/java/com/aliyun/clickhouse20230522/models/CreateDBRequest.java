// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateDBRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBRequest self = new CreateDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDBRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
