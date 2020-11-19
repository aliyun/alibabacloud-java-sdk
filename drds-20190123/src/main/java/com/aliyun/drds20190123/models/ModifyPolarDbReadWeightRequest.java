// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyPolarDbReadWeightRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("DbNodeIds")
    @Validation(required = true)
    public String dbNodeIds;

    @NameInMap("DbInstanceId")
    @Validation(required = true)
    public String dbInstanceId;

    @NameInMap("Weights")
    @Validation(required = true)
    public String weights;

    public static ModifyPolarDbReadWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarDbReadWeightRequest self = new ModifyPolarDbReadWeightRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolarDbReadWeightRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyPolarDbReadWeightRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyPolarDbReadWeightRequest setDbNodeIds(String dbNodeIds) {
        this.dbNodeIds = dbNodeIds;
        return this;
    }
    public String getDbNodeIds() {
        return this.dbNodeIds;
    }

    public ModifyPolarDbReadWeightRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyPolarDbReadWeightRequest setWeights(String weights) {
        this.weights = weights;
        return this;
    }
    public String getWeights() {
        return this.weights;
    }

}
