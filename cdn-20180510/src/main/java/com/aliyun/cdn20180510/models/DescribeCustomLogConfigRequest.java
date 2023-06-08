// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomLogConfigRequest extends TeaModel {
    /**
     * <p>The ID of the custom configuration.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    public static DescribeCustomLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLogConfigRequest self = new DescribeCustomLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLogConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

}
