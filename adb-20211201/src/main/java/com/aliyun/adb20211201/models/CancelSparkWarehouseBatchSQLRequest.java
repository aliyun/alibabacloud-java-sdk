// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSparkWarehouseBatchSQLRequest extends TeaModel {
    /**
     * <p>The name of the client, which can be up to 16 characters in length. Specify a descriptive name that makes it easy to identify.</p>
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
     * <p>The query ID of the Spark SQL statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sq202501011001s****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static CancelSparkWarehouseBatchSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkWarehouseBatchSQLRequest self = new CancelSparkWarehouseBatchSQLRequest();
        return TeaModel.build(map, self);
    }

    public CancelSparkWarehouseBatchSQLRequest setAgency(String agency) {
        this.agency = agency;
        return this;
    }
    public String getAgency() {
        return this.agency;
    }

    public CancelSparkWarehouseBatchSQLRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CancelSparkWarehouseBatchSQLRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
