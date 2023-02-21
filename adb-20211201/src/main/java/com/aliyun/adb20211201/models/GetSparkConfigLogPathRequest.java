// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkConfigLogPathRequest extends TeaModel {
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
