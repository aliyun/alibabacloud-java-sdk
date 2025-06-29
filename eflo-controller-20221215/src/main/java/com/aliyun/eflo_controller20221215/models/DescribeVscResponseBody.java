// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeVscResponseBody extends TeaModel {
    /**
     * <p>The ID of the compute node in which the VSC resides.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-kvw44e6dn04</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2k3rqlvv6ytq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The VSC status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>Normal</li>
     * <li>Deleting</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The VSC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-001</p>
     */
    @NameInMap("VscId")
    public String vscId;

    /**
     * <p>The custom name of the VSC.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("VscName")
    public String vscName;

    /**
     * <p>The VSC type.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("VscType")
    public String vscType;

    public static DescribeVscResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscResponseBody self = new DescribeVscResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVscResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeVscResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVscResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVscResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVscResponseBody setVscId(String vscId) {
        this.vscId = vscId;
        return this;
    }
    public String getVscId() {
        return this.vscId;
    }

    public DescribeVscResponseBody setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public DescribeVscResponseBody setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

}
