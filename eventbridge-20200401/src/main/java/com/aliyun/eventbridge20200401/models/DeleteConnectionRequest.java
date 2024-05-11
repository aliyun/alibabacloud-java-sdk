// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteConnectionRequest extends TeaModel {
    /**
     * <p>The name of the connection that you want to delete.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    public static DeleteConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionRequest self = new DeleteConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

}
