// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyRdsReadWeightRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("InstanceNames")
    @Validation(required = true)
    public String instanceNames;

    @NameInMap("Weights")
    @Validation(required = true)
    public String weights;

    public static ModifyRdsReadWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRdsReadWeightRequest self = new ModifyRdsReadWeightRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRdsReadWeightRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyRdsReadWeightRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyRdsReadWeightRequest setInstanceNames(String instanceNames) {
        this.instanceNames = instanceNames;
        return this;
    }
    public String getInstanceNames() {
        return this.instanceNames;
    }

    public ModifyRdsReadWeightRequest setWeights(String weights) {
        this.weights = weights;
        return this;
    }
    public String getWeights() {
        return this.weights;
    }

}
