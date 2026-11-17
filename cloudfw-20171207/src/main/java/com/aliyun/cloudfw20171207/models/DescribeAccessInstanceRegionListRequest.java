// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceRegionListRequest extends TeaModel {
    /**
     * <p>The status of the synchronization node. This parameter is used to filter by status.</p>
     * <blockquote>
     * <p>Currently, only the &quot;created&quot; status is supported for filtering. Specifying other values (such as &quot;ready&quot;) will cause the request to fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>created</p>
     */
    @NameInMap("AccessInstanceStatus")
    public String accessInstanceStatus;

    /**
     * <p>The type of the synchronization node. Valid values:</p>
     * <ul>
     * <li><p><strong>PrivateDns</strong>: Private DNS. If this parameter is not specified, the default value is PrivateDns.</p>
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
