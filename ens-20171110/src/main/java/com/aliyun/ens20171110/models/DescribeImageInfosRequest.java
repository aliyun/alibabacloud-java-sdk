// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageInfosRequest extends TeaModel {
    /**
     * <p>The operating system type. Only a single type can be specified. If this parameter is not specified, all types are queried.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Linux</p>
     * </li>
     * <li><p>windows</p>
     * </li>
     * </ul>
     * <p>In practice, passing linux or Linux may return an empty list, whereas omitting this parameter can return images with an OSType of linux. Verify the actual results before relying on this filter.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
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
