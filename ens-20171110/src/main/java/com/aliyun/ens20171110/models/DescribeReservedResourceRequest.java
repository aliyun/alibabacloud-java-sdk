// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeReservedResourceRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    public static DescribeReservedResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedResourceRequest self = new DescribeReservedResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReservedResourceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
