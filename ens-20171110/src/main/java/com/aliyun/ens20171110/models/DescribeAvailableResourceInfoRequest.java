// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceInfoRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    public static DescribeAvailableResourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceInfoRequest self = new DescribeAvailableResourceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceInfoRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
