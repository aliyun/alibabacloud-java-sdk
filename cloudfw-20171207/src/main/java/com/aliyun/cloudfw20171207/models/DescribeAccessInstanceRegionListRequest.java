// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceRegionListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("AccessInstanceStatus")
    public String accessInstanceStatus;

    /**
     * <strong>example:</strong>
     * <p>AckClusterConnector</p>
     */
    @NameInMap("AccessInstanceType")
    public String accessInstanceType;

    public static DescribeAccessInstanceRegionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceRegionListRequest self = new DescribeAccessInstanceRegionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceRegionListRequest setAccessInstanceStatus(String accessInstanceStatus) {
        this.accessInstanceStatus = accessInstanceStatus;
        return this;
    }
    public String getAccessInstanceStatus() {
        return this.accessInstanceStatus;
    }

    public DescribeAccessInstanceRegionListRequest setAccessInstanceType(String accessInstanceType) {
        this.accessInstanceType = accessInstanceType;
        return this;
    }
    public String getAccessInstanceType() {
        return this.accessInstanceType;
    }

}
