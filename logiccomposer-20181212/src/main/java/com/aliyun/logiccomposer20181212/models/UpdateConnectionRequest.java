// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class UpdateConnectionRequest extends TeaModel {
    @NameInMap("Connector")
    public String connector;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("ConnectionContent")
    public String connectionContent;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("ConnectionType")
    public String connectionType;

    public static UpdateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionRequest self = new UpdateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionRequest setConnector(String connector) {
        this.connector = connector;
        return this;
    }
    public String getConnector() {
        return this.connector;
    }

    public UpdateConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateConnectionRequest setConnectionContent(String connectionContent) {
        this.connectionContent = connectionContent;
        return this;
    }
    public String getConnectionContent() {
        return this.connectionContent;
    }

    public UpdateConnectionRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public UpdateConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

}
