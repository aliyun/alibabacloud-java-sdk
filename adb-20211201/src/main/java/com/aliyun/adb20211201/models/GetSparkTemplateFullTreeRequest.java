// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFullTreeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkTemplateFullTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFullTreeRequest self = new GetSparkTemplateFullTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFullTreeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
