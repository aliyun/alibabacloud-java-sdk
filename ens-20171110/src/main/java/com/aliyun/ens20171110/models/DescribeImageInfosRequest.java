// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosRequest extends TeaModel {
    @NameInMap("OsType")
    public String osType;

    @NameInMap("Version")
    public String version;

    public static DescribeImageInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfosRequest self = new DescribeImageInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfosRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeImageInfosRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
