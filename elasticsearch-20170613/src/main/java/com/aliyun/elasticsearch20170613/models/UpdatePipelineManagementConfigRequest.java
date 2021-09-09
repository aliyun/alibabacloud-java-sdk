// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelineManagementConfigRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdatePipelineManagementConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineManagementConfigRequest self = new UpdatePipelineManagementConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineManagementConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
