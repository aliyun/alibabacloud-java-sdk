// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecRequest extends TeaModel {
    /**
     * <p>The version number.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecRequest self = new DescribeInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
