// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterNamespacesRequest extends TeaModel {
    /**
     * <p>The ID of the ACK cluster connector. To obtain this ID, call the <a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a> operation.</p>
     * <ul>
     * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: Queries a list of ACK cluster connectors.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-7c1bad6c3cc84c33baab</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    public static DescribeAckClusterNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterNamespacesRequest self = new DescribeAckClusterNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterNamespacesRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

}
