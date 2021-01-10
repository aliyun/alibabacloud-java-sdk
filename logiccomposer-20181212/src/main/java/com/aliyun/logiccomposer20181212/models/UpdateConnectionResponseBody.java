// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class UpdateConnectionResponseBody extends TeaModel {
    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    @NameInMap("Definition")
    public String definition;

    public static UpdateConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionResponseBody self = new UpdateConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionResponseBody setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateConnectionResponseBody setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public UpdateConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConnectionResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateConnectionResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

}
