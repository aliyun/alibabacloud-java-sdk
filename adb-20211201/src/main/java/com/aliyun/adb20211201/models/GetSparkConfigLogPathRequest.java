// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkConfigLogPathRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-adsdxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkConfigLogPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkConfigLogPathRequest self = new GetSparkConfigLogPathRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkConfigLogPathRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
