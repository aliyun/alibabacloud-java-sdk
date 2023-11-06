// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetDrdsDbRdsRelationInfoRequest extends TeaModel {
    /**
     * <p>The name of the DRDS database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static GetDrdsDbRdsRelationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDrdsDbRdsRelationInfoRequest self = new GetDrdsDbRdsRelationInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDrdsDbRdsRelationInfoRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetDrdsDbRdsRelationInfoRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
