// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The states of clusters. Valid values:</p>
     * <br>
     * <p>*   **Preparing**: The cluster is being prepared.</p>
     * <p>*   **Creating**: The cluster is being created.</p>
     * <p>*   **Restoring**: The cluster is being restored from a backup.</p>
     * <p>*   **Running**: The cluster is running.</p>
     * <p>*   **Deleting**: The cluster is being deleted.</p>
     * <p>*   **ClassChanging**: The cluster configurations are being changed.</p>
     * <p>*   **NetAddressCreating**: A network connection is being created.</p>
     * <p>*   **NetAddressDeleting**: A network connection is being released.</p>
     * <p>*   **NetAddressModifying**: A network connection is being modified.</p>
     * <p>*   **EngineVersionUpgrading**: The engine version is being updated.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    public static DescribeDBClusterStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStatusResponseBody self = new DescribeDBClusterStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterStatusResponseBody setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
