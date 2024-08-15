// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEventBridgeIntegrationRequest extends TeaModel {
    /**
     * <p>Required. The ID of the EventBridge notification integration. You can call the <strong>ListEventBridgeIntegrations</strong> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteEventBridgeIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventBridgeIntegrationRequest self = new DeleteEventBridgeIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventBridgeIntegrationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
