// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkWarehouseBatchSQLRequest extends TeaModel {
    /**
     * <p>The client name for auxiliary logging. The value is a meaningful string of up to 16 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>DMS</p>
     */
    @NameInMap("Agency")
    public String agency;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6485635f***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The execution ID of the Spark SQL statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sq2024123*****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static GetSparkWarehouseBatchSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkWarehouseBatchSQLRequest self = new GetSparkWarehouseBatchSQLRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkWarehouseBatchSQLRequest setAgency(String agency) {
        this.agency = agency;
        return this;
    }
    public String getAgency() {
        return this.agency;
    }

    public GetSparkWarehouseBatchSQLRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetSparkWarehouseBatchSQLRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
