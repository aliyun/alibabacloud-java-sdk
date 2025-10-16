// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceRegionListResponseBody extends TeaModel {
    @NameInMap("RegionNoList")
    public java.util.List<String> regionNoList;

    /**
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccessInstanceRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceRegionListResponseBody self = new DescribeAccessInstanceRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceRegionListResponseBody setRegionNoList(java.util.List<String> regionNoList) {
        this.regionNoList = regionNoList;
        return this;
    }
    public java.util.List<String> getRegionNoList() {
        return this.regionNoList;
    }

    public DescribeAccessInstanceRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
