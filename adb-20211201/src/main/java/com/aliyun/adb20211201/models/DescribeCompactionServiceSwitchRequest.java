// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeCompactionServiceSwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp149vz49b36t****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeCompactionServiceSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCompactionServiceSwitchRequest self = new DescribeCompactionServiceSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCompactionServiceSwitchRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
