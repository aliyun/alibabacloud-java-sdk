// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationsRequest extends TeaModel {
    @NameInMap("IntegrationId")
    public Long integrationId;

    public static DeleteIntegrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationsRequest self = new DeleteIntegrationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationsRequest setIntegrationId(Long integrationId) {
        this.integrationId = integrationId;
        return this;
    }
    public Long getIntegrationId() {
        return this.integrationId;
    }

}
