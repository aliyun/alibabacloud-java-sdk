// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetConnectionRequest extends TeaModel {
    /**
     * <p>The connection name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    public static GetConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionRequest self = new GetConnectionRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

}
