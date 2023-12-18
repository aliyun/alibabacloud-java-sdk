// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The version number. Set the value to 2017-11-10.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
