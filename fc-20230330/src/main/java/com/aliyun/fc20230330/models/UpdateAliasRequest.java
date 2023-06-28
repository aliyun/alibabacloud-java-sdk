// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    @NameInMap("request")
    public UpdateAliasInput request;

    public static UpdateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasRequest self = new UpdateAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliasRequest setRequest(UpdateAliasInput request) {
        this.request = request;
        return this;
    }
    public UpdateAliasInput getRequest() {
        return this.request;
    }

}
