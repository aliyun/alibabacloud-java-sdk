// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckSampleDataSetRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9r8f67h4cqz41u</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static CheckSampleDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSampleDataSetRequest self = new CheckSampleDataSetRequest();
        return TeaModel.build(map, self);
    }

    public CheckSampleDataSetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
