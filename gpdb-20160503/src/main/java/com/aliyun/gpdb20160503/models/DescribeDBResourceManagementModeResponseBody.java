// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBResourceManagementModeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource management mode. Valid values:</p>
     * <ul>
     * <li>resourceGroup: resource group management.</li>
     * <li>resourceQueue: resource queue management.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>resourceGroup</p>
     */
    @NameInMap("ResourceManagementMode")
    public String resourceManagementMode;

    public static DescribeDBResourceManagementModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceManagementModeResponseBody self = new DescribeDBResourceManagementModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceManagementModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBResourceManagementModeResponseBody setResourceManagementMode(String resourceManagementMode) {
        this.resourceManagementMode = resourceManagementMode;
        return this;
    }
    public String getResourceManagementMode() {
        return this.resourceManagementMode;
    }

}
