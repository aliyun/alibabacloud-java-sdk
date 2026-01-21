// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRegionResourceTypeAutoEnableResponseBody extends TeaModel {
    @NameInMap("RegionResourceAutoEnable")
    public java.util.Map<String, java.util.Map<String, ?>> regionResourceAutoEnable;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionResourceTypeAutoEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResourceTypeAutoEnableResponseBody self = new DescribeRegionResourceTypeAutoEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResourceTypeAutoEnableResponseBody setRegionResourceAutoEnable(java.util.Map<String, java.util.Map<String, ?>> regionResourceAutoEnable) {
        this.regionResourceAutoEnable = regionResourceAutoEnable;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getRegionResourceAutoEnable() {
        return this.regionResourceAutoEnable;
    }

    public DescribeRegionResourceTypeAutoEnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
