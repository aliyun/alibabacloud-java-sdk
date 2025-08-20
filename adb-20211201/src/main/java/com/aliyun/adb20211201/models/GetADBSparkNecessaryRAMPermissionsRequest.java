// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetADBSparkNecessaryRAMPermissionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetADBSparkNecessaryRAMPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetADBSparkNecessaryRAMPermissionsRequest self = new GetADBSparkNecessaryRAMPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public GetADBSparkNecessaryRAMPermissionsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
