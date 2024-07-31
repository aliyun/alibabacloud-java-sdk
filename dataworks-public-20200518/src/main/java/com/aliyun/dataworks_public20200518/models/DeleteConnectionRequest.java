// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteConnectionRequest extends TeaModel {
    /**
     * <p>The data source ID. You can call the <a href="https://help.aliyun.com/document_detail/173911.html">ListConnection</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectionId")
    public Long connectionId;

    public static DeleteConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionRequest self = new DeleteConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnectionRequest setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public Long getConnectionId() {
        return this.connectionId;
    }

}
