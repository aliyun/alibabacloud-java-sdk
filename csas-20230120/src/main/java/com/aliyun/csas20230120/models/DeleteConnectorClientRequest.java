// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteConnectorClientRequest extends TeaModel {
    /**
     * <p>The connector ID. You can call <a href="~~ListConnectors~~">ListConnectors</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-94db94e06b98****</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The unique identifier of the ConnectorClient device. You can call <a href="~~ListConnectors~~">ListConnectors</a> to obtain the identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E4BD65C4-58F6-5127-AD2F-319CF020F549</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    public static DeleteConnectorClientRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectorClientRequest self = new DeleteConnectorClientRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnectorClientRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public DeleteConnectorClientRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

}
