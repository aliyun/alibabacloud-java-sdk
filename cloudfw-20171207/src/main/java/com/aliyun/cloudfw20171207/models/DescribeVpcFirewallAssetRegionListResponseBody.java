// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallAssetRegionListResponseBody extends TeaModel {
    @NameInMap("RegionNoList")
    public java.util.List<String> regionNoList;

    /**
     * <strong>example:</strong>
     * <p>00933CCB-65A4-5E51-B180-3D154281****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpcFirewallAssetRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallAssetRegionListResponseBody self = new DescribeVpcFirewallAssetRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallAssetRegionListResponseBody setRegionNoList(java.util.List<String> regionNoList) {
        this.regionNoList = regionNoList;
        return this;
    }
    public java.util.List<String> getRegionNoList() {
        return this.regionNoList;
    }

    public DescribeVpcFirewallAssetRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
