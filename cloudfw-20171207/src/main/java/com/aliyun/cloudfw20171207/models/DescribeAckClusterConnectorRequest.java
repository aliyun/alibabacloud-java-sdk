// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAckClusterConnectorRequest extends TeaModel {
    /**
     * <p>The ID of the ACK cluster connector. You can call the following API operation to obtain the value:</p>
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

    /**
     * <p>The language in which the error cause for the health status of the ACK cluster connector is displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeAckClusterConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckClusterConnectorRequest self = new DescribeAckClusterConnectorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAckClusterConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public DescribeAckClusterConnectorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
