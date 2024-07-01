// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkDefinitionsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-clusterxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkDefinitionsRequest self = new GetSparkDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkDefinitionsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
