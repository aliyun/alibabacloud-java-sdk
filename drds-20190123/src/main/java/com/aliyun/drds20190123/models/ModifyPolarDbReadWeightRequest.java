// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ModifyPolarDbReadWeightRequest extends TeaModel {
    /**
     * <p>Polar cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The node list in the destination apsaradb for PolarDB cluster. The nodes in each cluster are separated with commas (,) and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-<strong><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></strong>:pi-****************</p>
     */
    @NameInMap("DbNodeIds")
    public String dbNodeIds;

    /**
     * <p>The ID of a DRDS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The weight of the PolarDB cluster. Separate multiple weights with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14,86</p>
     */
    @NameInMap("Weights")
    public String weights;

    public static ModifyPolarDbReadWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarDbReadWeightRequest self = new ModifyPolarDbReadWeightRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolarDbReadWeightRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
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

    public ModifyPolarDbReadWeightRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ModifyPolarDbReadWeightRequest setWeights(String weights) {
        this.weights = weights;
        return this;
    }
    public String getWeights() {
        return this.weights;
    }

}
