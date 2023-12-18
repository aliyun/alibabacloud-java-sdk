// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesRequest extends TeaModel {
    /**
     * <p>The version number. Set the value to 2017-11-10.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesRequest self = new DescribeInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
