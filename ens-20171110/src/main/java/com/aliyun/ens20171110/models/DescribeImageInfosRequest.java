// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosRequest extends TeaModel {
    /**
     * <p>The operating system (OS). You can specify only one OS in a request. If you do not specify a value for this parameter, images for all supported OSs are queried. Valid values:</p>
     * <br>
     * <p>*   linux</p>
     * <p>*   windows</p>
     */
    @NameInMap("OsType")
    public String osType;

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

}
