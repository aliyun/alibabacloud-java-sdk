// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceRegionListRequest extends TeaModel {
    /**
     * <p>The sync node status. Used to filter by status.</p>
     * <blockquote>
     * <p>Currently, only the &quot;created&quot; status is supported for filtering. Passing other values (such as &quot;ready&quot;) causes the request to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>created</p>
     */
    @NameInMap("AccessInstanceStatus")
    public String accessInstanceStatus;

    /**
     * <p>The sync node type. Valid values:</p>
     * <ul>
     * <li><p><strong>PrivateDns</strong>: Private DNS (default value if not specified).</p>
     * </li>
     * <li><p><strong>AckClusterConnector</strong>: ACK cluster connector.</p>
     * </li>
     * </ul>
     * 
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
